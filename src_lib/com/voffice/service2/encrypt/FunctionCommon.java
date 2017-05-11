package com.voffice.service2.encrypt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//import com.viettel.util.resources.RbConfigValue;

//import vn.viettel.core.utils.CommonUtility;
//import vn.viettel.core.utils.ConstantProvider;
@PropertySources(@PropertySource("classpath:config.properties"))
public class FunctionCommon {
	public static  String STR_SESSIONID = "";
	public static  String STR_AESKEY = "";
	public static final String SPECIAL_CHARACTERS_TEMP = "àÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬđĐèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆìÌỉỈĩĨíÍịỊòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰýÝ :+\\<>\"*,!?%$=@#~[]`|^";
	public static final String REPLACEMENTS_TEMP = "aAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAaAdDeEeEeEeEeEeEeEeEeEeEeEiIiIiIiIiIoOoOoOoOoOoOoOoOoOoOoOoOoOoOoOoOoOuUuUuUuUuUuUuUuUuUuUuUyY-___\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0";
	public static char[] SPECIAL_CHARACTERS = SPECIAL_CHARACTERS_TEMP
			.toCharArray();
	public static char[] REPLACEMENTS = REPLACEMENTS_TEMP.toCharArray();
	public static final String strSpec = "áàảãạăắằẳẵặâấầẩẫậđéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúù"
			+ "ủũụưứừửữựýỳỷỹỵÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬĐÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴ";
	public static final String strRepl = "aaaaaaaaaaaaaaaaadeeeeeeeeeeeiiiiiooooooooooooooooouuuu"
			+ "uuuuuuuyyyyyAAAAAAAAAAAAAAAAADEEEEEEEEEEEIIIIIOOOOOOOOOOOOOOOOOUUUUUUUUUUUYYYYY";
	public static char[] REPLACEMENTS_URL = strRepl.toCharArray();

	//public static final String URL_WEBSERVICE = RbConfigValue.APP_CONFIG.URL_WEBSERVICE;
        // Link that
	//public static final String URL_WEBSERVICE = "http://10.60.7.120:8068/ServiceMobile_V02/resources/";
        // Link test
        public static String toUrlFriendly(String s) {
		int maxLength = Math.min(s.length(), 236);
		char[] buffer = new char[maxLength];
		int n = 0;
		for (int i = 0; i < maxLength; i++) {
			char ch = s.charAt(i);
			buffer[n] = removeAccent(ch);
			// skip not printable characters
			if (buffer[n] > 31) {
				n++;
			}
		}
		// skip trailing slashes
		while (n > 0 && buffer[n - 1] == '/') {
			n--;
		}
		return String.valueOf(buffer, 0, n);
	}

	public static char removeAccent(char ch) {
		int index = SPECIAL_CHARACTERS_TEMP.indexOf(ch);
		if (index >= 0) {
			ch = REPLACEMENTS[index];
		}
		return ch;
	}

	public static String removeAccent(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			sb.setCharAt(i, removeAccent(sb.charAt(i)));
		}
		return sb.toString();
	}

	public static char convertUnsign(char ch) {
		int index = strSpec.indexOf(ch);
		if (index >= 0) {
			ch = REPLACEMENTS_URL[index];
		}
		return ch;
	}

	public static String removeUnsign(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			sb.setCharAt(i, convertUnsign(sb.charAt(i)));
		}
		return sb.toString();
	}

	public static String escapeSql(String input) {
		String result = input.trim().replace("/", "//").replace("_", "/_")
				.replace("%", "/%");
		return result;
	}

	/**
	 * lay file size
	 * 
	 * @param filename
	 * @return
	 */
	public static long getFileSize(String filename) {
		File file = new File(filename);
		if (!file.exists() || !file.isFile()) {
			System.out.println("File doesn\'t exist");
			return -1;
		}
		return file.length();
	}

	// ket noi server voffice 2.0

	/**
	 * thuc hien ket noi va tra ve du lieu
	 * 
	 * @param urlConnet
	 * @param params
	 * @return
	 * @throws IOException
	 */
	public static String sendPostService2(String strFution,
			Map<String, Object> paramsVariable, String strAesKey,String strPublicKey) {
		return FunctionCommon.sendPostService2(strFution, paramsVariable, strAesKey, strPublicKey, null);
	}
	
	public static String sendPostService2(String strFution,
			Map<String, Object> paramsVariable, String strAesKey,String strPublicKey, String accessToken) {
		String strResult = "";
		try {

			Map<String, Object> params = new LinkedHashMap<String, Object>();
			String strDataSend;
			if (strAesKey != null) {			
				String strAesKeyEn = "";
				
				try {
					byte[] publicKey = FunctionCommon.hexStringToByteArray(strPublicKey);
					PublicKey publicKey_key = RSA.convertByteToPublicKey(publicKey);
					byte[] dataEncodeAesKey = RSA.encryptData(strAesKey,publicKey_key);
					
					strAesKeyEn = FunctionCommon.bytesToHex(dataEncodeAesKey);
				} catch (IOException e) {
					e.printStackTrace();
				}
				AES _aesEncode = new AES();	
				String[] arrKey = strAesKey.split(StringConstant.STR_VIAESKEYSPACE);
//				System.out.println("1 - arrKey[0]: " + arrKey[0]);
//				System.out.println("1 - arrKey[1]: " + arrKey[1]);
//				System.out.println("1 - origin: " + FunctionCommon.convertValueToJson(paramsVariable));
				strDataSend = _aesEncode.encrypt(FunctionCommon.convertValueToJson(paramsVariable),
							arrKey[0], arrKey[1]);
				System.out.println("2 - encrypt: " + strDataSend);
				
				//(FunctionCommon.convertValueToJson(paramsVariable));
				params.put("isSecurity", "1");
				params.put("aesKey", strAesKeyEn);
				params.put("publicRsaKey", strPublicKey);
			} else {
				strDataSend = FunctionCommon.convertValueToJson(paramsVariable);
			}

			params.put("data", strDataSend);
			
			String strUrl = strFution;
			URL url = new URL(strUrl);
			StringBuilder postData = new StringBuilder();
			for (Map.Entry<String, Object> param : params.entrySet()) {
				if (postData.length() != 0)
					postData.append('&');
				postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
				postData.append('=');
				postData.append(URLEncoder.encode(
						String.valueOf(param.getValue()), "UTF-8"));
			}
			byte[] postDataBytes = postData.toString().getBytes("UTF-8");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			conn.setRequestProperty("Content-Length",
					String.valueOf(postDataBytes.length));
			// Itsol: cache session
			if (StringUtils.isEmpty(accessToken)) {
				conn.setRequestProperty("cookie", FunctionCommon.STR_SESSIONID);
			} else {
				conn.setRequestProperty("cookie", accessToken);
			}
			conn.setDoOutput(true);
			conn.getOutputStream().write(postDataBytes);
			conn.setConnectTimeout(5000);
			int responseCode = conn.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						conn.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
				// print result
				strResult = response.toString();
			} else {
				strResult = "{\"result\":[{\"mess\":{\"codeErr\":201,\"messErr\":\"Lỗi lấy dữ liệu\"}}]}";
			}
		}catch (java.net.SocketTimeoutException e) {
			strResult = "{\"result\":[{\"mess\":{\"codeErr\":202,\"messErr\":\"Lỗi timeout service\"}}]}";
			e.printStackTrace();
		} catch (IOException e) {
			strResult = "{\"result\":[{\"mess\":{\"codeErr\":203,\"messErr\":\"Lỗi không kết nối được service\"}}]}";
			System.out.println("Loi goi service 2.0 khi lay du lieu"
					+ e.getMessage());
		}
		return strResult;
	}
	
	/**
	 * tra ve ma loi service
	 * @param dataRequestMH
	 * @return
	 */
	public static String getCodeRequestService2(String dataRequestMH) {
		String strResult = FunctionCommon.getItemInJson("result", dataRequestMH).toString();	    
		String codeErr = "205";
		if(strResult!=null){
			String mess = null;
			try {
				mess = FunctionCommon.getItemInJson("mess", strResult).toString();
			} catch (Exception e) {
				mess = FunctionCommon.getItemInJsonArray("mess", strResult).toString();
			}
			
			if(mess!=null){
				Object errorObj = FunctionCommon.getItemInJson("errorCode", mess);
				if (null == errorObj) {
					errorObj = FunctionCommon.getItemInJson("codeErr", mess);
				}
				codeErr = errorObj.toString();
			}
		}		
		return codeErr;
	}
	
	/**
	 * Tra ve du lieu tu service
	 * @param dataRequestMH
	 * @return
	 */
	public static Object getDataRequestService2ByKeyJson(String dataRequestMH,String keyResult) {
		Object strResult ="";
		JSONObject jObject = null;
		try {
			jObject = new JSONObject(dataRequestMH);
			String[] arrKey = keyResult.split("\\.");
			for (int i = 0; i < arrKey.length-1; i++) {
				String strKey = arrKey[i];
				if (strKey != null && strKey.trim().length()>0) {
					jObject = jObject.getJSONObject(strKey);
				}
			}
			strResult = jObject.get(arrKey[arrKey.length-1]);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strResult;
	}

	/**
	 * thuc hien convert du lieu truyen len server thanh dang json
	 * 
	 * @param params
	 * @return
	 */
	public static String convertValueToJson(Map<String, Object> params) {
		JSONObject json = new JSONObject();
		if (params != null) {
			for (Map.Entry<String, Object> param : params.entrySet()) {
				try {
					json.put(param.getKey(), param.getValue());
				} catch (JSONException e) {
					System.out.println("Loi goi service 2.0 khi truyen tham so"
							+ e.getMessage());
				}
			}
		}

		return json.toString();
	}

	/**
	 * lay gia tri trong doi tuong json
	 * 
	 * @param item
	 * @param strJsonData
	 * @return
	 */
	public static Object getItemInJson(String item, String strJsonData) {
		Object result = null;
		try {
			JSONObject obj = new JSONObject(strJsonData);
			result = obj.get(item);
		} catch (Exception e) {
 			System.out.println("Loi! jsonGetItem:" + e.getMessage());
		}
		return result;
	}
	
	/**
	 * lay gia tri trong doi tuong json
	 * 
	 * @param item
	 * @param strJsonData
	 * @return
	 */
	public static Object getItemInJsonArray(String item, String strJsonData) {
		Object result = null;
		try {
			JSONArray arrayJson = new JSONArray(strJsonData);
			if (arrayJson.get(0) != null) {
				result = getItemInJson(item, arrayJson.get(0).toString());
			}
		} catch (Exception e) {
 			System.out.println("Loi! jsonGetItem:" + e.getMessage());
		}
		return result;
	}

	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character
					.digit(s.charAt(i + 1), 16));
		}
		return data;
	}

	/**
	 * Convert tu bytes ra Hex
	 * 
	 * @param bytes
	 * @return
	 */
	public static String bytesToHex(byte[] bytes) {
		char[] hexArray = "0123456789ABCDEF".toCharArray();
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
	
	
	public static String byteArrayToHex(byte[] a) {
		   StringBuilder sb = new StringBuilder(a.length * 2);
		   for(byte b: a)
		      sb.append(String.format("%02x", b & 0xff));
		   return sb.toString();
	}
	
	/**
	 * tao token random
	 * @return
	 */
	public static String createTokenRandom() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        String token = bytes.toString();
        return token;
    }
}
