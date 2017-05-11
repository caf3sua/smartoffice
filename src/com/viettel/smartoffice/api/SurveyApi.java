package com.viettel.smartoffice.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.viettel.smartoffice.framework.api.APIResponse;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@RequestMapping("v1/survey")
public interface SurveyApi {
	static final String JSON_API_CONTENT_HEADER = "Content-type=application/json";
	
	
}
