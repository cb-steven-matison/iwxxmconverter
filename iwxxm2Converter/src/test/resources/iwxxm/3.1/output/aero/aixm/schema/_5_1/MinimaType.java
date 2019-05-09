//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package aero.aixm.schema._5_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MinimaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinimaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}MinimaPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractMinimaExtension"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimaType", propOrder = {
    "altitude",
    "altitudeCode",
    "altitudeReference",
    "height",
    "militaryHeight",
    "radioHeight",
    "heightCode",
    "heightReference",
    "visibility",
    "militaryVisibility",
    "mandatoryRVR",
    "remoteAltimeterMinima",
    "adjustmentINOP",
    "annotation",
    "extension"
})
public class MinimaType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "altitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> altitude;
    @XmlElementRef(name = "altitudeCode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimumAltitudeType> altitudeCode;
    @XmlElementRef(name = "altitudeReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> altitudeReference;
    @XmlElementRef(name = "height", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> height;
    @XmlElementRef(name = "militaryHeight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> militaryHeight;
    @XmlElementRef(name = "radioHeight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> radioHeight;
    @XmlElementRef(name = "heightCode", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMinimumHeightType> heightCode;
    @XmlElementRef(name = "heightReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeHeightReferenceType> heightReference;
    @XmlElementRef(name = "visibility", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> visibility;
    @XmlElementRef(name = "militaryVisibility", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> militaryVisibility;
    @XmlElementRef(name = "mandatoryRVR", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> mandatoryRVR;
    @XmlElementRef(name = "remoteAltimeterMinima", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> remoteAltimeterMinima;
    @XmlElement(nillable = true)
    protected List<EquipmentUnavailableAdjustmentPropertyType> adjustmentINOP;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<MinimaType.Extension> extension;

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.altitude = value;
    }

    public boolean isSetAltitude() {
        return (this.altitude!= null);
    }

    /**
     * Gets the value of the altitudeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumAltitudeType }{@code >}
     *     
     */
    public JAXBElement<CodeMinimumAltitudeType> getAltitudeCode() {
        return altitudeCode;
    }

    /**
     * Sets the value of the altitudeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumAltitudeType }{@code >}
     *     
     */
    public void setAltitudeCode(JAXBElement<CodeMinimumAltitudeType> value) {
        this.altitudeCode = value;
    }

    public boolean isSetAltitudeCode() {
        return (this.altitudeCode!= null);
    }

    /**
     * Gets the value of the altitudeReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getAltitudeReference() {
        return altitudeReference;
    }

    /**
     * Sets the value of the altitudeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setAltitudeReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.altitudeReference = value;
    }

    public boolean isSetAltitudeReference() {
        return (this.altitudeReference!= null);
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.height = value;
    }

    public boolean isSetHeight() {
        return (this.height!= null);
    }

    /**
     * Gets the value of the militaryHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMilitaryHeight() {
        return militaryHeight;
    }

    /**
     * Sets the value of the militaryHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMilitaryHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.militaryHeight = value;
    }

    public boolean isSetMilitaryHeight() {
        return (this.militaryHeight!= null);
    }

    /**
     * Gets the value of the radioHeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getRadioHeight() {
        return radioHeight;
    }

    /**
     * Sets the value of the radioHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setRadioHeight(JAXBElement<ValDistanceVerticalType> value) {
        this.radioHeight = value;
    }

    public boolean isSetRadioHeight() {
        return (this.radioHeight!= null);
    }

    /**
     * Gets the value of the heightCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumHeightType }{@code >}
     *     
     */
    public JAXBElement<CodeMinimumHeightType> getHeightCode() {
        return heightCode;
    }

    /**
     * Sets the value of the heightCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMinimumHeightType }{@code >}
     *     
     */
    public void setHeightCode(JAXBElement<CodeMinimumHeightType> value) {
        this.heightCode = value;
    }

    public boolean isSetHeightCode() {
        return (this.heightCode!= null);
    }

    /**
     * Gets the value of the heightReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeHeightReferenceType> getHeightReference() {
        return heightReference;
    }

    /**
     * Sets the value of the heightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeHeightReferenceType }{@code >}
     *     
     */
    public void setHeightReference(JAXBElement<CodeHeightReferenceType> value) {
        this.heightReference = value;
    }

    public boolean isSetHeightReference() {
        return (this.heightReference!= null);
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVisibility(JAXBElement<ValDistanceType> value) {
        this.visibility = value;
    }

    public boolean isSetVisibility() {
        return (this.visibility!= null);
    }

    /**
     * Gets the value of the militaryVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getMilitaryVisibility() {
        return militaryVisibility;
    }

    /**
     * Sets the value of the militaryVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setMilitaryVisibility(JAXBElement<ValDistanceType> value) {
        this.militaryVisibility = value;
    }

    public boolean isSetMilitaryVisibility() {
        return (this.militaryVisibility!= null);
    }

    /**
     * Gets the value of the mandatoryRVR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMandatoryRVR() {
        return mandatoryRVR;
    }

    /**
     * Sets the value of the mandatoryRVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMandatoryRVR(JAXBElement<CodeYesNoType> value) {
        this.mandatoryRVR = value;
    }

    public boolean isSetMandatoryRVR() {
        return (this.mandatoryRVR!= null);
    }

    /**
     * Gets the value of the remoteAltimeterMinima property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getRemoteAltimeterMinima() {
        return remoteAltimeterMinima;
    }

    /**
     * Sets the value of the remoteAltimeterMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRemoteAltimeterMinima(JAXBElement<CodeYesNoType> value) {
        this.remoteAltimeterMinima = value;
    }

    public boolean isSetRemoteAltimeterMinima() {
        return (this.remoteAltimeterMinima!= null);
    }

    /**
     * Gets the value of the adjustmentINOP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentINOP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentINOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipmentUnavailableAdjustmentPropertyType }
     * 
     * 
     */
    public List<EquipmentUnavailableAdjustmentPropertyType> getAdjustmentINOP() {
        if (adjustmentINOP == null) {
            adjustmentINOP = new ArrayList<EquipmentUnavailableAdjustmentPropertyType>();
        }
        return this.adjustmentINOP;
    }

    public boolean isSetAdjustmentINOP() {
        return ((this.adjustmentINOP!= null)&&(!this.adjustmentINOP.isEmpty()));
    }

    public void unsetAdjustmentINOP() {
        this.adjustmentINOP = null;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
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
     * {@link MinimaType.Extension }
     * 
     * 
     */
    public List<MinimaType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<MinimaType.Extension>();
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractMinimaExtension"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractMinimaExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractMinimaExtension")
        protected AbstractExtensionType abstractMinimaExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractMinimaExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractMinimaExtension() {
            return abstractMinimaExtension;
        }

        /**
         * Sets the value of the abstractMinimaExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractMinimaExtension(AbstractExtensionType value) {
            this.abstractMinimaExtension = value;
        }

        public boolean isSetAbstractMinimaExtension() {
            return (this.abstractMinimaExtension!= null);
        }

        /**
         * Gets the value of the owns property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Sets the value of the owns property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(boolean value) {
            this.owns = value;
        }

        public boolean isSetOwns() {
            return (this.owns!= null);
        }

        public void unsetOwns() {
            this.owns = null;
        }

    }

}