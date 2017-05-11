/*
 * Copyright (c) 2016 Bitel Peru and/or its affiliates. All rights reserved.
 */
package com.viettel.smartoffice.ws.client;
import com.viettel.smartoffice.ws.dto.QlttRequest;
import com.viettel.smartoffice.ws.dto.QlttResponse;

/**
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
public interface QlttClient {
	public QlttResponse authenticate(QlttRequest dto);
	
	/**
	 * Call getDocumentInfo
	 * @param dto
	 * @return
	 */
	public QlttResponse getDocumentInfo(QlttRequest dto);
	
	public QlttResponse getDocumentCategory(QlttRequest dto);
	
	/**
	 * getDocumentCategory
	 * @param dto
	 * @return
	 */
	public QlttResponse downloadFile(QlttRequest dto);
	
	public QlttResponse getTypePermission(QlttRequest dto);
}