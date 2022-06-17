package cl.nobelti.grupogtd.azuriantoax;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumingwebservice.wsdl.TransferenciaDocumentos;
import com.example.consumingwebservice.wsdl.TransferenciaDocumentosRequest;
import com.example.consumingwebservice.wsdl.TransferenciaDocumentosResponse;

import cl.nobelti.grupogtd.azuriantoax.client.TransferenciaDocumentosClient;

@SpringBootApplication
@RestController
public class AzurianWsApplication {
	
	@Autowired
	private TransferenciaDocumentosClient client;
	
	@GetMapping("/getDocumentos")
	public TransferenciaDocumentosResponse invokeDocumentosResponse () {
	
		 TransferenciaDocumentos documentos = new TransferenciaDocumentos();
		 TransferenciaDocumentosRequest request = new TransferenciaDocumentosRequest();
		
		 request.setFechaDesde(Date.valueOf("2021-10-01"));
		 request.setFechaDesde(Date.valueOf("2021-12-31"));
		 request.setNroResolucion(0);
		 request.setRutEmpresa(76560668);
		 request.setWsApiKey("60fa6eb48c91c4e704a4d9c22a9d0e0a4e9bf2fa899bdb604c19ee19aa5c");
		 documentos.setRequest(request);
	
		System.out.println("sddsaadssaddasdsad " + documentos);
		
		System.out.println("#############" + client.transferenciaDocumentosResponse(documentos));
		return client.transferenciaDocumentosResponse(documentos);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzurianWsApplication.class, args);
	}



}
