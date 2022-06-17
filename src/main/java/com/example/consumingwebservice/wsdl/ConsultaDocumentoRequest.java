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
 * <p>Clase Java para ConsultaDocumentoRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaDocumentoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nroResolucion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroFolio" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rutEmisor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rutEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trackId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
@XmlType(name = "ConsultaDocumentoRequest", namespace = "http://request.ws.dte.azurian.com", propOrder = {
    "idTipoDocumento",
    "nroResolucion",
    "numeroFolio",
    "rutEmisor",
    "rutEmpresa",
    "trackId",
    "wsApiKey"
})
public class ConsultaDocumentoRequest {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idTipoDocumento;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nroResolucion;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long numeroFolio;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmisor;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmpresa;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long trackId;
    @XmlElement(required = true, nillable = true)
    protected String wsApiKey;

    /**
     * Obtiene el valor de la propiedad idTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Define el valor de la propiedad idTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoDocumento(Integer value) {
        this.idTipoDocumento = value;
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
     * Obtiene el valor de la propiedad numeroFolio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroFolio() {
        return numeroFolio;
    }

    /**
     * Define el valor de la propiedad numeroFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroFolio(Long value) {
        this.numeroFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad rutEmisor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRutEmisor() {
        return rutEmisor;
    }

    /**
     * Define el valor de la propiedad rutEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRutEmisor(Integer value) {
        this.rutEmisor = value;
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
     * Obtiene el valor de la propiedad trackId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrackId() {
        return trackId;
    }

    /**
     * Define el valor de la propiedad trackId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrackId(Long value) {
        this.trackId = value;
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
