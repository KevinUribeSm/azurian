package cl.nobelti.grupogtd.azuriantoax.client;

import java.sql.Date;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.example.consumingwebservice.wsdl.TransferenciaDocumentos;
import com.example.consumingwebservice.wsdl.TransferenciaDocumentosRequest;
import com.example.consumingwebservice.wsdl.TransferenciaDocumentosResponse;

public class TransferenciaDocumentosClient extends WebServiceGatewaySupport{
	
	public TransferenciaDocumentosResponse transferenciaDocumentosResponse(TransferenciaDocumentos request) {
				
		/*TransferenciaDocumentosRequest req = new TransferenciaDocumentosRequest();
		req.setFechaDesde(Date.valueOf("2021-10-01"));
		req.setFechaHasta(Date.valueOf("2021-12-31"));
		req.setNroResolucion(0);
		req.setRutEmpresa(76560668);
		req.setWsApiKey("60fa6eb48c91c4e704a4d9c22a9d0e0a4e9bf2fa899bdb604c19ee19aa5c");
		

		System.out.println("req!!!!!!!!!!!!!!!" + req);*/
		
		TransferenciaDocumentosResponse response = (TransferenciaDocumentosResponse) getWebServiceTemplate()
			.marshalSendAndReceive("http://soa.grupogtd.com:7503/services/grupogtd/azurian/serviciorecepcion?wsdl", request);
		
		return response;
	}
}
