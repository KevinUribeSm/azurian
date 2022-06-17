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
 *         &lt;element name="aceptacionRechazoReturn" type="{http://response.ws.dte.azurian.com}AceptacionRechazoResponse"/&gt;
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
    "aceptacionRechazoReturn"
})
@XmlRootElement(name = "aceptacionRechazoResponse")
public class AceptacionRechazoResponse {

    @XmlElement(required = true)
    protected AceptacionRechazoResponse2 aceptacionRechazoReturn;

    /**
     * Obtiene el valor de la propiedad aceptacionRechazoReturn.
     * 
     * @return
     *     possible object is
     *     {@link AceptacionRechazoResponse2 }
     *     
     */
    public AceptacionRechazoResponse2 getAceptacionRechazoReturn() {
        return aceptacionRechazoReturn;
    }

    /**
     * Define el valor de la propiedad aceptacionRechazoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link AceptacionRechazoResponse2 }
     *     
     */
    public void setAceptacionRechazoReturn(AceptacionRechazoResponse2 value) {
        this.aceptacionRechazoReturn = value;
    }

}
