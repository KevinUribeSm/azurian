package cl.nobelti.grupogtd.azuriantoax.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import cl.nobelti.grupogtd.azuriantoax.client.TransferenciaDocumentosClient;

@Configuration
public class SoapConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.consumingwebservice.wsdl");
		return marshaller;
	}
	
	@Bean
	public TransferenciaDocumentosClient transferenciaDocumentosClient(Jaxb2Marshaller marshaller) {
		TransferenciaDocumentosClient client = new TransferenciaDocumentosClient();
		client.setDefaultUri("http://soa.grupogtd.com:7503/services/grupogtd/azurian/serviciorecepcion?wsdl");
	    client.setMarshaller(marshaller);
	    client.setUnmarshaller(marshaller);
	    return client;
	}
}
