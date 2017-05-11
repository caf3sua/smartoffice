package com.viettel.smartoffice.ws.client.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.viettel.smartoffice.ws.client.QlttClient;
import com.viettel.smartoffice.ws.dto.QlttRequest;
import com.viettel.smartoffice.ws.dto.QlttResponse;

/**
 * Using for testing
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@Component
public class QlttClientImpl implements QlttClient {

	private static final Logger log = LoggerFactory.getLogger(QlttClientImpl.class);

	public static final long SEARCH_TYPE = 0;
	public static final long MOST_VIEW = 1;
	public static final long NEWEST = 2;

	public static final Integer CATEGORY_TYPE_FULL = 1;
	public static final Integer CATEGORY_TYPE_ALL_CHILD = 2;
	public static final Integer CATEGORY_TYPE_CHILD_FIRST = 3;
	
	@Value("${qltt.ws.url}")
	private String urlQltt;
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

	@Override
	public QlttResponse authenticate(QlttRequest dto) {
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<QlttRequest> request = new HttpEntity<QlttRequest>(dto, headers);
		ResponseEntity<Object> response = restTemplate.postForEntity(urlQltt + "/json/qlttService/authenticate", request , Object.class);
		return mappingVofficeResponse(response);
	}

	@Override
	public QlttResponse getTypePermission(QlttRequest dto) {
		return null;
	}
	
	@Override
	public QlttResponse getDocumentInfo(QlttRequest dto) {
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<QlttRequest> request = new HttpEntity<QlttRequest>(dto, headers);
		ResponseEntity<Object> response = restTemplate.postForEntity(urlQltt + "/json/qlttService/getDocumentInfo", request, Object.class);
		return mappingVofficeResponse(response);
	}

	@Override
	public QlttResponse getDocumentCategory(QlttRequest dto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<QlttRequest> request = new HttpEntity<QlttRequest>(dto, headers);
		ResponseEntity<Object> response = restTemplate().postForEntity(urlQltt + "/json/qlttService/getDocumentCategory", request , Object.class);
		return mappingVofficeResponse(response);
	}
	
	@Override
	public QlttResponse downloadFile(QlttRequest dto) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<QlttRequest> request = new HttpEntity<QlttRequest>(dto, headers);
		ResponseEntity<String> response = restTemplate().postForEntity(urlQltt + "/json/qlttService/downloadFileAttach", request , String.class);
		return mappingVofficeResponse(response);
	}
	
	private QlttResponse mappingVofficeResponse(ResponseEntity<? extends Object> data) {
		QlttResponse response = new QlttResponse();
		response.setStatusCode(data.getStatusCode().value());

		if (data.getStatusCode() == HttpStatus.OK || data.getStatusCode() == HttpStatus.CREATED) {
	        response.setData(data.getBody());
		}
		
    	return response;
    }
}