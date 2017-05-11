/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voffice.service2.smartoffice;

import com.voffice.service2.encrypt.AES;
import com.voffice.service2.encrypt.FunctionCommon;
import com.voffice.service2.encrypt.StringConstant;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sun.misc.BASE64Encoder;

/**
 *
 * @author os01
 */
public class VofficeGetLitsUserSignWithRole {
    private static String AESKey = "";
    private static String RSAPublicKey = "";

    public static void main(String[] args) throws Exception {
        getRSAKeyPublic();
        
        // Login
        String username = "010993";
        //String password = "mGcVhFiM3J4ugMvaDPzRO2RHGPg=";
        String password = "222222a@";
        login(username, password);
        
        String userId = login2();
        System.out.println("userId:" + userId);
        
        getLitsUserSignWithRolel(userId);
    }
    
    private static void getLitsUserSignWithRolel(String userId) throws JSONException {

            System.out.println();
            System.out.println("----------------- DocumentService.getLitsUserSignWithRole ------------------");
            Map<String, Object> params = new LinkedHashMap<String, Object>();
            //params.put("senderId", "3");
            JSONArray jsonArray = new JSONArray();
            JSONObject json1 = new JSONObject();
            json1.put("staffId", userId);
            jsonArray.put(json1);
            params.put("lstStaff", jsonArray);

            String strFunction = "DocumentService.getLitsUserSignWithRole";											
            String dataRequest = FunctionCommon.sendPostService2(strFunction,
                            params, AESKey, RSAPublicKey);

            String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
            String data1 = FunctionCommon.getItemInJson("result", dataRequest)
                    .toString();
            System.out.println("DocumentService.getLitsUserSignWithRole-errorCode=" + errorCode);


                
            if (errorCode.equals("200")) {
                    String result = FunctionCommon.getItemInJson("result", dataRequest)
                                    .toString();
                    String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                                    .toString();
                    AES _aes = new AES();
                    String data = _aes.decrypt(dataEncrypt,
                                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
                                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
                    System.out.println("Data:" + data);
            }
    }
    
    private static String login2() throws JSONException {
        String UserId = null;
		System.out.println();
		System.out.println("----------------- staffAction.getUserInfor ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		//params.put("senderId", "3");
				
		String strFunction = "staffAction.getUserInfor";											
		String dataRequest = FunctionCommon.sendPostService2(strFunction,
				params, AESKey, RSAPublicKey);

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("staffAction.getUserInfor-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
                    String result = FunctionCommon.getItemInJson("result", dataRequest)
                            .toString();
                    String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                            .toString();

                    AES _aes = new AES();
                    String dataDecrypt = _aes.decrypt(dataEncrypt,
                            AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
                            AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);

                    if (dataDecrypt != null) {
                        UserId = FunctionCommon.getDataRequestService2ByKeyJson(
                                dataDecrypt, "userId").toString();
//                        FunctionCommon.STR_SESSIONID = FunctionCommon
//                                .getDataRequestService2ByKeyJson(dataDecrypt,
//                                        "strSessionId").toString();
                        System.out.println("sessionId:" + FunctionCommon.STR_SESSIONID);
                    }
		}
                
                return UserId;
	}
	
    
    public static synchronized String encrypt(String plaintext)
            throws Exception {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1"); // step 2
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        try {
            md.update(plaintext.getBytes("UTF-8")); // step 3
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        byte raw[] = md.digest(); // step 4
        String hash = (new BASE64Encoder()).encode(raw); // step 5
        return hash; // step 6
    }
    
    private static void login(String loginName, String password)
            throws Exception {
        System.out.println();
        System.out.println("----------------- Login ------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        params.put("loginName", loginName);
        params.put("passWord", encrypt(password));
        // params.put("passWord", password);
        params.put("vof2Key", password);
        String strFunction = "Authenticate.login";
        String dataRequest = FunctionCommon.sendPostService2(strFunction,
                params, AESKey, RSAPublicKey);

        String codeErrLogin = FunctionCommon
                .getCodeRequestService2(dataRequest);
        System.out.println("Login-ErrorCode=" + codeErrLogin);
        if (codeErrLogin.equals("200")) {
            String result = FunctionCommon.getItemInJson("result", dataRequest)
                    .toString();
            String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                    .toString();

            AES _aes = new AES();
            String dataDecrypt = _aes.decrypt(dataEncrypt,
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
                    AESKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);

            String UserId = null;
            if (dataDecrypt != null) {
                UserId = FunctionCommon.getDataRequestService2ByKeyJson(
                        dataDecrypt, "userId").toString();
                FunctionCommon.STR_SESSIONID = FunctionCommon
                        .getDataRequestService2ByKeyJson(dataDecrypt,
                                "strSessionId").toString();
                System.out.println("sessionId:" + FunctionCommon.STR_SESSIONID);
            }
        }
    }

    
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
                RSAPublicKey = FunctionCommon.getDataRequestService2ByKeyJson(
                        dataRequestMH, "result.data.strPublicKey").toString();
                // Tao key Aes
                AESKey = AES.createAesKey();
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = "";
        }
        return result;
    }
}
