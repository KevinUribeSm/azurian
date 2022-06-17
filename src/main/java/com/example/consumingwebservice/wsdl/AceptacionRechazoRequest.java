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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AceptacionRechazoRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AceptacionRechazoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentos" type="{http://controller.ws.dte.azurian.com}ArrayOf_tns3_AceptacionRechazoDoc"/&gt;
 *         &lt;element name="nroResolucion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rutEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="wsApiKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AceptacionRechazoRequest", namespace = "http://request.ws.dte.azurian.com", propOrder = {
    "documentos",
    "nroResolucion",
    "rutEmpresa",
    "wsApiKey"
})
public class AceptacionRechazoRequest {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfTns3AceptacionRechazoDoc documentos;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nroResolucion;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String wsApiKey;

    /**
     * Obtiene el valor de la propiedad documentos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTns3AceptacionRechazoDoc }
     *     
     */
    public ArrayOfTns3AceptacionRechazoDoc getDocumentos() {
        return documentos;
    }

    /**
     * Define el valor de la propiedad documentos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTns3AceptacionRechazoDoc }
     *     
     */
    public void setDocumentos(ArrayOfTns3AceptacionRechazoDoc value) {
        this.documentos = value;
    }

    /**
     * Obtiene el valor de la propiedad nroResolucion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroResolucion() {
        return nroResolucion;
    }

    /**
     * Define el valor de la propiedad nroResolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroResolucion(Integer value) {
        this.nroResolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad rutEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRutEmpresa() {
        return rutEmpresa;
    }

    /**
     * Define el valor de la propiedad rutEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRutEmpresa(Integer value) {
        this.rutEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad wsApiKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsApiKey() {
        return wsApiKey;
    }

    /**
     * Define el valor de la propiedad wsApiKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsApiKey(String value) {
        this.wsApiKey = value;
    }

}
