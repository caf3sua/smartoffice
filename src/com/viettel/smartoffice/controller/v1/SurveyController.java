package com.viettel.smartoffice.controller.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;

import com.viettel.smartoffice.api.SurveyApi;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 * Referred: https://github.com/mpetersen/aes-example, 
 * http://niels.nu/blog/2015/json-web-tokens.html
 */
@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class SurveyController extends BaseController implements SurveyApi {
    private static Logger LOG = LoggerFactory.getLogger(SurveyController.class);
    
//    @Autowired
//	private SurveyClient surveyClient;
//
//	@Override
//	public APIResponse ttnsListSurvey() {
//		LOG.info("START method ttnsListSurvey");
//		
//		// Call service
//		List<SurveyDTO> data = surveyClient.ttnsListSurvey();
//		if (null == data || data.size() == 0) {
//			LOG.debug("Data not found");
//			return APIResponse.toAPIResponse("Not found data", HttpStatus.SC_NOT_FOUND);
//		}
//		return APIResponse.toOkResponse(data);
//	}
//
//	@Override
//	public APIResponse ttnsGetSurvey(@PathVariable("id") String id) {
//		LOG.info("START method ttnsGetSurvey, id:" + id);
//		// Validate
//		Validate.isTrue(StringUtils.isNotBlank(id), "SurveyID is blank");
//		
//		// Call service
//		String linkSurvey = surveyClient.ttnsGetSurvey(id);
//		
//		if (StringUtils.isEmpty(linkSurvey)) {
//			LOG.debug("Survey not found");
//			return APIResponse.toAPIResponse("Not found data", HttpStatus.SC_NOT_FOUND);
//		}
//		return APIResponse.toOkResponse(linkSurvey);
//	}
//
//	@Override
//	public APIResponse ttnsGetNumberSurvey() {
//		LOG.info("START method ttnsGetNumberSurvey");
//		
//		// Call service
//		int numberSurvey = surveyClient.ttnsGetNumberSurvey();
//		
//		return APIResponse.toOkResponse(numberSurvey);
//	}
//
//	@Override
//	public APIResponse pmtcGetCongNoCaNhan(CongNoCaNhanDTO congNoCaNhanDTO) {
//		LOG.info("START method pmtcGetCongNoCaNhan, param[startDate:" 
//					+ congNoCaNhanDTO.getStartDate() + ", endDate:" + congNoCaNhanDTO.getEndDate() + "]");
//		// Validate
//		Validate.isTrue(congNoCaNhanDTO.getStartDate() != null, "StartDate is null");
//		Validate.isTrue(congNoCaNhanDTO.getEndDate() != null, "EndDate is null");
//		
//		// Call service
//		CongNoCaNhanDTO data = surveyClient.pmtcGetCongNoCaNhan(congNoCaNhanDTO.getStartDate(), congNoCaNhanDTO.getEndDate());
//		
//		if (null == data) {
//			LOG.debug("CongNoCaNhan not found");
//			return APIResponse.toAPIResponse("Not found data", HttpStatus.SC_NOT_FOUND);
//		}
//		
//		return APIResponse.toOkResponse(data);
//	}
//
//	public SurveyClient getSurveyClient() {
//		return surveyClient;
//	}
//
//	public void setSurveyClient(SurveyClient surveyClient) {
//		this.surveyClient = surveyClient;
//	}
	
}
