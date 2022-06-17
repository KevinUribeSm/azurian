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
 *         &lt;element name="descargarArchivoReturn" type="{http://response.ws.dte.azurian.com}DescargarArchivoResponse"/&gt;
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
    "descargarArchivoReturn"
})
@XmlRootElement(name = "descargarArchivoResponse")
public class DescargarArchivoResponse {

    @XmlElement(required = true)
    protected DescargarArchivoResponse2 descargarArchivoReturn;

    /**
     * Obtiene el valor de la propiedad descargarArchivoReturn.
     * 
     * @return
     *     possible object is
     *     {@link DescargarArchivoResponse2 }
     *     
     */
    public DescargarArchivoResponse2 getDescargarArchivoReturn() {
        return descargarArchivoReturn;
    }

    /**
     * Define el valor de la propiedad descargarArchivoReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link DescargarArchivoResponse2 }
     *     
     */
    public void setDescargarArchivoReturn(DescargarArchivoResponse2 value) {
        this.descargarArchivoReturn = value;
    }

}
