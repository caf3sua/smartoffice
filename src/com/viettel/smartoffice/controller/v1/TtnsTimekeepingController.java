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

import com.viettel.smartoffice.api.TtnsTimeKeepingApi;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;
import com.viettel.smartoffice.ws.client.TtnsClient;
import com.viettel.smartoffice.ws.dto.TtnsResponse;
import com.viettel.smartoffice.ws.dto.TtnsTimeKeepingRequest;

@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class TtnsTimekeepingController extends BaseController implements TtnsTimeKeepingApi {
	private static Logger LOG = LoggerFactory.getLogger(TtnsTimekeepingController.class);

	@Autowired
	private TtnsClient ttnsClient;

	/*
	 * ------------------------------------------------
	 * Timekeeping - Chấm công
	 * ------------------------------------------------
	 */
	@Override
	public APIResponse updateTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto) {
		LOG.info("Start method updateTimekeeping");
		
		TtnsResponse response = ttnsClient.updateTimekeeping(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse approveTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto) {
		LOG.info("Start method approveTimekeeping");
		
		TtnsResponse response = ttnsClient.approveTimekeeping(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse calculateSabatical(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto) {
		LOG.info("Start method calculateSabatical");
		
		TtnsResponse response = ttnsClient.calculateSabatical(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse deleteTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto) {
		LOG.info("Start method deleteTimekeeping");
		
		TtnsResponse response = ttnsClient.deleteTimekeeping(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse workDayTypeByIdTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method workDayTypeTimekeeping");
		
		TtnsResponse response = ttnsClient.workDayTypeByIdTimekeeping(token, id);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse historyInoutTimekeeping(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto) {
		LOG.info("Start method historyInoutTimekeeping");
		
		TtnsResponse response = ttnsClient.historyInoutTimekeeping(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse workDayTypeTimeKeeping(@RequestHeader("TTNS-TOKEN") String token, @QueryParam("workdayTypeId") Long workdayTypeId
			, String code
			, String name
			, Long affairMode
			, Long shiftMod
			, Long overtimeMode) {
		LOG.info("Start method workDayTypeTimeKeeping");
		
		TtnsResponse response = ttnsClient.workDayTypeTimeKeeping(token, workdayTypeId, code, name, affairMode, shiftMod, overtimeMode);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse timeKeepingByemployeeId(@RequestHeader("TTNS-TOKEN") String token, Long employee_id, Long manager_id, Long from_time,
			Long to_time) {
		LOG.info("Start method timeKeepingByemployeeId");
		
		TtnsResponse response = ttnsClient.timeKeepingByemployeeId(token, employee_id, manager_id, from_time, to_time);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse timeKeepingRegister(@RequestHeader("TTNS-TOKEN") String token, @RequestBody TtnsTimeKeepingRequest dto) {
		LOG.info("Start method timeKeepingGetList");
		
		TtnsResponse response = ttnsClient.timeKeepingRegister(token, dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse mobileIntegrated(@RequestHeader("TTNS-TOKEN") String token, Long employee_id, String uuid) {
		LOG.info("Start method mobileIntegrated");
		
		TtnsResponse response = ttnsClient.mobileIntegrated(token, employee_id, uuid);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse timeKeepingDevice(@RequestHeader("TTNS-TOKEN") String token, String type, Long syncTime) {
		LOG.info("Start method timeKeepingDevice");
		
		TtnsResponse response = ttnsClient.timeKeepingDevice(token, type, syncTime);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse timeKeepingDeviceId(@RequestHeader("TTNS-TOKEN") String token, @PathVariable("id") String id) {
		LOG.info("Start method timeKeepingDeviceId");
		
		TtnsResponse response = ttnsClient.timeKeepingDeviceId(token, id);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

}
