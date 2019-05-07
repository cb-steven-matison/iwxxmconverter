//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SegmentPointPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentPointPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractSegmentPoint"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentPointPropertyType", propOrder = {
    "abstractSegmentPoint"
})
public class SegmentPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "AbstractSegmentPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractSegmentPointType> abstractSegmentPoint;

    /**
     * Gets the value of the abstractSegmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPointType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractSegmentPointType> getAbstractSegmentPoint() {
        return abstractSegmentPoint;
    }

    /**
     * Sets the value of the abstractSegmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AbstractSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TerminalSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnRouteSegmentPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPointType }{@code >}
     *     
     */
    public void setAbstractSegmentPoint(JAXBElement<? extends AbstractSegmentPointType> value) {
        this.abstractSegmentPoint = value;
    }

    public boolean isSetAbstractSegmentPoint() {
        return (this.abstractSegmentPoint!= null);
    }

}
