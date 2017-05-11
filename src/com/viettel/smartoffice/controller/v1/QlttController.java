package com.viettel.smartoffice.controller.v1;

import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.viettel.smartoffice.api.QlttApi;
import com.viettel.smartoffice.framework.api.APIResponse;
import com.viettel.smartoffice.framework.controller.BaseController;
import com.viettel.smartoffice.ws.client.QlttClient;
import com.viettel.smartoffice.ws.dto.QlttRequest;
import com.viettel.smartoffice.ws.dto.QlttResponse;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@Controller
@PropertySources(@PropertySource("classpath:config.properties"))
public class QlttController extends BaseController implements QlttApi {
	private static Logger LOG = LoggerFactory.getLogger(QlttController.class);

	@Autowired
	private QlttClient qlttClient;

	@Override
	public APIResponse authenticate(@RequestBody QlttRequest dto) {
		LOG.info("Start method authenticate");
		
		QlttResponse response = qlttClient.authenticate(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getDocumentInfo(@RequestBody QlttRequest dto) {
		LOG.info("Start method getDocumentInfo");
		
		QlttResponse response = qlttClient.getDocumentInfo(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getDocumentCategory(@RequestBody QlttRequest dto) {
		LOG.info("Start method getDocumentCategory");
		
		// // type search toan bo linh vuc: CATEGORY_TYPE_FULL = 1,
		// // search toan bo con cua id don vi: CATEGORY_TYPE_ALL_CHILD = 2
		// // search con gan nhatcua id don vi : CATEGORY_TYPE_CHILD_FIRST = 3
		QlttResponse response = qlttClient.getDocumentCategory(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse downloadFile(@RequestBody QlttRequest dto) {
		LOG.info("Start method downloadFile");

		QlttResponse response = qlttClient.downloadFile(dto);
		if (response == null) {
			LOG.debug("Not Found");
			return APIResponse.toErrorResponse("Not found data");
		}
		
		/*
		 * Test download file
		 */
		BASE64Decoder encoder = new BASE64Decoder();
		String output = (String) response.getData();
		 
		byte[] byteData;
		try {
			byteData = encoder.decodeBuffer(output);
			FileOutputStream file;
			file = new FileOutputStream("D:/test.pdf");
			 file.write(byteData);
			 file.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return APIResponse.toAPIResponse(response);
	}

	@Override
	public APIResponse getTypePermission(@RequestBody QlttRequest dto) {
		return null;
	}
	
}
