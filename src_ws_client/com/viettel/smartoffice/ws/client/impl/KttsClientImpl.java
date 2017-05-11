package com.viettel.smartoffice.ws.client.impl;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.viettel.qldtktts.webservice.CountEntityByUser;
import com.viettel.qldtktts.webservice.CountEntityByUserResponse;
import com.viettel.qldtktts.webservice.GetListEntityByUser;
import com.viettel.qldtktts.webservice.GetListEntityByUserResponse;
import com.viettel.qldtktts.webservice.GetListEntityInHan;
import com.viettel.qldtktts.webservice.GetListEntityInHanResponse;
import com.viettel.qldtktts.webservice.GetListHandoverByUser;
import com.viettel.qldtktts.webservice.GetListHandoverByUserResponse;
import com.viettel.qldtktts.webservice.Kttsbo;
import com.viettel.qldtktts.webservice.UpdateStatusEntity;
import com.viettel.qldtktts.webservice.UpdateStatusEntityResponse;
import com.viettel.qldtktts.webservice.UpdateTypeInHan;
import com.viettel.qldtktts.webservice.UpdateTypeInHanResponse;
import com.viettel.smartoffice.ws.client.KttsClient;
import com.viettel.smartoffice.ws.client.util.LogbackInterceptor;
import com.viettel.smartoffice.ws.dto.KttsResponse;

/**
 * Using for testing
 * @author Nam, Nguyen Hoai <namnh@itsol.vn>
 *
 */
@Component
public class KttsClientImpl extends WebServiceGatewaySupport implements KttsClient {

	private static final Logger log = LoggerFactory.getLogger(KttsClientImpl.class);

	@Value("${ktts.ws.url}")
	private String urlKtts;
	
	@Value("${ktts.ws.username}")
	private String username;

	@Value("${ktts.ws.password}")
	private String password;
		
	protected void initGateway() {
		log.info("initGateway");
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.viettel.qldtktts.webservice");

		this.setDefaultUri(urlKtts);
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
		
		ClientInterceptor[] interceptors = new ClientInterceptor[1];
		interceptors[0] = new LogbackInterceptor();
		this.setInterceptors(interceptors);
		
		System.out.println("initGateway");
	}

	
	private WebServiceTemplate getInstanceWebServiceTemplate() {
		WebServiceTemplate webServiceTemplate = getWebServiceTemplate();
		return webServiceTemplate;
	}
	
	@SuppressWarnings("unchecked")
	public KttsResponse countEntityByUser(String employeeId, Long type, String keyword) {
		CountEntityByUser request = new CountEntityByUser();
		request.setUserName(username);
		request.setPassword(password);
		// Param
		request.setEmployeeId(employeeId);
		request.setType(type);
		request.setKeyword(keyword);
		
		JAXBElement<CountEntityByUserResponse> response = (JAXBElement<CountEntityByUserResponse>) getInstanceWebServiceTemplate()
			.marshalSendAndReceive(
					urlKtts,
					request,
					new SoapActionCallback(urlKtts));

		KttsResponse result = new KttsResponse();
		result.setData(response.getValue());
		result.setStatus("SUCCESS");
		return result;
	}

	@SuppressWarnings("unchecked")
	public KttsResponse getListEntityByUser(String employeeId, Long type, int start, int limit, String keyword) {
		GetListEntityByUser request = new GetListEntityByUser();
		request.setUserName(username);
		request.setPassword(password);
		// Param
		request.setEmployeeId(employeeId);
		request.setType(type);
		request.setStart(start);
		request.setLimit(limit);
		request.setKeyword(keyword);

		JAXBElement<GetListEntityByUserResponse> response = (JAXBElement<GetListEntityByUserResponse>) getInstanceWebServiceTemplate()
			.marshalSendAndReceive(
					urlKtts,
					request,
					new SoapActionCallback(urlKtts));

		return mappingKttsResponse(response.getValue().getReturn());
	}
	
	@SuppressWarnings("unchecked")
	public KttsResponse getListEntityInHan(Long idBBBGTSCN, int start, int limit) {
		GetListEntityInHan request = new GetListEntityInHan();
		request.setUserName(username);
		request.setPassword(password);
		// Param
		request.setIdBBBGTSCN(idBBBGTSCN);
		request.setStart(start);
		request.setLimit(limit);
		
		JAXBElement<GetListEntityInHanResponse> response = (JAXBElement<GetListEntityInHanResponse>) getInstanceWebServiceTemplate()
			.marshalSendAndReceive(
					urlKtts,
					request,
					new SoapActionCallback(urlKtts));

		return mappingKttsResponse(response.getValue().getReturn());
	}
	
	@SuppressWarnings("unchecked")
	public KttsResponse getListHandoverByUser(String employeeId, int start, int limit, Long status, String keyword) {
		GetListHandoverByUser request = new GetListHandoverByUser();
		request.setUserName(username);
		request.setPassword(password);
		// Param
		request.setEmployeeId(employeeId);
		request.setStatus(status);
		request.setStart(start);
		request.setLimit(limit);
		request.setKeyword(keyword);
		
		JAXBElement<GetListHandoverByUserResponse> response = (JAXBElement<GetListHandoverByUserResponse>) getInstanceWebServiceTemplate()
			.marshalSendAndReceive(
					urlKtts,
					request,
					new SoapActionCallback(urlKtts));

		return mappingKttsResponse(response.getValue().getReturn());
	}
	
	@SuppressWarnings("unchecked")
	public KttsResponse updateStatusEntity(Long merEntityId, Long count, Long dateInTime, Long type, String reason) {
		UpdateStatusEntity request = new UpdateStatusEntity();
		request.setUserName(username);
		request.setPassword(password);
		// Param
		request.setMerEntityId(merEntityId);
		request.setCount(count);
		request.setType(type);
		request.setReason(reason);
		
		// Set date
		if (dateInTime != null && dateInTime > 0) {
			Date updatedDate = new Date();
			updatedDate.setTime(dateInTime);
			String FORMATER = "dd/MM/yyyy";
		    DateFormat format = new SimpleDateFormat(FORMATER);
			request.setDate(format.format(updatedDate));
		}
		
		JAXBElement<UpdateStatusEntityResponse> response = (JAXBElement<UpdateStatusEntityResponse>) getInstanceWebServiceTemplate()
			.marshalSendAndReceive(
					urlKtts,
					request,
					new SoapActionCallback(urlKtts));

		return mappingKttsResponse(response.getValue().getReturn());
	}
	
	@SuppressWarnings("unchecked")
	public KttsResponse updateTypeInHan(Long idBBBGTSCN, String reason, Long type) {
		UpdateTypeInHan request = new UpdateTypeInHan();
		request.setUserName(username);
		request.setPassword(password);
		// Param
		request.setIdBBBGTSCN(idBBBGTSCN);
		request.setReason(reason);
		request.setType(type);

		JAXBElement<UpdateTypeInHanResponse> response = (JAXBElement<UpdateTypeInHanResponse>) getInstanceWebServiceTemplate()
			.marshalSendAndReceive(
					urlKtts,
					request,
					new SoapActionCallback(urlKtts));

		return mappingKttsResponse(response.getValue().getReturn());
	}
	
	private KttsResponse mappingKttsResponse(Kttsbo data) {
		KttsResponse response = new KttsResponse();
		response.setStatus(data.getStatus());
		if (StringUtils.equalsIgnoreCase("SUCCESS", data.getStatus())) {
			response.setData(data);
		} else {
			response.setErrorCode(data.getErrorCode());
			response.setErrorInfo(data.getErrorInfo());
		}
    	return response;
    }
}