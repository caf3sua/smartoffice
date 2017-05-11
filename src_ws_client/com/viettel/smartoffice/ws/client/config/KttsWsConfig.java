package com.viettel.smartoffice.ws.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.viettel.smartoffice.ws.client.impl.KttsClientImpl;

@Configuration
public class KttsWsConfig {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.viettel.qldtktts.webservice");
		return marshaller;
	}
	@Bean
	public KttsClientImpl kktsClient(Jaxb2Marshaller marshaller) {
		KttsClientImpl client = new KttsClientImpl();
		client.setDefaultUri("http://10.58.71.138:8877/SRC_WS_SMART_OFFICE/SmartOfficeService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
