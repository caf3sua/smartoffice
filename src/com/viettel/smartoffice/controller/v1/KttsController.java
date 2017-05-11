package com.viettel.smartoffice.controller.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.viettel.smartoffice.api.KttsApi;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;
import com.viettel.smartoffice.ws.client.KttsClient;
import com.viettel.smartoffice.ws.dto.KttsRequest;
import com.viettel.smartoffice.ws.dto.KttsResponse;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 */
@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class KttsController extends BaseController implements KttsApi {
    private static Logger LOG = LoggerFactory.getLogger(KttsController.class);
    
    @Autowired
	private KttsClient kttsClient;

    /*
     * (non-Javadoc)
     * @see com.viettel.smartoffice.api.KttsApi#countEntityByUser(com.viettel.smartoffice.ws.dto.KttsRequest)
     */
	@Override
	public APIResponse countEntityByUser(@RequestBody KttsRequest dto) {
		LOG.info("Start method countEntityByUser");
		
		String employeeId = dto.getEmployeeId();
		Long type = dto.getType();
		String keyword = dto.getKeyword();
		
		KttsResponse response = kttsClient.countEntityByUser(employeeId, type, keyword);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	/*
	 * (non-Javadoc)
	 * @see com.viettel.smartoffice.api.KttsApi#getListEntityByUser(com.viettel.smartoffice.ws.dto.KttsRequest)
	 */
	@Override
	public APIResponse getListEntityByUser(@RequestBody KttsRequest dto) {
		LOG.info("Start method getListEntityByUser");
		
		String employeeId = dto.getEmployeeId();
		Long type = dto.getType();
		Integer start = dto.getStart();
		Integer limit = dto.getLimit();
		String keyword = dto.getKeyword();
		
		KttsResponse response = kttsClient.getListEntityByUser(employeeId, type, start, limit, keyword);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	/*
	 * (non-Javadoc)
	 * @see com.viettel.smartoffice.api.KttsApi#getListEntityInHan(com.viettel.smartoffice.ws.dto.KttsRequest)
	 */
	@Override
	public APIResponse getListEntityInHan(@RequestBody KttsRequest dto) {
		LOG.info("Start method getListEntityInHan");
		
		Long idBBBGTSCN = dto.getIdBBBGTSCN();
		Integer start = dto.getStart();
		Integer limit = dto.getLimit();
		
		KttsResponse response = kttsClient.getListEntityInHan(idBBBGTSCN, start, limit);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	/*
	 * (non-Javadoc)
	 * @see com.viettel.smartoffice.api.KttsApi#getListHandoverByUser(com.viettel.smartoffice.ws.dto.KttsRequest)
	 */
	@Override
	public APIResponse getListHandoverByUser(@RequestBody KttsRequest dto) {
		LOG.info("Start method getListHandoverByUser");
		
		String employeeId = dto.getEmployeeId();
		Integer start = dto.getStart();
		Integer limit = dto.getLimit();
		Long status = dto.getStatus();
		String keyword = dto.getKeyword();
		
		KttsResponse response = kttsClient.getListHandoverByUser(employeeId, start, limit, status, keyword);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	/*
	 * (non-Javadoc)
	 * @see com.viettel.smartoffice.api.KttsApi#updateStatusEntity(com.viettel.smartoffice.ws.dto.KttsRequest)
	 */
	@Override
	public APIResponse updateStatusEntity(@RequestBody KttsRequest dto) {
		LOG.info("Start method updateStatusEntity");
		
		Long merEntityId = dto.getMerEntityId();
		Long count = dto.getCount();
		Long dateInTime = dto.getDate();
		Long type = dto.getType();
		String reason = dto.getReason();
		
		KttsResponse response = kttsClient.updateStatusEntity(merEntityId, count, dateInTime, type, reason);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	/*
	 * (non-Javadoc)
	 * @see com.viettel.smartoffice.api.KttsApi#updateTypeInHan(com.viettel.smartoffice.ws.dto.KttsRequest)
	 */
	@Override
	public APIResponse updateTypeInHan(@RequestBody KttsRequest dto) {
		LOG.info("Start method updateTypeInHan");
		
		Long idBBBGTSCN = dto.getIdBBBGTSCN();
		String reason = dto.getReason();
		Long type = dto.getType();
		
		KttsResponse response = kttsClient.updateTypeInHan(idBBBGTSCN, reason, type);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}
	
}
