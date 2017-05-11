package com.viettel.smartoffice.ws.client;

import com.viettel.smartoffice.ws.dto.VofficeRequest;
import com.viettel.smartoffice.ws.dto.VofficeResponse;

public interface VofficeClient {
	
	public VofficeResponse getAccessToken(VofficeRequest dto);
	
	public VofficeResponse getSumMission(VofficeRequest dto);
	
	public VofficeResponse getSumTask(VofficeRequest dto);

	public VofficeResponse getSumDoc(VofficeRequest dto);
	
	public VofficeResponse searchTask(VofficeRequest dto);
		
	public VofficeResponse searchMission(VofficeRequest dto);
	
	public VofficeResponse searchDoc(VofficeRequest dto);
	
	public VofficeResponse searchText(VofficeRequest dto);
	
	public VofficeResponse getListMeetingNearest(VofficeRequest dto);
			
	public VofficeResponse getDocumentDetail(VofficeRequest dto);
	
	public VofficeResponse getGetListUserSignWithRole(VofficeRequest dto);
	
	public VofficeResponse getTextDetail(VofficeRequest dto);
	
	public VofficeResponse getTaskDetail(VofficeRequest dto);
	
	public VofficeResponse getMissionDetail(VofficeRequest dto);
}
