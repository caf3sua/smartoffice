package com.viettel.smartoffice.controller.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.api.VofficeApi;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;
import com.viettel.smartoffice.ws.client.VofficeClient;
import com.viettel.smartoffice.ws.dto.VofficeRequest;
import com.viettel.smartoffice.ws.dto.VofficeResponse;

@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class VofficeController extends BaseController implements VofficeApi {
	private static Logger LOG = LoggerFactory.getLogger(VofficeController.class);

	@Autowired
	private VofficeClient vofficeClient;

	@Override
	public APIResponse getAccessToken(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getAccessToken");
		
		VofficeResponse response = vofficeClient.getAccessToken(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}
	
	@Override
	public APIResponse getSumTask(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getSumTask");
		
		VofficeResponse response = vofficeClient.getSumTask(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getSumDoc(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getSumDoc");
		
		VofficeResponse response = vofficeClient.getSumDoc(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse searchListTask(@RequestBody VofficeRequest dto) {
		LOG.info("Start method searchListTask");
		
		VofficeResponse response = vofficeClient.searchTask(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse searchListMission(@RequestBody VofficeRequest dto) {
		LOG.info("Start method searchListMission");
		
		VofficeResponse response = vofficeClient.searchMission(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse searchListDoc(@RequestBody VofficeRequest dto) {
		LOG.info("Start method searchListDoc");
		
		VofficeResponse response = vofficeClient.searchDoc(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}
	
	@Override
	public @ResponseBody APIResponse searchListText(@RequestBody VofficeRequest dto) {
		LOG.info("Start method searchListText");
		
		VofficeResponse response = vofficeClient.searchText(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getListMeeting(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getListMeeting");
		
		VofficeResponse response = vofficeClient.getListMeetingNearest(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getDetailDoc(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getDetailDoc");
		
		VofficeResponse response = vofficeClient.getDocumentDetail(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getGetListUserSignWithRole(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getGetListUserSignWithRole");
		
		VofficeResponse response = vofficeClient.getGetListUserSignWithRole(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}
	
	@Override
	public APIResponse getTextDetail(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getTextDetail");
		
		VofficeResponse response = vofficeClient.getTextDetail(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getSumMission(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getSumMission");
		
		VofficeResponse response = vofficeClient.getSumMission(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}
	
	@Override
	public APIResponse getTaskDetail(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getTaskDetail");
		
		VofficeResponse response = vofficeClient.getTaskDetail(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getMissionDetail(@RequestBody VofficeRequest dto) {
		LOG.info("Start method getMissionDetail");
		
		VofficeResponse response = vofficeClient.getMissionDetail(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

}
