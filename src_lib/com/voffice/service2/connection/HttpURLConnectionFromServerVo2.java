package com.voffice.service2.connection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//import com.viettel.util.ConverterUtil;
import com.voffice.service2.encrypt.AES;
import com.voffice.service2.encrypt.FunctionCommon;
import com.voffice.service2.encrypt.StringConstant;



public class HttpURLConnectionFromServerVo2 {

	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL = "http://localhost:9090/SpringMVCExample";

	private static final String POST_URL = "http://localhost:8080/ServiceMobile_V02/resources/Authenticate/login";

	private static final String POST_PARAMS = "{\"loginName\":\"tuandn5\";\"passWord\":\"mGcVhFiM3J4ugMvaDPzRO2RHGPg=\"}";
	
    public static void main(String[] args) throws IOException {
        try {
            getRSAKeyPublic();
            login("136788", "mGcVhFiM3J4ugMvaDPzRO2RHGPg=");
            getListMission();
            
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

	private static String AESKey = "";
	private static String RSAPublicKey = "";
	private static String getRSAKeyPublic() {
		System.out.println();
		System.out.println("-------------- getRSAKeyPublic --------------");
		String result = "";
		try {
			String dataRequestMH = FunctionCommon.sendPostService2(
					"Authenticate.getRsaKeyPublic", null, null, null);
			String codeErr = FunctionCommon
					.getCodeRequestService2(dataRequestMH);
			if (codeErr.equals("200")) {
				System.out.println("getRSAKeyPublic-OK");
				// Lay key RSA thanh cong
				RSAPublicKey = FunctionCommon.getDataRequestService2ByKeyJson(dataRequestMH,"result.data.strPublicKey").toString();
				
				// Tao key Aes
				AESKey = AES.createAesKey();
//				login("197117", "mGcVhFiM3J4ugMvaDPzRO2RHGPg=");
//				login("136788", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //viettq11
//				login("giamdoc_tt", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //halt19 - TL trung tam phan mem
//				login("thuy08", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //hungnm
//				login("tuannd5", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //viettq11-beta
//				login("ducnp", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //viettq11
//				login("hanhpt3", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //chucvq
//				login("hanhpt1", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //hongntl
//				login("pdvbtd", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //hongntl
//				login("hanhpt", "mGcVhFiM3J4ugMvaDPzRO2RHGPg="); //hongntl
				
			}
		} catch (Exception e) {
			result = "";
		}
		return result;
	}
	
	private static void login(String loginName, String password) throws JSONException {
		System.out.println();
		System.out.println("----------------- Login ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("loginName", loginName);
		params.put("passWord", password);
		String strFunction = "Authenticate.login";
		String dataRequest = FunctionCommon.sendPostService2(
				strFunction, params,
				AESKey,
				RSAPublicKey);
		
		String codeErrLogin = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("Login-ErrorCode=" + codeErrLogin);
		if (codeErrLogin.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest).toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data",result).toString();
			
			AES _aes = new AES();
			String dataDecrypt = _aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
								
			String UserId = null;
			if (dataDecrypt != null) {
				UserId = FunctionCommon
						.getDataRequestService2ByKeyJson(dataDecrypt,"userId").toString();
				FunctionCommon.STR_SESSIONID = FunctionCommon
						.getDataRequestService2ByKeyJson(dataDecrypt,"strSessionId").toString();
				System.out.println("sessionId:" + FunctionCommon.STR_SESSIONID);
				
//				getTextDetail();
//				editPublicationInformation();
//				publish();
//				downloadFile();
//				countDocument();
//				getDocumentDetail();
//				search();
//				getListReceiver();
//				getListGroup();
//				searchDocLibrary();
//				getOrgPerform();
//				getListMissionGroup();
			}
		}
	}
	
	private static void getListMission() {
		
		System.out.println();
		System.out.println("----------------- getListMission ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
//		params.put("isCount", "1");
//		params.put("keyword", "tiến");
		params.put("type", "5");
		params.put("status", "8");
		params.put("startDate", "26/12/2015");
		params.put("completeDate", "25/01/2016");
		params.put("startRecord", "0");
		params.put("pageSize", "20");
		String strFunction = "missionAction.getListMission";							  
		String dataRequest = FunctionCommon.sendPostService2(
				strFunction, params,
				AESKey,
				RSAPublicKey);
		
		String codeErrLogin = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListMission-errorCode= " + codeErrLogin);
		
		if (codeErrLogin.equals("200")) {
			
			String result = FunctionCommon.getItemInJson("result", dataRequest).toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data",result).toString();
			AES _aes = new AES();
			String dataDecrypt = _aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
			System.out.println("Result: " + dataDecrypt);
		}
	}
	
	private static void getMissionDetail() {

		System.out.println();
		System.out.println("----------------- getMissionDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("missionId", "5267");
		String strFunction = "missionAction.getMissionDetail";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String codeErrLogin = FunctionCommon
				.getCodeRequestService2(dataRequest);
		System.out.println("getMissionDetail-errorCode=" + codeErrLogin);

		if (codeErrLogin.equals("200")) {
			
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			String dataDecrypt = _aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListFileAttachment() {

		System.out.println();
		System.out.println("----------------- getListFileAttachment ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isCount", "1");
		params.put("missionId", "3359");
		String strFunction = "missionAction.getListFileAttachment";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String codeErrLogin = FunctionCommon
				.getCodeRequestService2(dataRequest);
		System.out.println("getListFileAttachment-errorCode=" + codeErrLogin);

		if (codeErrLogin.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getMissionProcessHistory() {

		System.out.println();
		System.out.println("----------------- getMissionProcessHistory ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isCount", "0");
		params.put("missionId", "3519");
		params.put("orgType", "1");
		String strFunction = "missionAction.getMissionProcessHistory";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getMissionProcessHistory-errorCode=" + errorCode);

		if (errorCode.equals("200")) {			
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getLastMissionProcessOfSubMissions() {

		System.out.println();
		System.out.println("----------------- getLastMissionProcessOfSubMissions ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isCount", "0");
		params.put("missionId", "4959");
		String strFunction = "missionAction.getLastMissionProcessOfSubMissions";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);

		if (errorCode.equals("200")) {
			System.out.println("getLastMissionProcessOfSubMissions-OK");
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListCombinationOrg() {

		System.out.println();
		System.out.println("----------------- getListCombinationOrg ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isCount", "0");
//		params.put("missionId", "2442");
		params.put("missionId", "3462");
		String strFunction = "missionAction.getListCombinationOrg";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListCombinationOrg-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListTransferredMission() {

		System.out.println();
		System.out.println("----------------- getListTransferredMission ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isCount", "0");
		params.put("missionId", "3351");
		String strFunction = "missionAction.getListTransferredMission";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListTransferredMission-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void deleteMission() {

		System.out.println();
		System.out.println("----------------- deleteMission ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
//		params.put("isCount", "0");
		params.put("missionId", "886");
		String strFunction = "missionAction.deleteMission";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("deleteMission-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void updateMission() throws JSONException {

		System.out.println();
		System.out.println("----------------- updateMission ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("missionId", "3640");
		params.put("orgAssignId", "254921");
		params.put("assignId", "15581");
		params.put("missionName", "[Thanght6] Test sua nhiem vu 03/11");
		params.put("content", "122213213123123");
		params.put("target", "123123231");
		params.put("fieldId", "3");
		params.put("frequenceUpdate", "2");
		params.put("startDate", "02/11/2015");
		params.put("completeDate", "20/11/2015");
		JSONArray array = new JSONArray();
		JSONObject json1 = new JSONObject();
		json1.put("orgId", "148843");
//		json1.put("content", "Q\nD\nD");
		array.put(json1);
		JSONObject json2 = new JSONObject();
		json2.put("orgId", "148846");
//		json2.put("content", "E\nD\nD\nD\nX");
		array.put(json2);
		params.put("removeOrgCombinationIds", array);
		params.put("addOrgCombinationIds", (Object) new JSONArray());
		params.put("editOrgCombinationIds", (Object) new JSONArray());
		
		String strFunction = "missionAction.updateMission";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateMission-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void updateProcess() {

		System.out.println();
		System.out.println("----------------- updateProcess ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("missionId", "2780");
		params.put("status", "1");
		params.put("action", "action");
		params.put("difficult", "difficult");
		params.put("propose", "propose");
		
		String strFunction = "missionAction.updateProcess";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateProcess-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void approveOrRejectProcess() {

		System.out.println();
		System.out.println("----------------- approveOrRejectProcess ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", "1013357");
//		params.put("isOrgAssign", "1");
		params.put("isApprove", "0");
		params.put("comment", "thanght6 tu choi");
		
		String strFunction = "missionAction.approveOrRejectProcess";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateProcess-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void updateContentOrResultOfCombinationOrg() {

		System.out.println();
		System.out.println("----------------- updateContentOrResultOfCombinationOrg ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("missionId", "2898");
		params.put("orgType", "4");
		params.put("orgCombinationId", "254921");
		params.put("action", "thanght6 hoan thanh phoi hop 2");
		
		String strFunction = "missionAction.updateContentOrResultOfCombinationOrg";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateContentOrResultOfCombinationOrg-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListMeeting() {

		System.out.println();
		System.out.println("----------------- getListMeeting ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("strSearch", "");
		params.put("startRecord", "0");
		params.put("pageSize", "20");
		
		String strFunction = "Meeting.getListMeetingMinutes";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListMeeting-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getMissionByMeetingId() {

		System.out.println();
		System.out.println("----------------- getMissionByMeetingId ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("sourceId", "1026");
		params.put("startRecord", "0");
		params.put("pageSize", "20");
		
		String strFunction = "Meeting.getMissionByMeetingId";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getMissionByMeetingId-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getCountItem() {

		System.out.println();
		System.out.println("----------------- getCountDocument ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("keyword", "quy định");
		params.put("type", "2");
		
		String strFunction = "solrSearch.getCountItem";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getCountDocument-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	
	private static void getListItem() {

		System.out.println();
		System.out.println("----------------- getListItem ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("keyword", "Công văn");
		params.put("type", "2");
		params.put("startRecord", "38");
		params.put("pageSize", "10");
		
		String strFunction = "solrSearch.getListItem";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListItem-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	/**
	 * Lay danh sach cong viec ca nhan
	 */
	private static void getListTask() {

		System.out.println();
		System.out.println("----------------- getListTask ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
//		params.put("isCount", 1);
//		params.put("keyword", "");
		params.put("type", "1");
		params.put("status", "1");
		params.put("startDateTo", "16/02/2016");
		params.put("startDateFrom", "17/02/2016");
		params.put("startRecord", "0");
		params.put("pageSize", "20");
		
		String strFunction = "taskAction.getListTask";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListItem-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListTaskFromMission() {

		System.out.println();
		System.out.println("----------------- getListTaskFromMission ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("missionId", 3956);
		
		String strFunction = "taskAction.getListTaskFromMission";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListTaskFromMission-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getTaskDetail() {

		System.out.println();
		System.out.println("----------------- getTaskDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", "1014432");
		
		String strFunction = "taskAction.getTaskDetail";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getTaskDetail-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
		
	private static void updateTaskProcess() {

		System.out.println();
		System.out.println("----------------- updateTaskProcess ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", "1014201");
		params.put("status", "3");
		params.put("taskResult", "thanght6-test-2");
		params.put("completedPercent", "90");
		params.put("ratingPoint", "6");
		
		String strFunction = "taskAction.updateTaskProcess";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateTaskProcess-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListOrganizationAssign() {

		System.out.println();
		System.out.println("----------------- getListOrganizationAssign ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isFirst", "1");
		params.put("parentId", "");
//		params.put("status", "1");
		
		String strFunction = "Meeting.getListOrganizationAssign";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateTaskProcess-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListRatioConfig() {

		System.out.println();
		System.out.println("----------------- getListRatioConfig ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
//		params.put("taskId", "1012808");
		params.put("taskId", "1014592");
//		params.put("parentId", "");
//		params.put("status", "1");
		
		String strFunction = "taskAction.getListRatioConfig";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListRatioConfig-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getStatusUser() {

		System.out.println();
		System.out.println("----------------- getListRatioConfig ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", "1012808");
		
		String strFunction = "solrSearch.getStatusUser";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateTaskProcess-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getSourceTask() {

		System.out.println();
		System.out.println("----------------- getSourceTask ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", "1013281");
		
		String strFunction = "taskAction.getSourceTask";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("updateTaskProcess-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getUpdateTaskHistory() {

		System.out.println();
		System.out.println("----------------- getUpdateTaskHistory ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", "1013262");
		
		String strFunction = "taskAction.getUpdateTaskHistory";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getUpdateTaskHistory-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListTaskToAssign() {

		System.out.println();
		System.out.println("----------------- getListTaskToAssign ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
//		params.put("keyword", "1");
		params.put("orgId", "254921");
//		params.put("enforcementId", "3");
//		params.put("startRecord", "4");
//		params.put("pageSize", "5");
		
		String strFunction = "taskAction.getListTaskToAssign";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListTaskToSign-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListEmployeeOfOrganization() {

		System.out.println();
		System.out.println("----------------- getListEmployeeOfOrganization ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("orgId", "254921");
		
		String strFunction = "Org.getListEmployeeOfOrganization";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListEmployeeOfOrganization-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void exportListTaskFile() {

		System.out.println();
		System.out
				.println("----------------- exportListTaskFile ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("type", "1");
		params.put("orgId", "254921");
		params.put("orgName", "Trung tâm Phần mềm Viettel 1");
		params.put(
				"listEmployee",
				"[{\"employeeId\":51876,\"fullName\":\"Nguyễn Thị Quỳnh Ngân\",\"employeeCode\":\"123229\",\"listPerformTask\":[{\"taskId\":1013535,\"taskName\":\"dsd\",\"startTime\":\"07/12/2015\",\"endTime\":\"08/12/2015\",\"commanderId\":387682,\"commanderName\":\"Trương Quang Việt\", \"approvalState\": 1, \"comment\":\"OK\"},{\"taskId\":1013532,\"taskName\":\"Test1\",\"startTime\":\"07/12/2015\",\"endTime\":\"17/12/2015\",\"commanderId\":387682,\"commanderName\":\"Trương Quang Việt\", \"approvalState\": 1, \"comment\":\"OK\"},{\"taskId\":1013548,\"taskName\":\",k,k\",\"startTime\":\"07/12/2015\",\"endTime\":\"18/12/2015\",\"commanderId\":491966,\"commanderName\":\"Vũ Đình Luân\", \"approvalState\": 1, \"comment\":\"OK\"}]},{\"employeeId\":383581,\"fullName\":\"Trần Thị Yến\",\"employeeCode\":\"134968\",\"listPerformTask\":[{\"taskId\":1013308,\"taskName\":\"Hzjsjs\",\"startTime\":\"01/12/2015\",\"endTime\":\"31/12/2015\",\"commanderId\":54570, \"approvalState\": 1, \"comment\":\"OK\"},{\"taskId\":1013431,\"taskName\":\"Hhhhbn\",\"startTime\":\"03/12/2015\",\"endTime\":\"11/12/2015\",\"commanderId\":737,\"commanderName\":\"TGĐ Hùng\", \"approvalState\": 1, \"comment\":\"OK\"}]}]");

		String strFunction = "taskAction.exportListTaskFile";
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("exportListTaskSignFile-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	/**
	 * Download file
	 */
	private static void downloadFile() {
		HttpURLConnection conn = null;
		String urlString = "http://10.58.71.129:8591/ServiceMobile_V02/resources/Files/DownloadContentFile/";
//		String urlString = "http://192.168.175.58:8060/ServiceMobile_V02/resources/Files/DownloadContentFile/";
		InputStream input = null;
		OutputStream output = null;

		try {
			URL url = new URL(urlString);
			// Open a HTTP connection to the URL
			conn = (HttpURLConnection) url.openConnection();

			// Allow Inputs
			conn.setDoInput(true);

			// Allow Outputs
			conn.setDoOutput(true);

			// Don't use a cached copy.
			conn.setUseCaches(false);
			StringBuilder postData = new StringBuilder();
			Map<String, Object> params = new LinkedHashMap<String, Object>();
			
			Map<String, Object> hmData = new LinkedHashMap<String, Object>();
			hmData.put("type", "7");
			hmData.put("fileName", "Copy of VSOFT 14 3.xls");
			hmData.put("filePath", "/File/2016/4/21/4234/661c9953-a57a-4ee1-9031-1794c1d63e5f.xls");
//			hmData.put("filePath", "/task/tmp/123229/201512/99a793db-00d8-42e0-9f05-ef91e8bfbf27.pdf");
			String strData = FunctionCommon.convertValueToJson(hmData);
			
			params.put("data", strData);
			
			// String strDataSend = FunctionCommon.convertValueToJson(params);
			for (Map.Entry<String, Object> param : params.entrySet()) {
				if (postData.length() != 0)
					postData.append('&');
				postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
				postData.append('=');
				postData.append(URLEncoder.encode(
						String.valueOf(param.getValue()), "UTF-8"));
			}
			byte[] postDataBytes = postData.toString().getBytes("UTF-8");

			// Use a post method.
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			conn.setRequestProperty("Content-Length",
					String.valueOf(postDataBytes.length));
			conn.setRequestProperty("Cookie", FunctionCommon.STR_SESSIONID);
			conn.setDoOutput(true);
			conn.getOutputStream().write(postDataBytes);
			conn.setConnectTimeout(5000);

			input = conn.getInputStream();
			output = new FileOutputStream("D:\\myfile11111111.xls");

			byte data[] = new byte[4096];
			int count;

			while ((count = input.read(data)) != -1) {
				output.write(data, 0, count);
			}

			System.out.println("---------------------------");

		} catch (MalformedURLException ex) {
			System.out.println("err1=" + ex.getMessage());
		} catch (IOException ioe) {
			System.out.println("err2=" + ioe.getMessage());
		} finally {
			try {
				if (input != null) {
					input.close();
					input = null;
				}

				if (output != null) {
					output.close();
					output = null;
				}
			} catch (IOException e) {
			}
		}
	}

	private static void getListTaskToAssess() {

		System.out.println();
		System.out
				.println("----------------- getListTaskToAssess ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("type", "0");
//		params.put("isCount", "1");		
		params.put("orgId", "254921");
		params.put("enforcementId", "40120");
//		params.put("startRecord", "0");
//		params.put("pageSize", "10");

		String strFunction = "taskAction.getListTaskToAssess";
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("exportListTaskSignFile-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}			
	}
	
	private static void getFileAttachmentTask() {

		System.out.println();
		System.out
				.println("----------------- getFileAttachmentTask ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", "1014200");

		String strFunction = "taskAction.getFileAttachmentTask";
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getFileAttachmentTask-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}			
	}
	
	private static void searchText() {

		System.out.println();
		System.out
				.println("----------------- searchText ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isFinancial", "0");
		params.put("type", "0");
		params.put("toDate", "01/12/2015");

		String strFunction = "textAction.searchText";
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("searchText-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void signByCASIM() {

		System.out.println();
		System.out
				.println("----------------- signByCASIM ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
//		params.put("isFinancial", "0");
		params.put("type", "1");
		params.put("fileName", "thanght.pdf");
		params.put("filePath", "/task/195873/201512/cebf5ff2-f6b7-48be-8347-255747b5e57b.pdf");
		params.put("listTask", "[{\"taskId\":1, \"approvalState\":1, \"approvalComment\":\"OK\", \"commanderId\":387682, \"enforcementId\":6485}]");
		params.put("period", "201512");

		String strFunction = "Sign.SignByCASIM";
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("searchText-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void signSoft() {

		System.out.println();
		System.out
				.println("----------------- signSoft ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("step", "1");
		params.put("publicKey", "bbb387faeceefdb64145f823911264a9bbfd6959e70c8bbed893031d706e3ec301027079a5a1fac9654a306b985078951f8341f1b545fe0378f08caa80de3757fc381db6a4c21d79939f86d2fcac1e28e30756e09da103cfd44a464a8e18f0413ad0b5222aaffc7eba8c1746537a785a7919c08d0a319c4f0e2b9aa6aaa1ce73");		
		params.put("type", "1");
		params.put("filePath", "/task/195873/201512/681db89f-9e6e-4a69-b8c7-afe614b383c9.pdf");
//		params.put("filePath", "/task/171672/201512/31cbd1f7-8415-4076-95e1-f3cb70cac64c.pdf");

		String strFunction = "Sign.SignSoft";
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("searchText-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListRatioConfigByOrg() {

		System.out.println();
		System.out.println("----------------- getListRatioConfigByOrg ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("orgId", "254921");
		
		String strFunction = "taskAction.getListRatioConfigByOrg";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListRatioConfigByOrg-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListSource() {

		System.out.println();
		System.out.println("----------------- getListSource ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("meetingMinutesId", "1303");
		
		String strFunction = "Meeting.GetListSource";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListSource-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void countMission() {

		System.out.println();
		System.out.println("----------------- countMission ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		
		String strFunction = "missionAction.CountMission";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListSource-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void cancelPublish() {

		System.out.println();
		System.out.println("----------------- cancelPublish ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("documentId", "386969");
		
		String strFunction = "DocumentAction.cancelPublish";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListSource-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void publish() throws JSONException {

		System.out.println();
		System.out.println("----------------- publish ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("isAuto", "1");
		params.put("publisherId", "0");
		params.put("documentId", "77123");
		params.put("publishedDate", "06/04/2016");
		params.put("expiredDate", "06/04/2016");
		params.put("summary", "thanght6-20160406-cong bo tu dong 1");
		params.put("orgId", "254921");
		params.put("builtGroupId", "234841");
		
		JSONArray jsonArray = new JSONArray();
		JSONObject json1 = new JSONObject();
		json1.put("documentId", 387207);
		JSONObject json2 = new JSONObject();
		json2.put("documentId", 387206);
		jsonArray.put(json1);
		jsonArray.put(json2);
		params.put("additionalAlternativeDocumentIds", jsonArray);
		
		String strFunction = "DocumentAction.publish";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListSource-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getTextDetail() throws JSONException {

		System.out.println();
		System.out.println("----------------- getTextDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("textId", "77006");
		params.put("isListFile", "1");
		params.put("type", "1");
		
		String strFunction = "textAction.getTextDetail";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListSource-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void editPublicationInformation() throws JSONException {

		System.out.println();
		System.out.println("----------------- editTmpPublicationInformation ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("documentId", "77310");
		params.put("publishedDate", "08/04/2016");
		params.put("expiredDate", "28/04/2016");
		params.put("summary", "11111111111111");
		params.put("orgId", "234841");
		params.put("orgLevel", "9");
		params.put("builtGroupId", "9");
		params.put("rangePublished", "9");
		
		JSONArray jsonArray = new JSONArray();
//		JSONObject json1 = new JSONObject();
//		json1.put("documentId", 1);
//		JSONObject json2 = new JSONObject();
//		json2.put("documentId", 2);
//		jsonArray.put(json1);
//		jsonArray.put(json2);
		params.put("alternativeDocumentIds", jsonArray);
		
		String strFunction = "DocumentAction.editTmpPublicationInformation";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("getListSource-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void search() throws JSONException {

		System.out.println();
		System.out.println("----------------- search ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("type", "3");
		params.put("status", "0");
		params.put("pageSize", "2");
		
		String strFunction = "DocumentAction.search";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("search-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void countDocument() throws JSONException {

		System.out.println();
		System.out.println("----------------- countDocument ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("countType", "0");
		params.put("type", "3");
		params.put("status", "0");
		
		String strFunction = "DocumentAction.countDocument";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("search-errorCode=" + errorCode);
                

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getDocumentDetail() throws JSONException {

		System.out.println();
		System.out.println("----------------- getDocumentDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("senderId", "3");
		params.put("documentId", "382752");
		
		String strFunction = "DocumentAction.getDocumentDetail";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("search-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListReceiver() throws JSONException {

		System.out.println();
		System.out.println("----------------- getListReceiver ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("senderId", "9110");
		params.put("documentId", "381910");
		
		String strFunction = "DocumentAction.getListReceiver";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("search-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void getListGroup() throws JSONException {

		System.out.println();
		System.out.println("----------------- getListGroup ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("documentId", "382752");
		
		String strFunction = "DocumentAction.getListGroup";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("search-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			_aes.decrypt(dataEncrypt,
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
					AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
		}
	}
	
	private static void searchDocLibrary() throws JSONException {

        System.out.println();
        System.out.println("------------searchDocLibrary------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        params.put("isCount", "1");
        params.put("officePublishedId", null);
        params.put("isDocReplace", null);
        params.put("state", null);
        params.put("docCode", null);
        params.put("docTitle", null);
        params.put("docType", null);
        params.put("docArea", null);
        params.put("docIndustryId", null);
        params.put("fromPublishedDate", null);
        params.put("toPublishedDate", null);
        params.put("fromExpDate", null);
        params.put("toExpDate", null);
        params.put("processType", null);
        params.put("senderName", null);
        params.put("appliedPoint", null);
        params.put("startRecord", "0");
        params.put("pageSize", "10");
        //params.put("docScopeIds", getJSONArrayDocScopeId(Arrays.asList(new Long[]{49L,50L})));
        params.put("isLibrary", true);
        
        String strFunction = "DocumentAction.actionSearchDocViewLibrary";                                         
        String dataRequest = FunctionCommon.sendPostService2(strFunction,
                params, AESKey, RSAPublicKey);

        String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
        System.out.println("search-errorCode=" + errorCode);

        if (errorCode.equals("200")) {
            String result = FunctionCommon.getItemInJson("result", dataRequest)
                    .toString();
            String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                    .toString();
            AES _aes = new AES();
            String str = _aes.decrypt(dataEncrypt,
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
            System.out.println("Result: " + str);
        }
    }
	
	private static JSONArray getJSONArrayDocScopeId(List<Long> listDocScope) {
        JSONArray array = new JSONArray();
        try {
            if (listDocScope != null && listDocScope.size() > 0) {
                JSONObject json;
                for (Long obj : listDocScope) {
                    json = new JSONObject();
                    json.put("scopeId", obj);
                    array.put(json);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }

	private static void getOrgPerform() throws JSONException {

        System.out.println();
        System.out.println("------------getOrgPerform------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        params.put("isFirst", "1");
        params.put("parentId", null);
        params.put("assignId", null);
        
        String strFunction = "Meeting.getListOrganizationAssign";                                         
        String dataRequest = FunctionCommon.sendPostService2(strFunction,
                params, AESKey, RSAPublicKey);

        String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
        System.out.println("search-errorCode=" + errorCode);

        if (errorCode.equals("200")) {
            String result = FunctionCommon.getItemInJson("result", dataRequest)
                    .toString();
            String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                    .toString();
            AES _aes = new AES();
            String str = _aes.decrypt(dataEncrypt,
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
            System.out.println("Result: " + str);
        }
    }

	private static void searchDocScope() throws JSONException {

        System.out.println();
        System.out.println("------------searchDocScope------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        params.put("isCount", "1");
        params.put("scopeName", null);
        params.put("isActive", "1");
        //params.put("listOrgId", getJSONArrayOrgSearch(Arrays.asList(new Long[]{})));
        //params.put("isLibrary", true);
        params.put("pageSize", "0");
        params.put("startRecord", "10");
        
        String strFunction = "DocumentAction.searchDocumentScope"; 
        String dataRequest = FunctionCommon.sendPostService2(strFunction,
                params, AESKey, RSAPublicKey);

        String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
        System.out.println("search-errorCode=" + errorCode);

        if (errorCode.equals("200")) {
            String result = FunctionCommon.getItemInJson("result", dataRequest)
                    .toString();
            String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                    .toString();
            AES _aes = new AES();
            String str = _aes.decrypt(dataEncrypt,
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
            System.out.println("Result: " + str);
        }
    }

    private static JSONArray getJSONArrayOrgSearch(List<Long> listOrg) {
        JSONArray array = new JSONArray();
        try {
            if (listOrg != null) {
                JSONObject json;
                for (Long obj : listOrg) {
                    json = new JSONObject();
                    json.put("orgId", obj);
                    array.put(json);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }

    private static void getListMissionGroup() throws JSONException {

        System.out.println();
        System.out.println("------------searchDocScope------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        params.put("type", "1");
        
        String strFunction = "missionAction.getListMissionGroup"; 
        String dataRequest = FunctionCommon.sendPostService2(strFunction,
                params, AESKey, RSAPublicKey);

        String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
        System.out.println("search-errorCode=" + errorCode);

        if (errorCode.equals("200")) {
            String result = FunctionCommon.getItemInJson("result", dataRequest)
                    .toString();
            String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                    .toString();
            AES _aes = new AES();
            String str = _aes.decrypt(dataEncrypt,
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
            System.out.println("Result: " + str);
        }
    }
}
