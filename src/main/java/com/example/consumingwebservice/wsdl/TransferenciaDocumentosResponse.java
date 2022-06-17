//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.16 a las 10:00:43 AM CLT 
//


package com.example.consumingwebservice.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transferenciaDocumentosReturn" type="{http://response.ws.dte.azurian.com}TransferenciaDocumentosResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transferenciaDocumentosReturn"
})
@XmlRootElement(name = "transferenciaDocumentosResponse")
public class TransferenciaDocumentosResponse {

    @XmlElement(required = true)
    protected TransferenciaDocumentosResponse2 transferenciaDocumentosReturn;

    /**
     * Obtiene el valor de la propiedad transferenciaDocumentosReturn.
     * 
     * @return
     *     possible object is
     *     {@link TransferenciaDocumentosResponse2 }
     *     
     */
    public TransferenciaDocumentosResponse2 getTransferenciaDocumentosReturn() {
        return transferenciaDocumentosReturn;
    }

    /**
     * Define el valor de la propiedad transferenciaDocumentosReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferenciaDocumentosResponse2 }
     *     
     */
    public void setTransferenciaDocumentosReturn(TransferenciaDocumentosResponse2 value) {
        this.transferenciaDocumentosReturn = value;
    }

	@Override
	public String toString() {
		return "TransferenciaDocumentosResponse [transferenciaDocumentosReturn=" + transferenciaDocumentosReturn.toString() + "]";
	}
    
    

}
