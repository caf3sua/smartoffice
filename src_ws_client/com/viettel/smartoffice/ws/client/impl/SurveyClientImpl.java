package com.viettel.smartoffice.ws.client.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import com.viettel.smartoffice.ws.client.SurveyClient;

/**
 * Using for testing
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@Component
public class SurveyClientImpl implements SurveyClient {

	private static final Logger log = LoggerFactory.getLogger(SurveyClientImpl.class);
	
	@Value("${ttns.ws.url}")
	private String urlSurvey;
	
	
}