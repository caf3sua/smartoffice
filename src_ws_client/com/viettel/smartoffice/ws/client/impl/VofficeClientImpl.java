package com.viettel.smartoffice.ws.client.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.viettel.smartoffice.ws.client.VofficeClient;
import com.viettel.smartoffice.ws.dto.VofficeRequest;
import com.viettel.smartoffice.ws.dto.VofficeResponse;
import com.viettel.smartoffice.ws.dto.VofficeToken;
import com.voffice.service2.encrypt.AES;
import com.voffice.service2.encrypt.FunctionCommon;
import com.voffice.service2.encrypt.StringConstant;
import com.voffice.service2.smartoffice.DocumentEntity;

import sun.misc.BASE64Encoder;

@Component
public class VofficeClientImpl implements VofficeClient {

	private static final Logger log = LoggerFactory.getLogger(VofficeClientImpl.class);
	
//	private String AESKey = "";
//    private String RSAPublicKey = "";
    
    @Value("${voffice.ws.url}")
	private String urlVoffice;

    private String buildResourcePath(String strFution) {
		return urlVoffice + strFution.replace(".", "/");
    }
    
    @PostConstruct
    public void init() throws Exception {
    	log.info("Init method after properties are set");
  	}
    
    @Override
	public VofficeResponse getAccessToken(VofficeRequest dto) {
    	VofficeToken token = new VofficeToken();
    	
    	// Get AES and RSA public key
    	getRSAKeyPublic(token);
    	
    	VofficeResponse response = new VofficeResponse();
    	String accessToken = null;
        try {
        	System.out.println();
            System.out.println("----------------- getAccessToken ------------------");
            Map<String, Object> params = new LinkedHashMap<String, Object>();
            params.put("loginName", dto.getUsername());
			params.put("passWord", encrypt(dto.getPassword()));
	        params.put("vof2Key", dto.getPassword());
	        String strFunction = "Authenticate.login";
	        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
	                params, token.getAes_key(), token.getRsa_public_key());

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
	            		token.getAes_key().split(StringConstant.STR_VIAESKEYSPACE)[0],
	            		token.getAes_key().split(StringConstant.STR_VIAESKEYSPACE)[1]);

	            if (dataDecrypt != null) {
	            	FunctionCommon.STR_SESSIONID = FunctionCommon
	                        .getDataRequestService2ByKeyJson(dataDecrypt,
	                                "strSessionId").toString();
	            	accessToken = FunctionCommon.STR_SESSIONID;
	                System.out.println("sessionId:" + FunctionCommon.STR_SESSIONID);
	                token.setAccess_token(accessToken);
	                response.setData(token);
	            }
	        }
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
        
        return response;
	}
    
	@Override
	public VofficeResponse getSumTask(VofficeRequest dto) {
		System.out.println();
		System.out.println("----------------- taskAction.getCountHomeTask ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		//  0- việc giao đi; 1 - việc thực hiện
		params.put("type", dto.getType());
		
		String strFunction = "taskAction.getCountHomeTask";
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

		return mappingVofficeResponse(dto, dataRequest);
	}

	@Override
	public VofficeResponse getSumDoc(VofficeRequest dto) {
		System.out.println();
		System.out.println("----------------- textAction.getCountTextDashboard ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
        params.put("fromDate", dto.getFromDate());
		params.put("toDate", dto.getToDate());
		
		String strFunction = "textAction.getCountTextDashboard";											
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

		return mappingVofficeResponse(dto, dataRequest);
	}
	
	@Override
	public VofficeResponse getSumMission(VofficeRequest dto) {
		System.out.println();
        System.out.println("----------------- getSumMission ------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        // Fix data
        params.put("isCount", "1");
        params.put("isSearchAdvanced", "1");
        //Nhiệm vụ thực hiện: 1
        //Nhiệm vụ giao đi: 2
        params.put("typeMission", dto.getTypeMission());
        params.put("searchOrgIds", dto.getSearchOrgIds());
        params.put("listStatus", dto.getListStatus());
        
        String strFunction = "missionAction.findMissionByCondition";											
        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
                        params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

        return mappingVofficeResponse(dto, dataRequest);
	}

//	@Override
//	public VofficeResponse getListTask(VofficeRequest dto) {
//		System.out.println();
//        System.out.println("----------------- taskAction.getListTask ------------------");
//        Map<String, Object> params = new LinkedHashMap<String, Object>();
//        // Fix data
//        params.put("isCount", ""); 
//        // (1 - việc được giao; 2 - việc tôi giao; 3 - công việc của cá nhân khác; 4 - công việc cá nhân việc riêng; 5 - việc phối hợp; Bổ sung 1 type = 6 - việc đă chuyển và type = 7 là bao gồm loại 1,2,3) (Fix 7 - lấy việc có đánh giá; 4 - việc riêng; 5 - việc phối hợp; null để ko lấy theo type)
//        //params.put("typeMission", "1"); 
//        params.put("type", dto.getType());
//        params.put("startRecord", dto.getStartRecord()); 
//        params.put("pageSize", dto.getPageSize());
//        params.put("commanderId", dto.getCommanderId());
//        params.put("enforcementId", dto.getEnforcementId());
//        
//        // sortBy: 1 - Ngày tạo; 3 - Ngày giao; 4 - Ngày hoàn thành; 5 - Đơn vị thực hiện
//        String strFunction = "taskAction.getListTask";											
//        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
//                        params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());
//
//        return mappingVofficeResponse(dto, dataRequest);
//	}

//	@Override
//	public VofficeResponse getListMission(VofficeRequest dto) {
//		System.out.println();
//        System.out.println("----------------- getListMission ------------------");
//        Map<String, Object> params = new LinkedHashMap<String, Object>();
//        //Nhiệm vụ thực hiện: 1
//        //Nhiệm vụ giao đi: 2
//        params.put("isSearchAdvanced", "1");
//        params.put("isCount", dto.getIsCount()); 
//        params.put("typeMission", dto.getTypeMission());
//        //+ startRecord: bản ghi bắt đầu
//        //+ pageSize: số bản ghi
//        params.put("startRecord", dto.getStartRecord()); 
//        params.put("pageSize", dto.getPageSize()); 
//        params.put("orgAssignId", dto.getOrgAssignId());
//        params.put("orgPerformId", dto.getOrgPerformId());
//        params.put("searchOrgIds", dto.getSearchOrgIds());
//        params.put("listStatus", dto.getListStatus());
//        params.put("missionName", dto.getMissionName());
//        params.put("content", dto.getContent());
//        params.put("missionId", dto.getMissionId());
//        
//        // sortBy: 1 - Ngày tạo; 3 - Ngày giao; 4 - Ngày hoàn thành; 5 - Đơn vị thực hiện
//        String strFunction = "missionAction.findMissionByCondition";											
//        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
//                        params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());
//
//        return mappingVofficeResponse(dto, dataRequest);
//	}

//	@Override
//	public VofficeResponse getListDoc(VofficeRequest dto) {
//		System.out.println();
//        System.out.println("----------------- DocumentAction.search ------------------");
//        Map<String, Object> params = new LinkedHashMap<String, Object>();
//
//        // 1 - Công văn nhận được; 2 - công văn tôi tạo; 3 - công văn chuyển đi
//        params.put("type", dto.getType());
//        // Trạng thái xử lý (0 - tất cả; 1 - công văn chưa xử lý; 2 - Công văn chưa đọc; 3 - Công văn đã đọc; 4 - công văn đã xử lý )
//        params.put("status", dto.getStatus());
//        params.put("startRecord", dto.getStartRecord()); 
//        params.put("pageSize", dto.getPageSize());
//        // sortBy: 1 - Ngày tạo; 3 - Ngày giao; 4 - Ngày hoàn thành; 5 - Đơn vị thực hiện
//        String strFunction = "DocumentAction.search";											
//        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
//                        params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());
//
//        return mappingVofficeResponse(dto, dataRequest);
//	}

	@Override
	public VofficeResponse searchTask(VofficeRequest dto) {
		System.out.println();
        System.out.println("----------------- taskAction.getListTask ------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();

        // Fix data
        params.put("isSearchAdvanced", "1"); 
        params.put("isCount", dto.getIsCount()); 
        params.put("isWeb", "1");
        // (1 - việc được giao; 2 - việc tôi giao; 3 - công việc của cá nhân khác; 4 - công việc cá nhân việc riêng; 5 - việc phối hợp; Bổ sung 1 type = 6 - việc đă chuyển và type = 7 là bao gồm loại 1,2,3) (Fix 7 - lấy việc có đánh giá; 4 - việc riêng; 5 - việc phối hợp; null để ko lấy theo type)
        //params.put("typeMission", "1"); 
        //+ startRecord: bản ghi bắt đầu
        //+ pageSize: số bản ghi
        params.put("type", dto.getType());
        params.put("startRecord", dto.getStartRecord()); 
        params.put("pageSize", dto.getPageSize()); 
        params.put("taskName", dto.getTaskName());
        params.put("content", dto.getContent());
        params.put("commanderId", dto.getCommanderId()); 
        params.put("enforcementId", dto.getEnforcementId()); 
        // sortBy: 1 - Ngày tạo; 3 - Ngày giao; 4 - Ngày hoàn thành; 5 - Đơn vị thực hiện
        String strFunction = "taskAction.getListTask";											
        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
                        params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

        return mappingVofficeResponse(dto, dataRequest);
	}
	
	@Override
	public VofficeResponse searchMission(VofficeRequest dto) {
		System.out.println();
        System.out.println("------------missionAction.findMissionByCondition------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        // Fix data
        params.put("isSearchAdvanced", "1"); 
        params.put("displayOrg", "1");

        params.put("isCount", dto.getIsCount());
        params.put("typeMission", dto.getTypeMission());
        params.put("missionName", dto.getMissionName()); 
        params.put("missionId", dto.getMissionId());
        params.put("startRecord", dto.getStartRecord());
        params.put("pageSize", dto.getPageSize());
        params.put("orgAssignId", dto.getOrgAssignId());
        params.put("orgPerformId", dto.getOrgPerformId());
        params.put("searchOrgIds", dto.getSearchOrgIds());
        params.put("listStatus", dto.getListStatus());
        params.put("content", dto.getContent());
        
        // sortBy: 1 - Ngày tạo; 3 - Ngày giao; 4 - Ngày hoàn thành; 5 - Đơn vị thực hiện
        String strFunction = "missionAction.findMissionByCondition";	
        
        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
                params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

        return mappingVofficeResponse(dto, dataRequest);
	}

	@Override
	public VofficeResponse searchDoc(VofficeRequest dto) {
		System.out.println();
        System.out.println("------------DocumentAction.search------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        //params.put("document", "{title: Phiếu giao việc tháng 04/2017 - đ/c Bùi Trường Vinh}");
        // Trạng thái xử lý (0 - tất cả; 1 - công văn chưa xử lý; 2 - Công văn chưa đọc; 3 - Công văn đã đọc; 4 - công văn đã xử lý )
        params.put("status", dto.getStatus());
        params.put("startRecord", dto.getStartRecord()); 
        params.put("pageSize", dto.getPageSize());
        params.put("type", dto.getType());
        params.put("isCount", dto.getIsCount());
        
        DocumentEntity obj = new DocumentEntity();
        //obj.setTitle("8:31 hongntl chuyển văn bản thường cho nhóm");
        obj.setTitle(dto.getTitle());
        obj.setDocumentId(dto.getDocumentId());
        obj.setContent(dto.getContent());
        
        Gson gson= new Gson();
        String json = gson.toJson(obj);
        
        params.put("document", json);
                
        String strFunction = "DocumentAction.search";                                         
        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
                params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

        return mappingVofficeResponse(dto, dataRequest);
	}

	@Override
	public VofficeResponse searchText(VofficeRequest dto) {
		System.out.println();
        System.out.println("------------ textAction.searchText ------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        // Fix data
		params.put("isSearchAdvanced", "1"); 
		
		params.put("type", dto.getType());
		params.put("isCount", dto.getIsCount());
		params.put("startRecord", dto.getStartRecord()); 
        params.put("pageSize", dto.getPageSize());
        params.put("state", dto.getState());
        params.put("keyword", dto.getKeyword());
        params.put("title", dto.getTitle());
        params.put("description", dto.getDescription());
        params.put("registerNumber", dto.getState());
        params.put("code", dto.getCode());
        params.put("areaId", dto.getAreaId());
        params.put("typeId", dto.getTypeId());

		String strFunction = "textAction.searchText";
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

        return mappingVofficeResponse(dto, dataRequest);
	}

	
	
	@Override
	public VofficeResponse getListMeetingNearest(VofficeRequest dto) {
		System.out.println();
        System.out.println("----------------- get3MeetingNearestOnDashboard ------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        params.put("fromDate", dto.getFromDate());
        params.put("pageSize", dto.getPageSize());
        String strFunction = "MettingWeek.get3MeetingNearestOnDashboard";											
        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
                        params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

        return mappingVofficeResponse(dto, dataRequest);
	}

	@Override
	public VofficeResponse getDocumentDetail(VofficeRequest dto) {
		System.out.println();
		System.out.println("----------------- getDocumentDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		//params.put("senderId", "3");
		params.put("documentId", dto.getDocumentId());
		
		String strFunction = "DocumentAction.getDocumentDetail";											
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

		return mappingVofficeResponse(dto, dataRequest);
	}

	@Override
	public VofficeResponse getGetListUserSignWithRole(VofficeRequest dto) {
		// Login level 2
		String userIdLevel2 = loginLevel2(dto);
		
		System.out.println();
        System.out.println("----------------- DocumentService.getLitsUserSignWithRole ------------------");
        Map<String, Object> params = new LinkedHashMap<String, Object>();
        //params.put("senderId", "3");
        JSONArray jsonArray = new JSONArray();
        JSONObject json1 = new JSONObject();
        try {
			json1.put("staffId", userIdLevel2);
		} catch (JSONException e) {
			e.printStackTrace();
		}
        jsonArray.put(json1);
        params.put("lstStaff", jsonArray);

        String strFunction = "DocumentService.getLitsUserSignWithRole";											
        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
                        params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

        return mappingVofficeResponse(dto, dataRequest);
	}

	@Override
	public VofficeResponse getTextDetail(VofficeRequest dto) {
		System.out.println();
		System.out.println("----------------- textAction.getTextDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		// Fix data
		params.put("isListFile", "0");
		//params.put("senderId", "3");
		params.put("textId", dto.getTextId());
		
		String strFunction = "textAction.getTextDetail";											
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

		return mappingVofficeResponse(dto, dataRequest);
	}

	@Override
	public VofficeResponse getTaskDetail(VofficeRequest dto) {
		System.out.println();
		System.out.println("----------------- taskAction.getTaskDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("taskId", dto.getTaskId());

		String strFunction = "taskAction.getTaskDetail";											
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

		return mappingVofficeResponse(dto, dataRequest);
	}
	
	@Override
	public VofficeResponse getMissionDetail(VofficeRequest dto) {
		System.out.println();
		System.out.println("----------------- missionAction.getMissionDetail ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		params.put("missionId", dto.getMissionId());

		String strFunction = "missionAction.getMissionDetail";											
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

		return mappingVofficeResponse(dto, dataRequest);
	}
	
	private String loginLevel2(VofficeRequest dto) {
        String UserId = null;
		System.out.println();
		System.out.println("----------------- staffAction.getUserInfor ------------------");
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		//params.put("senderId", "3");
				
		String strFunction = "staffAction.getUserInfor";											
		String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
				params, dto.getAes_key(), dto.getRsa_public_key(), dto.getAccess_token());

		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		System.out.println("staffAction.getUserInfor-errorCode=" + errorCode);

		if (errorCode.equals("200")) {
                    String result = FunctionCommon.getItemInJson("result", dataRequest)
                            .toString();
                    String dataEncrypt = FunctionCommon.getItemInJson("data", result)
                            .toString();

                    AES _aes = new AES();
                    String dataDecrypt = _aes.decrypt(dataEncrypt,
                    		dto.getAes_key().split(StringConstant.STR_VIAESKEYSPACE)[0],
                    		dto.getAes_key().split(StringConstant.STR_VIAESKEYSPACE)[1]);

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
	
	// ================= Private method =====================
//	private void initWsMethod(VofficeRequest dto) {
////		getRSAKeyPublic();
//        
//        // Login
//        String username = dto.getUsername(); //"010993";
//        //String password = "mGcVhFiM3J4ugMvaDPzRO2RHGPg=";
//        String password = dto.getPassword(); //"222222a@";
//        try {
//			login(username, password);
//		} catch (Exception e) {
//		}
//	}
	
	private synchronized String encrypt(String plaintext)
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
    
//    private void login(String loginName, String password, String aesKey, String rsaKey)
//            throws Exception {
//        System.out.println();
//        System.out.println("----------------- Login ------------------");
//        Map<String, Object> params = new LinkedHashMap<String, Object>();
//        params.put("loginName", loginName);
//        params.put("passWord", encrypt(password));
//        // params.put("passWord", password);
//        params.put("vof2Key", password);
//        String strFunction = "Authenticate.login";
//        String dataRequest = FunctionCommon.sendPostService2(buildResourcePath(strFunction),
//                params, aesKey, rsaKey);
//
//        String codeErrLogin = FunctionCommon
//                .getCodeRequestService2(dataRequest);
//        System.out.println("Login-ErrorCode=" + codeErrLogin);
//        if (codeErrLogin.equals("200")) {
//            String result = FunctionCommon.getItemInJson("result", dataRequest)
//                    .toString();
//            String dataEncrypt = FunctionCommon.getItemInJson("data", result)
//                    .toString();
//
//            AES _aes = new AES();
//            String dataDecrypt = _aes.decrypt(dataEncrypt,
//            		aesKey.split(StringConstant.STR_VIAESKEYSPACE)[0],
//            		aesKey.split(StringConstant.STR_VIAESKEYSPACE)[1]);
//
//            String UserId = null;
//            if (dataDecrypt != null) {
//                UserId = FunctionCommon.getDataRequestService2ByKeyJson(
//                        dataDecrypt, "userId").toString();
//                FunctionCommon.STR_SESSIONID = FunctionCommon
//                        .getDataRequestService2ByKeyJson(dataDecrypt,
//                                "strSessionId").toString();
//                System.out.println("sessionId:" + FunctionCommon.STR_SESSIONID);
//            }
//        }
//    }

    
    private String getRSAKeyPublic(VofficeToken token) {
        System.out.println();
        System.out.println("-------------- getRSAKeyPublic --------------");
        String result = "";
        try {
            String dataRequestMH = FunctionCommon.sendPostService2(
                    buildResourcePath("Authenticate.getRsaKeyPublic"), null, null, null);
            String codeErr = FunctionCommon
                    .getCodeRequestService2(dataRequestMH);
            if (codeErr.equals("200")) {
                System.out.println("getRSAKeyPublic-OK");
                // Lay key RSA thanh cong
                String RSAPublicKey = FunctionCommon.getDataRequestService2ByKeyJson(
                        dataRequestMH, "result.data.strPublicKey").toString();
                // Tao key Aes
                String AESKey = AES.createAesKey();
                // Set data
                token.setAes_key(AESKey);
                token.setRsa_public_key(RSAPublicKey);
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = "";
        }
        return result;
    }
    
    private VofficeResponse mappingVofficeResponse(VofficeRequest token, String dataRequest) {
		String errorCode = FunctionCommon.getCodeRequestService2(dataRequest);
		log.debug("taskAction.getCountHomeTask-errorCode=" + errorCode);
		
    	VofficeResponse response = new VofficeResponse();
		response.setErrorCode(errorCode);
		if (errorCode.equals("200")) {
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			String dataEncrypt = FunctionCommon.getItemInJson("data", result)
					.toString();
			AES _aes = new AES();
			String jsonStr = _aes.decrypt(dataEncrypt,
					token.getAes_key().split(StringConstant.STR_VIAESKEYSPACE)[0],
					token.getAes_key().split(StringConstant.STR_VIAESKEYSPACE)[1]);
            System.out.println("Data:" + jsonStr);
            
            Object jObj = null;
            if (StringUtils.isNotEmpty(jsonStr)) {
	    		try {
	    			jObj = new ObjectMapper().readValue(jsonStr, Object.class);
	    		} catch (JsonParseException e) {
	    			log.error(e.getMessage(), e);
	    		} catch (JsonMappingException e) {
	    			log.error(e.getMessage(), e);
	    		} catch (IOException e) {
	    			log.error(e.getMessage(), e);
	    		}
            }
            response.setData(jObj);
		} else {
			// Set message
			String result = FunctionCommon.getItemInJson("result", dataRequest)
					.toString();
			// Quick fix
			String mess = null;
			if (null == FunctionCommon.getItemInJson("mess", result)) {
				mess = FunctionCommon.getItemInJsonArray("mess", result)
						.toString();
			} else {
				mess = FunctionCommon.getItemInJson("mess", result)
						.toString();
			}
			
			String message = "";
			if (null != FunctionCommon.getItemInJson("message", mess)) {
				message = FunctionCommon.getItemInJson("message", mess)
						.toString(); 
			} else {
				message = FunctionCommon.getItemInJson("messErr", mess)
				.toString();
			}
			
			response.setMessage(message);
		}
		
    	return response;
    }
}
