//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.net.opengis.om._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ObservationContext is a dataType, without identity, so may only be used
 * 				inline
 * 
 * <p>Java class for ObservationContextPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObservationContextPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/om/2.0}ObservationContext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationContextPropertyType", propOrder = {
    "observationContext"
})
public class ObservationContextPropertyType {

    @XmlElement(name = "ObservationContext", required = true)
    protected ObservationContextType observationContext;

    /**
     * Gets the value of the observationContext property.
     * 
     * @return
     *     possible object is
     *     {@link ObservationContextType }
     *     
     */
    public ObservationContextType getObservationContext() {
        return observationContext;
    }

    /**
     * Sets the value of the observationContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationContextType }
     *     
     */
    public void setObservationContext(ObservationContextType value) {
        this.observationContext = value;
    }

    public boolean isSetObservationContext() {
        return (this.observationContext!= null);
    }

}
