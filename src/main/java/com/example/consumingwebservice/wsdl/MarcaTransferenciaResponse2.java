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
 * <p>Clase Java para MarcaTransferenciaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MarcaTransferenciaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoRespuesta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nroAmbiente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numeroFolio" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rutEmisor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rutEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarcaTransferenciaResponse", namespace = "http://response.ws.dte.azurian.com", propOrder = {
    "codigoRespuesta",
    "descripcion",
    "idTipoDocumento",
    "nroAmbiente",
    "numeroFolio",
    "rutEmisor",
    "rutEmpresa"
})
public class MarcaTransferenciaResponse2 {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codigoRespuesta;
    @XmlElement(required = true, nillable = true)
    protected String descripcion;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idTipoDocumento;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nroAmbiente;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long numeroFolio;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmisor;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmpresa;

    /**
     * Obtiene el valor de la propiedad codigoRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoRespuesta() {
        return codigoRespuesta;
    }

    /**
     * Define el valor de la propiedad codigoRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoRespuesta(Integer value) {
        this.codigoRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

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
     * Obtiene el valor de la propiedad nroAmbiente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroAmbiente() {
        return nroAmbiente;
    }

    /**
     * Define el valor de la propiedad nroAmbiente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroAmbiente(Integer value) {
        this.nroAmbiente = value;
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

}
