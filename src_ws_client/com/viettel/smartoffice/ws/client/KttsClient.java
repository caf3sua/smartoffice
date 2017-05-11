/*
 * Copyright (c) 2016 Bitel Peru and/or its affiliates. All rights reserved.
 */
package com.viettel.smartoffice.ws.client;
import com.viettel.smartoffice.ws.dto.KttsResponse;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
public interface KttsClient {
	public KttsResponse countEntityByUser(String employeeId, Long type, String keyword);
	
	public KttsResponse getListEntityByUser(String employeeId, Long type, int start, int limit, String keyword);
	
	public KttsResponse getListEntityInHan(Long idBBBGTSCN, int start, int limit);
	
	public KttsResponse getListHandoverByUser(String employeeId, int start, int limit, Long status, String keyword);
	
	public KttsResponse updateStatusEntity(Long merEntityId, Long count, Long dateInTime, Long type, String reason);
	
	public KttsResponse updateTypeInHan(Long idBBBGTSCN, String reason, Long type);
}