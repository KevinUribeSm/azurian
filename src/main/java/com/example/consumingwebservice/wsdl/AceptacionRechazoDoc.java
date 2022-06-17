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
 * <p>Clase Java para AceptacionRechazoDoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AceptacionRechazoDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="motivoRechazo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroFolio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rutEmisor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AceptacionRechazoDoc", namespace = "http://docs.ws.dte.azurian.com", propOrder = {
    "accion",
    "idTipoDocumento",
    "motivoRechazo",
    "numeroFolio",
    "rutEmisor"
})
public class AceptacionRechazoDoc {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer accion;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idTipoDocumento;
    @XmlElement(required = true, nillable = true)
    protected String motivoRechazo;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numeroFolio;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmisor;

    /**
     * Obtiene el valor de la propiedad accion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccion() {
        return accion;
    }

    /**
     * Define el valor de la propiedad accion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccion(Integer value) {
        this.accion = value;
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
     * Obtiene el valor de la propiedad motivoRechazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    /**
     * Define el valor de la propiedad motivoRechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoRechazo(String value) {
        this.motivoRechazo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFolio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroFolio() {
        return numeroFolio;
    }

    /**
     * Define el valor de la propiedad numeroFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroFolio(Integer value) {
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

}
