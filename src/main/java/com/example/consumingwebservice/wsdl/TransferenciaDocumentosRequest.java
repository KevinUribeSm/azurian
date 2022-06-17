//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.16 a las 10:00:43 AM CLT 
//


package com.example.consumingwebservice.wsdl;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para TransferenciaDocumentosRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransferenciaDocumentosRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estadoDte" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="folio" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nroResolucion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rutEmisor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "TransferenciaDocumentosRequest", namespace = "http://request.ws.dte.azurian.com", propOrder = {
    "estadoDte",
    "fechaDesde",
    "fechaHasta",
    "folio",
    "idTipoDocumento",
    "nroResolucion",
    "rutEmisor",
    "rutEmpresa",
    "wsApiKey"
})
@XmlRootElement(name = "transferenciaDocumentos")
public class TransferenciaDocumentosRequest {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer estadoDte;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected Date fechaDesde;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected Date fechaHasta;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long folio;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer idTipoDocumento;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer nroResolucion;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmisor;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer rutEmpresa;
    @XmlElement(required = true, nillable = true)
    protected String wsApiKey;
  
 

	/**
     * Obtiene el valor de la propiedad estadoDte.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoDte() {
        return estadoDte;
    }

    /**
     * Define el valor de la propiedad estadoDte.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoDte(Integer value) {
        this.estadoDte = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDesde(Date value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHasta(Date value) {
        this.fechaHasta = value;
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

	@Override
	public String toString() {
		return "TransferenciaDocumentosRequest [estadoDte=" + estadoDte + ", fechaDesde=" + fechaDesde + ", fechaHasta="
				+ fechaHasta + ", folio=" + folio + ", idTipoDocumento=" + idTipoDocumento + ", nroResolucion="
				+ nroResolucion + ", rutEmisor=" + rutEmisor + ", rutEmpresa=" + rutEmpresa + ", wsApiKey=" + wsApiKey
				+ "]";
	}

}
