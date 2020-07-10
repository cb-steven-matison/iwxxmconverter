//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerodromeRunwayStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runway" type="{http://icao.int/iwxxm/3.0}RunwayDirectionPropertyType" minOccurs="0"/>
 *         &lt;element name="depositType" type="{http://icao.int/iwxxm/3.0}RunwayDepositsType" minOccurs="0"/>
 *         &lt;element name="contamination" type="{http://icao.int/iwxxm/3.0}RunwayContaminationType" minOccurs="0"/>
 *         &lt;element name="depthOfDeposit" type="{http://icao.int/iwxxm/3.0}DistanceWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="estimatedSurfaceFrictionOrBrakingAction" type="{http://icao.int/iwxxm/3.0}RunwayFrictionCoefficientType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allRunways" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cleared" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fromPreviousReport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeRunwayStateType", propOrder = {
    "runway",
    "depositType",
    "contamination",
    "depthOfDeposit",
    "estimatedSurfaceFrictionOrBrakingAction",
    "extension"
})
public class AerodromeRunwayStateType {

    @XmlElementRef(name = "runway", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDirectionPropertyType> runway;
    @XmlElementRef(name = "depositType", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayDepositsType> depositType;
    @XmlElementRef(name = "contamination", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayContaminationType> contamination;
    @XmlElementRef(name = "depthOfDeposit", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceWithNilReasonType> depthOfDeposit;
    @XmlElementRef(name = "estimatedSurfaceFrictionOrBrakingAction", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayFrictionCoefficientType> estimatedSurfaceFrictionOrBrakingAction;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "allRunways")
    protected Boolean allRunways;
    @XmlAttribute(name = "cleared")
    protected Boolean cleared;
    @XmlAttribute(name = "fromPreviousReport")
    protected Boolean fromPreviousReport;

    /**
     * Gets the value of the runway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayDirectionPropertyType> getRunway() {
        return runway;
    }

    /**
     * Sets the value of the runway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDirectionPropertyType }{@code >}
     *     
     */
    public void setRunway(JAXBElement<RunwayDirectionPropertyType> value) {
        this.runway = value;
    }

    public boolean isSetRunway() {
        return (this.runway!= null);
    }

    /**
     * Gets the value of the depositType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayDepositsType }{@code >}
     *     
     */
    public JAXBElement<RunwayDepositsType> getDepositType() {
        return depositType;
    }

    /**
     * Sets the value of the depositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayDepositsType }{@code >}
     *     
     */
    public void setDepositType(JAXBElement<RunwayDepositsType> value) {
        this.depositType = value;
    }

    public boolean isSetDepositType() {
        return (this.depositType!= null);
    }

    /**
     * Gets the value of the contamination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayContaminationType }{@code >}
     *     
     */
    public JAXBElement<RunwayContaminationType> getContamination() {
        return contamination;
    }

    /**
     * Sets the value of the contamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayContaminationType }{@code >}
     *     
     */
    public void setContamination(JAXBElement<RunwayContaminationType> value) {
        this.contamination = value;
    }

    public boolean isSetContamination() {
        return (this.contamination!= null);
    }

    /**
     * Gets the value of the depthOfDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<DistanceWithNilReasonType> getDepthOfDeposit() {
        return depthOfDeposit;
    }

    /**
     * Sets the value of the depthOfDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public void setDepthOfDeposit(JAXBElement<DistanceWithNilReasonType> value) {
        this.depthOfDeposit = value;
    }

    public boolean isSetDepthOfDeposit() {
        return (this.depthOfDeposit!= null);
    }

    /**
     * Gets the value of the estimatedSurfaceFrictionOrBrakingAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayFrictionCoefficientType }{@code >}
     *     
     */
    public JAXBElement<RunwayFrictionCoefficientType> getEstimatedSurfaceFrictionOrBrakingAction() {
        return estimatedSurfaceFrictionOrBrakingAction;
    }

    /**
     * Sets the value of the estimatedSurfaceFrictionOrBrakingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayFrictionCoefficientType }{@code >}
     *     
     */
    public void setEstimatedSurfaceFrictionOrBrakingAction(JAXBElement<RunwayFrictionCoefficientType> value) {
        this.estimatedSurfaceFrictionOrBrakingAction = value;
    }

    public boolean isSetEstimatedSurfaceFrictionOrBrakingAction() {
        return (this.estimatedSurfaceFrictionOrBrakingAction!= null);
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    /**
     * Gets the value of the allRunways property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllRunways() {
        return allRunways;
    }

    /**
     * Sets the value of the allRunways property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllRunways(boolean value) {
        this.allRunways = value;
    }

    public boolean isSetAllRunways() {
        return (this.allRunways!= null);
    }

    public void unsetAllRunways() {
        this.allRunways = null;
    }

    /**
     * Gets the value of the cleared property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCleared() {
        return cleared;
    }

    /**
     * Sets the value of the cleared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCleared(boolean value) {
        this.cleared = value;
    }

    public boolean isSetCleared() {
        return (this.cleared!= null);
    }

    public void unsetCleared() {
        this.cleared = null;
    }

    /**
     * Gets the value of the fromPreviousReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFromPreviousReport() {
        return fromPreviousReport;
    }

    /**
     * Sets the value of the fromPreviousReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFromPreviousReport(boolean value) {
        this.fromPreviousReport = value;
    }

    public boolean isSetFromPreviousReport() {
        return (this.fromPreviousReport!= null);
    }

    public void unsetFromPreviousReport() {
        this.fromPreviousReport = null;
    }

}
