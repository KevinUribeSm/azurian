//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.16 a las 10:00:43 AM CLT 
//


package com.example.consumingwebservice.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="marcaTransferenciaReturn" type="{http://response.ws.dte.azurian.com}MarcaTransferenciaResponse" maxOccurs="unbounded"/&gt;
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
    "marcaTransferenciaReturn"
})
@XmlRootElement(name = "marcaTransferenciaResponse")
public class MarcaTransferenciaResponse {

    @XmlElement(required = true)
    protected List<MarcaTransferenciaResponse2> marcaTransferenciaReturn;

    /**
     * Gets the value of the marcaTransferenciaReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marcaTransferenciaReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarcaTransferenciaReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarcaTransferenciaResponse2 }
     * 
     * 
     */
    public List<MarcaTransferenciaResponse2> getMarcaTransferenciaReturn() {
        if (marcaTransferenciaReturn == null) {
            marcaTransferenciaReturn = new ArrayList<MarcaTransferenciaResponse2>();
        }
        return this.marcaTransferenciaReturn;
    }

}
