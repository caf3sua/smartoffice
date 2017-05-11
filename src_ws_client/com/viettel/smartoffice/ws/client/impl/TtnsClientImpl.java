package com.viettel.smartoffice.ws.client.impl;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.viettel.smartoffice.ws.client.TtnsClient;
import com.viettel.smartoffice.ws.dto.TtnsRegisterInOutRequest;
import com.viettel.smartoffice.ws.dto.TtnsRequest;
import com.viettel.smartoffice.ws.dto.TtnsResponse;
import com.viettel.smartoffice.ws.dto.TtnsTimeKeepingRequest;

/**
 * Using for testing
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@Component
public class TtnsClientImpl implements TtnsClient {

	private static final Logger log = LoggerFactory.getLogger(TtnsClientImpl.class);
	
	@Value("${ttns.ws.url}")
	private String urlTtns;
	
	@Value("${ttns.ws.grant_type}")
	private String grant_type;
	
	@Value("${ttns.ws.client_id}")
	private String client_id;
	
	@Value("${ttns.ws.client_secret}")
	private String client_secret;
	
	@Value("${ttns.ws.username}")
	private String username;
	
	@Value("${ttns.ws.password}")
	private String password;
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

	private TtnsResponse mappingResponse(ResponseEntity<Object> data) {
		TtnsResponse response = new TtnsResponse();
		response.setStatusCode(data.getStatusCode().value());
		response.setData(data.getBody());
		
    	return response;
    }

	private TtnsResponse restTemplateGET(String accessToken, String resource, String id) {
		// get access token
		RestTemplate restTemplate = new RestTemplate();
		
		Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("id", id); 
        
        HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Bearer " + accessToken);
		HttpEntity<TtnsRequest> request = new HttpEntity<TtnsRequest>(headers);
		
		ResponseEntity<Object> response = restTemplate.exchange(urlTtns + resource, HttpMethod.GET, request, Object.class, params);
		return mappingResponse(response);
	}
	
	private TtnsResponse restTemplateGET(String accessToken, String resource, String id, MultiValueMap<String, String> map) {
		// get access token
		RestTemplate restTemplate = new RestTemplate();
		
		Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("id", id);
        
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(urlTtns + resource).queryParams(map).build();
        String url = uriComponents.toUriString();

        HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Bearer " + accessToken);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, request, Object.class, params);
		return mappingResponse(response);
	}
	
	private TtnsResponse restTemplateGET(String accessToken, String resource, MultiValueMap<String, String> map) {
		// get access token
		RestTemplate restTemplate = new RestTemplate();
		
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(urlTtns + resource).queryParams(map).build();
        String url = uriComponents.toUriString();

        HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Bearer " + accessToken);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.GET, request, Object.class);
		return mappingResponse(response);
	}

	private TtnsResponse restTemplatePOST(String accessToken, String resource, String id, MultiValueMap<String, String> map) {
		// get access token
		RestTemplate restTemplate = new RestTemplate();
		
		Map<String, String> params = new LinkedHashMap<String, String>();
        params.put("id", id);
        
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(urlTtns + resource).queryParams(map).build();
        String url = uriComponents.toUriString();

        HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", "Bearer " + accessToken);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		
		ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.POST, request, Object.class, params);
		return mappingResponse(response);
	}
	
	private TtnsResponse restTemplatePOSTFormUrlEncode(String accessToken, String resource, MultiValueMap<String, String> map) {
		// get access token
		RestTemplate restTemplate = new RestTemplate();
		
        UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(urlTtns + resource).build();
        String url = uriComponents.toUriString();

        HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.add("Authorization", "Bearer " + accessToken);
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
		
		ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.POST, request, Object.class);
		return mappingResponse(response);
	}
	
	@Override
	public TtnsResponse getAccessToken() {
		log.info("START method getAccessToken");
		try {
//			MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
//	        params.add("grant_type", grant_type); 
//	        params.add("client_id", client_id);
//	        params.add("client_secret", client_secret); 
//	        params.add("username", username); 
//	        params.add("password", password); 
//			
//			String resource = "/oauth/token?grant_type={grant_type}&client_id={client_id}&client_secret={client_secret}&username={username}&password={password}";
//			UriComponents uriComponents = UriComponentsBuilder.fromHttpUrl(urlTtns + resource).queryParams(params).build();
//	        String strUrl = uriComponents.toUriString();
//	        
//			//String strUrl = "http://10.58.71.138:8765/TTNSAPIs/oauth/token?grant_type=password&client_id=smartOffice2-client-id&client_secret=12345&username=smartOffice2&password=password";
//			URL url = new URL(strUrl);
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.setRequestMethod("GET");
//			conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
//			
//			BufferedReader br = null;
//			if (200 <= conn.getResponseCode() && conn.getResponseCode() <= 299) {
//			    br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
//			} else {
//			    br = new BufferedReader(new InputStreamReader((conn.getErrorStream())));
//			}
//			
//			StringBuilder sb = new StringBuilder();
//			String output;
//			while ((output = br.readLine()) != null) {
//				sb.append(output);
//			}
//			System.out.println(sb);
//			log.debug("Access response:" + sb.toString());
//			return mappingResponse(sb);
//			
//			
			RestTemplate restTemplate = new RestTemplate();

			Map<String, String> params = new LinkedHashMap<String, String>();
	        params.put("grant_type", grant_type); 
	        params.put("client_id", client_id);
	        params.put("client_secret", client_secret); 
	        params.put("username", username); 
	        params.put("password", password); 
	        
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> request = new HttpEntity<String>(headers);
			
			String resource = "/oauth/token?grant_type={grant_type}&client_id={client_id}&client_secret={client_secret}&username={username}&password={password}";
			log.info("Param:" + params + ", URL:" + resource);
			ResponseEntity<Object> response = restTemplate.exchange(urlTtns + resource, HttpMethod.GET, request, Object.class, params);
			log.info("Response:" + response);
			return mappingResponse(response);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		
		return null;
	}

	@Override
	public TtnsResponse workProcess(String token, TtnsRequest dto) {
		String resource = "/api/v1/employee/{id}/work-process";
		
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse workProcessLatest(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/work-process/latest";
		
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse educationProcess(String token, TtnsRequest dto) {
		// Method: POST (2 param)
		String resource = "/api/v1/employee/{id}/education-process";
		
		// TODO
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse educationProcessLatest(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/education-process/latest";
				
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse salaryProcess(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/salary-process";
						
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse salaryProcessLatest(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/salary-process/latest";
								
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse insuranceProcess(String token, TtnsRequest dto) {
		// Method: GET or POST ?
		String resource = "/api/v1/employee/{id}/insurance-process";

		// TODO
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse insuranceProcessLatest(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/insurance-process/latest";
								
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse empTypeProcess(String token, TtnsRequest dto) {
		// Method: GET or POST ?
		String resource = "/api/v1/employee/{id}/emp-type-process";

		// TODO
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse empTypeProcessLatest(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/emp-type-process/latest";
										
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse managerTypeProcess(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/manager-type-process";
						
		// TODO: not found
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse managerTypeProcessLatest(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/manager-type-process/latest";
						
		// TODO: not found
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse reward(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/reward";
						
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse descipline(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/descipline";
								
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse taxReduction(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/tax-reduction";
										
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse familyRelationship(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/family-relationship";
												
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse relicFeature(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/relic-feature";
														
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse compassionateLeaveGetByEmployeeId(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/{id}/compassionate-leave";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("type", dto.getType());
		map.add("status", dto.getStatus());
		map.add("from_date", dto.getFrom_date());
		map.add("to_date", dto.getTo_date());
		
		return restTemplateGET(token, resource, dto.getId(), map);
	}

	@Override
	public TtnsResponse compassionateLeaveGetList(String token, TtnsRequest dto) {
		// Method: GET
		String resource = "/api/v1/employee/compassionate-leave";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("type", dto.getType());
		map.add("id", dto.getPersonal_form_id());
		
		return restTemplateGET(token, resource, dto.getId(), map);
	}
	
	@Override
	public TtnsResponse compassionateLeaveRegister(String token, TtnsRequest dto) {
		// Resource URL
		String resource = "/api/v1/employee/{id}/compassionate-leave";
							
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("type", String.valueOf(dto.getType()));
		map.add("reason", String.valueOf(dto.getReason()));
		map.add("type_resign", String.valueOf(dto.getType_resign()));
		map.add("from_date", String.valueOf(dto.getFrom_date()));
		map.add("to_date", String.valueOf(dto.getTo_date()));
		if (StringUtils.isNotEmpty(dto.getPersonal_form_id())) {
			map.add("id", String.valueOf(dto.getPersonal_form_id()));	
		}

		return restTemplatePOST(token, resource, dto.getId(), map);
	}

	@Override
	public TtnsResponse compassionateLeaveDelete(String token, TtnsRequest dto) {
		// Method POST
		String resource = "/api/v1/employee/{id}/compassionate-leave/delete";
			
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		if (StringUtils.isNotEmpty(dto.getPersonal_form_id())) {
			map.add("personal_form_id", String.valueOf(dto.getPersonal_form_id()));
			map.add("id", dto.getId());
			map.add("form_type_id", dto.getForm_type_id());
		}
		
		return restTemplatePOST(token, resource, dto.getId(), map);
	}

	@Override
	public TtnsResponse compassionateLeaveSign(String token, TtnsRequest dto) {
		// Method POST
		String resource = "/api/v1/employee/{id}/compassionate-leave/sign";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		if (StringUtils.isNotEmpty(dto.getType())) {
			map.add("type", dto.getType());
		}
		
		return restTemplatePOST(token, resource, dto.getId(), map);
	}

	@Override
	public TtnsResponse allowanceProcess(String token, TtnsRequest dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TtnsResponse attachFile(String token, TtnsRequest dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TtnsResponse remainingAnnual(String token, TtnsRequest dto) {
		// Resource URL
		String resource = "/api/v1/employee/{id}/remaining-annual";
											
		return restTemplateGET(token, resource, dto.getId());
	}

	@Override
	public TtnsResponse employeeDaily(String token, TtnsRequest dto) {
		// TODO Auto-generated method stub
		return null;
	}

	private String formatToString(Object input) {
		if (input == null) {
			return StringUtils.EMPTY;
		}
		
		return String.valueOf(input);
	}
	
	/*
	 * ------------------------------------------
	 * RegisterInOut - Đăng kí vào ra
	 * ------------------------------------------
	 */
	@Override
	public TtnsResponse delete(String token, String id, TtnsRegisterInOutRequest dto) {
		String resource = "/api/v1/register/inout/delete/" + id;
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("id", formatToString(dto.getId()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
	}

	@Override
	public TtnsResponse reason(String token, Long syncTime, String type) {
		// Method: GET
		String resource = "/api/v1/register/inout/reason";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("type", formatToString(type));
		map.add("syncTime", formatToString(syncTime));
		
		return restTemplateGET(token, resource, map);
	}

	@Override
	public TtnsResponse approved(String token, String id, Long status, Long fromTime, Long endTime) {
		// Method: GET
		String resource = "/api/v1/register/inout/approved/{id}";

		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("status", formatToString(status));
		map.add("from_time", formatToString(fromTime));
		map.add("end_time", formatToString(endTime));
		
		return restTemplateGET(token, resource, id, map);
	}

	@Override
	public TtnsResponse getListInOut(String token, String type, Long sync_time) {
		// Method: GET
		String resource = "/api/v1/register/inout";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("type", formatToString(type));
		map.add("sync_time", formatToString(sync_time));
		
		return restTemplateGET(token, resource, map);
	}

	@Override
	public TtnsResponse workplace(String token, String type, Long sync_time) {
		// Method: GET
		String resource = "/api/v1/register/inout/workplace";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("type", formatToString(type));
		map.add("syncTime", formatToString(sync_time));
		
		return restTemplateGET(token, resource, map);
	}

	@Override
	public TtnsResponse reasonById(String token, String id) {
		// Method: GET
		String resource = "/api/v1/register/inout/reason/{id}";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("id", formatToString(id));
		
		return restTemplateGET(token, resource, id, map);
	}

	@Override
	public TtnsResponse inoutById(String token, String id) {
		// Method: GET
		String resource = "/api/v1/register/inout/{id}";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("id", formatToString(id));
		
		return restTemplateGET(token, resource, id, map);
	}

	@Override
	public TtnsResponse workplaceById(String token, String id) {
		// Method: GET
		String resource = "/api/v1/register/inout/workplace/{id}";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("id", formatToString(id));
		
		return restTemplateGET(token, resource, id, map);
	}

	@Override
	public TtnsResponse register(String token, TtnsRegisterInOutRequest dto) {
		// Method POST
		try {
			String resource = "/api/v1/register/inout";
												
			MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
			map.add("employee_id", formatToString(dto.getEmployee_id()));
			map.add("from_time", formatToString(dto.getFrom_time()));
			map.add("end_time", formatToString(dto.getEnd_time()));
			map.add("reason_out_id", formatToString(dto.getReason_out_id()));
			map.add("work_place_id", formatToString(dto.getWork_place_id()));
			map.add("reason_detail", formatToString(dto.getReason_detail()));
			
			return restTemplatePOSTFormUrlEncode(token, resource, map);
		} catch (HttpClientErrorException e) {
			TtnsResponse result = new TtnsResponse();
			result.setStatusCode(e.getStatusCode().value());
			result.setData(e.getMessage());
			return result;
		}
	}

	@Override
	public TtnsResponse registerGetList(String token, String id, Long status, Long from_time, Long end_time) {
		// Method: GET
		String resource = "/api/v1/register/inout/employee/effective/{id}";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("status", formatToString(status));
		map.add("from_time", formatToString(from_time));
		map.add("end_time", formatToString(end_time));
		
		return restTemplateGET(token, resource, id, map);
	}

	@Override
	public TtnsResponse update(String token, TtnsRegisterInOutRequest dto) {
		// Method POST
		String resource = "/api/v1/register/inout/update";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("emp_out_reg_id", formatToString(dto.getEmp_out_reg_id()));
		map.add("status", formatToString(dto.getStatus()));
		map.add("reason", formatToString(dto.getReason()));
		map.add("emp_approve_id", formatToString(dto.getEmp_approve_id()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
	}


	@Override
	public TtnsResponse updateTimekeeping(String token, TtnsTimeKeepingRequest dto) {
		// Method POST
		String resource = "/api/v1/timeKeeping/employee/update";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("approve_emp_id", formatToString(dto.getApprove_emp_id()));
		map.add("id", formatToString(dto.getId()));
		map.add("status", formatToString(dto.getStatus()));
		map.add("reason", formatToString(dto.getReason()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
	}


	@Override
	public TtnsResponse approveTimekeeping(String token, TtnsTimeKeepingRequest dto) {
		// Method POST
		String resource = "/api/v1/timeKeeping/employee/approve/update";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("employee_id", formatToString(dto.getEmployee_id()));
		map.add("approve_emp_id", formatToString(dto.getApprove_emp_id()));
		map.add("from_time", formatToString(dto.getFrom_time()));
		map.add("end_time", formatToString(dto.getEnd_time()));
		map.add("comment", formatToString(dto.getComment()));
		map.add("type", formatToString(dto.getType()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
	}


	@Override
	public TtnsResponse calculateSabatical(String token, TtnsTimeKeepingRequest dto) {
//		try {
		// Method POST
		String resource = "/api/v1/calculate/sabatical/update";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("lstEmpIds", formatToString(dto.getLstEmpIds()));
		map.add("year", formatToString(dto.getYear()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
	}


	@Override
	public TtnsResponse deleteTimekeeping(String token, TtnsTimeKeepingRequest dto) {
		// Method POST
		String resource = "/api/v1/timeKeeping/employee/delete";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("employee_id", formatToString(dto.getEmployee_id()));
		map.add("id", formatToString(dto.getId()));
		map.add("comment", formatToString(dto.getComment()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
	}


	@Override
	public TtnsResponse workDayTypeByIdTimekeeping(String token, String id) {
		// Method: GET
		String resource = "/api/v1/timeKeeping/workDayType/{id}";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		
		return restTemplateGET(token, resource, id, map);
	}


	@Override
	public TtnsResponse historyInoutTimekeeping(String token, TtnsTimeKeepingRequest dto) {
		// Method POST
		String resource = "/api/v1/history-in-out";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("employee_id", formatToString(dto.getEmployee_id()));
		map.add("time_keeping", formatToString(dto.getTime_keeping()));
		map.add("work_place_type", formatToString(dto.getWork_place_type()));
		map.add("type", formatToString(dto.getType()));
		map.add("source_data", formatToString(dto.getSource_data()));
		map.add("private_key", formatToString(dto.getPrivate_key()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
	}


	@Override
	public TtnsResponse workDayTypeTimeKeeping(String token, Long workdayTypeId, String code, String name, Long affairMode, Long shiftMod, Long overtimeMode) {
		// Method: GET
		String resource = "/api/v1/timeKeeping/workDayType";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("workdayTypeId", formatToString(workdayTypeId));
		map.add("code", formatToString(code));
		map.add("name", formatToString(name));
		map.add("affairMode", formatToString(affairMode));
		map.add("shiftMod", formatToString(shiftMod));
		map.add("overtimeMode", formatToString(overtimeMode));
		
		return restTemplateGET(token, resource, map);
	}


	@Override
	public TtnsResponse timeKeepingByemployeeId(String token, Long employee_id, Long manager_id, Long from_time,
			Long to_time) {
		// Method: GET
		String resource = "/api/v1/timeKeeping/employee";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("employee_id", formatToString(employee_id));
		map.add("manager_id", formatToString(manager_id));
		map.add("from_time", formatToString(from_time));
		map.add("to_time", formatToString(to_time));
		
		return restTemplateGET(token, resource, map);
	}


	@Override
	public TtnsResponse timeKeepingRegister(String token, TtnsTimeKeepingRequest dto) {
		// Method POST
		String resource = "/api/v1/timeKeeping/employee";
											
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("employee_id", formatToString(dto.getEmployee_id()));
		map.add("time_keeping", formatToString(dto.getTime_keeping()));
		map.add("work_place_type", formatToString(dto.getWork_place_type()));
		map.add("type", formatToString(dto.getType()));
		map.add("source_data", formatToString(dto.getSource_data()));
		map.add("private_key", formatToString(dto.getPrivate_key()));
		
		return restTemplatePOSTFormUrlEncode(token, resource, map);
	}


	@Override
	public TtnsResponse mobileIntegrated(String token, Long employee_id, String uuid) {
		// Method: GET
		String resource = "/api/v1/timeKeeping/mobile-integrated";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("employee_id", formatToString(employee_id));
		map.add("uuid", formatToString(uuid));
		
		return restTemplateGET(token, resource, map);
	}


	@Override
	public TtnsResponse timeKeepingDevice(String token, String type, Long syncTime) {
		// Method: GET
		String resource = "/api/v1/timeKeeping/device";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("type", formatToString(type));
		map.add("syncTime", formatToString(syncTime));
		
		return restTemplateGET(token, resource, map);
	}


	@Override
	public TtnsResponse timeKeepingDeviceId(String token, String id) {
		// Method: GET
		String resource = "/api/v1/timeKeeping/device/{id}";
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		
		return restTemplateGET(token, resource, id, map);
	}
}