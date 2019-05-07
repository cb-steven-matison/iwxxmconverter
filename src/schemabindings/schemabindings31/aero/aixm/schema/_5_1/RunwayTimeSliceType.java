//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

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
 * <p>Java class for RunwayTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}RunwayPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwayExtension"/>
 *                 &lt;/sequence>
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
@XmlType(name = "RunwayTimeSliceType", propOrder = {
    "designator",
    "type",
    "nominalLength",
    "lengthAccuracy",
    "nominalWidth",
    "widthAccuracy",
    "widthShoulder",
    "lengthStrip",
    "widthStrip",
    "lengthOffset",
    "widthOffset",
    "abandoned",
    "surfaceProperties",
    "associatedAirportHeliport",
    "overallContaminant",
    "annotation",
    "areaContaminant",
    "extension"
})
public class RunwayTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwayType> type;
    @XmlElementRef(name = "nominalLength", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalLength;
    @XmlElementRef(name = "lengthAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthAccuracy;
    @XmlElementRef(name = "nominalWidth", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> nominalWidth;
    @XmlElementRef(name = "widthAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthAccuracy;
    @XmlElementRef(name = "widthShoulder", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthShoulder;
    @XmlElementRef(name = "lengthStrip", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> lengthStrip;
    @XmlElementRef(name = "widthStrip", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> widthStrip;
    @XmlElementRef(name = "lengthOffset", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> lengthOffset;
    @XmlElementRef(name = "widthOffset", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceSignedType> widthOffset;
    @XmlElementRef(name = "abandoned", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> abandoned;
    @XmlElementRef(name = "surfaceProperties", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SurfaceCharacteristicsPropertyType> surfaceProperties;
    @XmlElementRef(name = "associatedAirportHeliport", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> associatedAirportHeliport;
    @XmlElement(nillable = true)
    protected List<RunwayContaminationPropertyType> overallContaminant;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<RunwaySectionContaminationPropertyType> areaContaminant;
    protected List<RunwayTimeSliceType.Extension> extension;

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayType }{@code >}
     *     
     */
    public JAXBElement<CodeRunwayType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwayType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeRunwayType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the nominalLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getNominalLength() {
        return nominalLength;
    }

    /**
     * Sets the value of the nominalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setNominalLength(JAXBElement<ValDistanceType> value) {
        this.nominalLength = value;
    }

    public boolean isSetNominalLength() {
        return (this.nominalLength!= null);
    }

    /**
     * Gets the value of the lengthAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLengthAccuracy() {
        return lengthAccuracy;
    }

    /**
     * Sets the value of the lengthAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthAccuracy(JAXBElement<ValDistanceType> value) {
        this.lengthAccuracy = value;
    }

    public boolean isSetLengthAccuracy() {
        return (this.lengthAccuracy!= null);
    }

    /**
     * Gets the value of the nominalWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getNominalWidth() {
        return nominalWidth;
    }

    /**
     * Sets the value of the nominalWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setNominalWidth(JAXBElement<ValDistanceType> value) {
        this.nominalWidth = value;
    }

    public boolean isSetNominalWidth() {
        return (this.nominalWidth!= null);
    }

    /**
     * Gets the value of the widthAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthAccuracy() {
        return widthAccuracy;
    }

    /**
     * Sets the value of the widthAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthAccuracy(JAXBElement<ValDistanceType> value) {
        this.widthAccuracy = value;
    }

    public boolean isSetWidthAccuracy() {
        return (this.widthAccuracy!= null);
    }

    /**
     * Gets the value of the widthShoulder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthShoulder() {
        return widthShoulder;
    }

    /**
     * Sets the value of the widthShoulder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthShoulder(JAXBElement<ValDistanceType> value) {
        this.widthShoulder = value;
    }

    public boolean isSetWidthShoulder() {
        return (this.widthShoulder!= null);
    }

    /**
     * Gets the value of the lengthStrip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getLengthStrip() {
        return lengthStrip;
    }

    /**
     * Sets the value of the lengthStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setLengthStrip(JAXBElement<ValDistanceType> value) {
        this.lengthStrip = value;
    }

    public boolean isSetLengthStrip() {
        return (this.lengthStrip!= null);
    }

    /**
     * Gets the value of the widthStrip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWidthStrip() {
        return widthStrip;
    }

    /**
     * Sets the value of the widthStrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWidthStrip(JAXBElement<ValDistanceType> value) {
        this.widthStrip = value;
    }

    public boolean isSetWidthStrip() {
        return (this.widthStrip!= null);
    }

    /**
     * Gets the value of the lengthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceSignedType> getLengthOffset() {
        return lengthOffset;
    }

    /**
     * Sets the value of the lengthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setLengthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.lengthOffset = value;
    }

    public boolean isSetLengthOffset() {
        return (this.lengthOffset!= null);
    }

    /**
     * Gets the value of the widthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceSignedType> getWidthOffset() {
        return widthOffset;
    }

    /**
     * Sets the value of the widthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceSignedType }{@code >}
     *     
     */
    public void setWidthOffset(JAXBElement<ValDistanceSignedType> value) {
        this.widthOffset = value;
    }

    public boolean isSetWidthOffset() {
        return (this.widthOffset!= null);
    }

    /**
     * Gets the value of the abandoned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getAbandoned() {
        return abandoned;
    }

    /**
     * Sets the value of the abandoned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setAbandoned(JAXBElement<CodeYesNoType> value) {
        this.abandoned = value;
    }

    public boolean isSetAbandoned() {
        return (this.abandoned!= null);
    }

    /**
     * Gets the value of the surfaceProperties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public JAXBElement<SurfaceCharacteristicsPropertyType> getSurfaceProperties() {
        return surfaceProperties;
    }

    /**
     * Sets the value of the surfaceProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SurfaceCharacteristicsPropertyType }{@code >}
     *     
     */
    public void setSurfaceProperties(JAXBElement<SurfaceCharacteristicsPropertyType> value) {
        this.surfaceProperties = value;
    }

    public boolean isSetSurfaceProperties() {
        return (this.surfaceProperties!= null);
    }

    /**
     * Gets the value of the associatedAirportHeliport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getAssociatedAirportHeliport() {
        return associatedAirportHeliport;
    }

    /**
     * Sets the value of the associatedAirportHeliport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setAssociatedAirportHeliport(JAXBElement<AirportHeliportPropertyType> value) {
        this.associatedAirportHeliport = value;
    }

    public boolean isSetAssociatedAirportHeliport() {
        return (this.associatedAirportHeliport!= null);
    }

    /**
     * Gets the value of the overallContaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overallContaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverallContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwayContaminationPropertyType }
     * 
     * 
     */
    public List<RunwayContaminationPropertyType> getOverallContaminant() {
        if (overallContaminant == null) {
            overallContaminant = new ArrayList<RunwayContaminationPropertyType>();
        }
        return this.overallContaminant;
    }

    public boolean isSetOverallContaminant() {
        return ((this.overallContaminant!= null)&&(!this.overallContaminant.isEmpty()));
    }

    public void unsetOverallContaminant() {
        this.overallContaminant = null;
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
     * Gets the value of the areaContaminant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaContaminant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaContaminant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RunwaySectionContaminationPropertyType }
     * 
     * 
     */
    public List<RunwaySectionContaminationPropertyType> getAreaContaminant() {
        if (areaContaminant == null) {
            areaContaminant = new ArrayList<RunwaySectionContaminationPropertyType>();
        }
        return this.areaContaminant;
    }

    public boolean isSetAreaContaminant() {
        return ((this.areaContaminant!= null)&&(!this.areaContaminant.isEmpty()));
    }

    public void unsetAreaContaminant() {
        this.areaContaminant = null;
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
     * {@link RunwayTimeSliceType.Extension }
     * 
     * 
     */
    public List<RunwayTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<RunwayTimeSliceType.Extension>();
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractRunwayExtension"/>
     *       &lt;/sequence>
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
        "abstractRunwayExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractRunwayExtension", required = true)
        protected AbstractExtensionType abstractRunwayExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractRunwayExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractRunwayExtension() {
            return abstractRunwayExtension;
        }

        /**
         * Sets the value of the abstractRunwayExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractRunwayExtension(AbstractExtensionType value) {
            this.abstractRunwayExtension = value;
        }

        public boolean isSetAbstractRunwayExtension() {
            return (this.abstractRunwayExtension!= null);
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
