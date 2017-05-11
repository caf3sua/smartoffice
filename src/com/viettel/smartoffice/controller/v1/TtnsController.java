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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpClientErrorException;

import com.viettel.smartoffice.api.TtnsApi;
import com.viettel.smartoffice.api.TtnsRegisterInOutApi;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;
import com.viettel.smartoffice.ws.client.TtnsClient;
import com.viettel.smartoffice.ws.dto.TtnsRegisterInOutRequest;
import com.viettel.smartoffice.ws.dto.TtnsRequest;
import com.viettel.smartoffice.ws.dto.TtnsResponse;

@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class TtnsController extends BaseController implements TtnsApi {
	private static Logger LOG = LoggerFactory.getLogger(TtnsController.class);

	@Autowired
	private TtnsClient ttnsClient;

	@Override
	public APIResponse getAccessToken() {
		LOG.info("Start method getAccessToken");
		
		TtnsResponse response = ttnsClient.getAccessToken();
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toOkResponse(response);
	}

	@Override
	public APIResponse workProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method workProcess");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.workProcess(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse workProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method workProcessLatest");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.workProcessLatest(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse educationProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto) {
		LOG.info("Start method educationProcess");
		
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.educationProcess(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse educationProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method educationProcessLatest");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.educationProcessLatest(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse salaryProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method salaryProcess");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.salaryProcess(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse salaryProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method salaryProcessLatest");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.salaryProcessLatest(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse insuranceProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method insuranceProcess");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.insuranceProcess(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse insuranceProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method insuranceProcessLatest");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.insuranceProcessLatest(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse empTypeProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method empTypeProcess");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.empTypeProcess(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse empTypeProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method empTypeProcessLatest");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.empTypeProcessLatest(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse managerTypeProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method managerTypeProcess");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.managerTypeProcess(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse managerTypeProcessLatest(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method managerTypeProcessLatest");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.managerTypeProcessLatest(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse reward(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method reward");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.reward(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse descipline(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method descipline");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.descipline(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse taxReduction(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method taxReduction");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.taxReduction(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse familyRelationship(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method familyRelationship");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.familyRelationship(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse relicFeature(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method relicFeature");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.relicFeature(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public @ResponseBody APIResponse compassionateLeaveGetByEmployeeId(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, 
				@QueryParam("from_date") String fromDate,
				@QueryParam("to_date") String todate,
				@QueryParam("type") String type,
				@QueryParam("status") String status) {
		LOG.info("Start method compassionateLeaveGetByEmployeeId, employeeId:" + id);
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		dto.setFrom_date(fromDate);
		dto.setTo_date(todate);
		dto.setType(type);
		dto.setStatus(status);
		
		TtnsResponse response = ttnsClient.compassionateLeaveGetByEmployeeId(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public @ResponseBody APIResponse compassionateLeaveGetList(@RequestHeader("TTNS-TOKEN") String token, 
				@QueryParam("type") String type,
				@QueryParam("personalFormId") String personalFormId) {
		LOG.info("Start method compassionateLeaveGetList");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setType(type);
		dto.setPersonal_form_id(personalFormId);
		
		TtnsResponse response = ttnsClient.compassionateLeaveGetList(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	
	@Override
	public APIResponse compassionateLeaveRegister(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto) {
		LOG.info("Start method compassionateLeaveRegister");
		
		// Set param
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.compassionateLeaveRegister(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse compassionateLeaveDelete(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto) {
		LOG.info("Start method compassionateLeaveDelete");
		APIResponse result = null;
		
		try {
			// Set param
			dto.setId(id);
			
			TtnsResponse response = ttnsClient.compassionateLeaveDelete(token, dto);
			if (response == null) {
				LOG.debug("Not Found");
				return APIResponse.toErrorResponse("Not found data");
			}
			
			result = APIResponse.toAPIResponse(response);
		} catch (HttpClientErrorException he) {
			LOG.error(he.getMessage(), he);
			result = APIResponse.toAPIResponse(he.getMessage(), he.getStatusCode().value());
		}
		
		return result;
	}

	@Override
	public APIResponse compassionateLeaveSign(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id, @RequestBody TtnsRequest dto) {
		LOG.info("Start method compassionateLeaveSign");
		
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.compassionateLeaveSign(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse allowanceProcess(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method allowanceProcess");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.allowanceProcess(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse attachFile(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method attachFile");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.attachFile(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse remainingAnnual(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method remainingAnnual");
		
		TtnsRequest dto = new TtnsRequest();
		dto.setId(id);
		
		TtnsResponse response = ttnsClient.remainingAnnual(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse employeeDaily(@RequestHeader("TTNS-TOKEN") String token, TtnsRequest dto) {
		LOG.info("Start method employeeDaily");
		
		TtnsResponse response = ttnsClient.employeeDaily(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

}
