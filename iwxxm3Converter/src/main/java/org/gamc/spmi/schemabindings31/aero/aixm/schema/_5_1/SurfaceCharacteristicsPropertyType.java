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
 * <p>Java class for SurfaceCharacteristicsPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceCharacteristicsPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}SurfaceCharacteristics"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceCharacteristicsPropertyType", propOrder = {
    "surfaceCharacteristics"
})
public class SurfaceCharacteristicsPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "SurfaceCharacteristics", required = true)
    protected SurfaceCharacteristicsType surfaceCharacteristics;

    /**
     * Gets the value of the surfaceCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceCharacteristicsType }
     *     
     */
    public SurfaceCharacteristicsType getSurfaceCharacteristics() {
        return surfaceCharacteristics;
    }

    /**
     * Sets the value of the surfaceCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceCharacteristicsType }
     *     
     */
    public void setSurfaceCharacteristics(SurfaceCharacteristicsType value) {
        this.surfaceCharacteristics = value;
    }

    public boolean isSetSurfaceCharacteristics() {
        return (this.surfaceCharacteristics!= null);
    }

}
