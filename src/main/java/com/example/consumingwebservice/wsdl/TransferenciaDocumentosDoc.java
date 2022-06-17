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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TransferenciaDocumentosDoc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransferenciaDocumentosDoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fechaRecepcion" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idTipoDocuemnto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rutEmisor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="trackId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferenciaDocumentosDoc", namespace = "http://docs.ws.dte.azurian.com", propOrder = {
    "fechaEmision",
    "fechaRecepcion",
    "folio",
    "idTipoDocuemnto",
    "montoTotal",
    "razonSocial",
    "rutEmisor",
    "trackId"
})
public class TransferenciaDocumentosDoc {

    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaRecepcion;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long folio;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idTipoDocuemnto;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer montoTotal;
    @XmlElement(required = true, nillable = true)
    protected String razonSocial;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmisor;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long trackId;

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Define el valor de la propiedad fechaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecepcion(XMLGregorianCalendar value) {
        this.fechaRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolio(Long value) {
        this.folio = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoDocuemnto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoDocuemnto() {
        return idTipoDocuemnto;
    }

    /**
     * Define el valor de la propiedad idTipoDocuemnto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoDocuemnto(Integer value) {
        this.idTipoDocuemnto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMontoTotal(Integer value) {
        this.montoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
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

}
