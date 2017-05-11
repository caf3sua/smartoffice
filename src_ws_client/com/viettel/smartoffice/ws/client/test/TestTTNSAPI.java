package com.viettel.smartoffice.ws.client.test;

import org.junit.Before;
import org.junit.Test;

import com.viettel.smartoffice.ws.client.TtnsClient;
import com.viettel.smartoffice.ws.client.impl.TtnsClientImpl;
import com.viettel.smartoffice.ws.dto.TtnsResponse;

public class TestTTNSAPI {

	private TtnsClient ttnsClient;
	
	public TtnsClient getTtnsClient() {
		return ttnsClient;
	}

	public void setTtnsClient(TtnsClient ttnsClient) {
		this.ttnsClient = ttnsClient;
	}
	
  @Before
  public void setUp() throws Exception {
	  ttnsClient = new TtnsClientImpl();
  }

  @Test
  public void testGetAccessToken() {
	  //String response = ttnsClient.getAccessToken();
	  //System.out.println(response);
  }



//  @Test
//  public void testGetAccessToken1() {
//	  NullHttpServletRequest req = new NullHttpServletRequest();
//	    TTNSAPIUtils api = TTNSAPIUtils.getInstance(req, "http://10.58.71.138:8765/TTNSAPIs");
//	    String accessKey = api.getAccessToken();
//	    	    
//	  // http://10.58.71.138:8765/TTNSAPIs/api/v1/employee/41378/profile
//    //NullHttpServletRequest req = new NullHttpServletRequest();
//    //TTNSAPIUtils api = TTNSAPIUtils.getInstance(req, "http://10.58.71.138:8765/TTNSAPIs");
//	    
//	    String reString = api.callService(formData, "/api/v1/timeKeeping/device", "GET", null);
//	    
//    String accessKey = api.getAccessToken();
//    //assertTrue(!CommonUtils.isNullOrEmpty(accessKey));
//  }

}
