package com.viettel.smartoffice.controller.v1;

import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.viettel.smartoffice.api.TtnsRegisterInOutApi;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;
import com.viettel.smartoffice.ws.client.TtnsClient;
import com.viettel.smartoffice.ws.dto.TtnsRegisterInOutRequest;
import com.viettel.smartoffice.ws.dto.TtnsResponse;

@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class TtnsRegisterInOutController extends BaseController implements TtnsRegisterInOutApi {
	private static Logger LOG = LoggerFactory.getLogger(TtnsRegisterInOutController.class);

	@Autowired
	private TtnsClient ttnsClient;

	/*
	 * ------------------------------------------------
	 * RegisterInOut
	 * ------------------------------------------------
	 */
	@Override
	public APIResponse update(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsRegisterInOutRequest dto) {
		LOG.info("Start method update");
		
		TtnsResponse response = ttnsClient.update(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse delete(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRegisterInOutRequest dto) {
		LOG.info("Start method delete");
		
		TtnsResponse response = ttnsClient.delete(token, id, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse reason(@RequestHeader("TTNS-TOKEN") String token, Long syncTime, String type) {
		LOG.info("Start method reason");
		
		TtnsResponse response = ttnsClient.reason(token, syncTime, type);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse approved(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, Long status, Long from_time, Long end_time) {
		LOG.info("Start method approved");
		
		TtnsResponse response = ttnsClient.approved(token, id, status, from_time, end_time);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getListInOut(@RequestHeader("TTNS-TOKEN") String token, String type, Long sync_time) {
		LOG.info("Start method getListInOut");
		
		TtnsResponse response = ttnsClient.getListInOut(token, type, sync_time);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse workplace(@RequestHeader("TTNS-TOKEN") String token, String type, Long sync_time) {
		LOG.info("Start method workplace");
		
		TtnsResponse response = ttnsClient.workplace(token, type, sync_time);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse reasonById(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method reasonById");
		
		TtnsResponse response = ttnsClient.reasonById(token, id);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse inoutById(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method inoutById");
		
		TtnsResponse response = ttnsClient.inoutById(token, id);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse workplaceById(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method workplaceById");
		
		TtnsResponse response = ttnsClient.workplaceById(token, id);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse register(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsRegisterInOutRequest dto) {
		LOG.info("Start method register");
		
		TtnsResponse response = ttnsClient.register(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse registerGetList(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id
			, Long status
			, Long from_time
			, Long end_time) {
		LOG.info("Start method registerGetList");
		
		TtnsResponse response = ttnsClient.registerGetList(token, id, status, from_time, end_time);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}
}
