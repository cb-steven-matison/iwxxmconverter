//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeteorologyPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeteorologyPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}Meteorology"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologyPropertyType", propOrder = {
    "meteorology"
})
public class MeteorologyPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "Meteorology", required = true)
    protected MeteorologyType meteorology;

    /**
     * Gets the value of the meteorology property.
     * 
     * @return
     *     possible object is
     *     {@link MeteorologyType }
     *     
     */
    public MeteorologyType getMeteorology() {
        return meteorology;
    }

    /**
     * Sets the value of the meteorology property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologyType }
     *     
     */
    public void setMeteorology(MeteorologyType value) {
        this.meteorology = value;
    }

    public boolean isSetMeteorology() {
        return (this.meteorology!= null);
    }

}
