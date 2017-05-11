package com.viettel.smartoffice.ws.client.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import com.viettel.smartoffice.ws.client.PmtcClient;

/**
 * Using for testing
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@Component
public class PmtcClientImpl implements PmtcClient {

	private static final Logger log = LoggerFactory.getLogger(PmtcClientImpl.class);
	
	@Value("${ttns.ws.url}")
	private String urlPmtc;
	
	
}