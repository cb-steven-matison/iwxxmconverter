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
 * <p>Java class for FlightRoutingElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRoutingElementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}FlightRoutingElementPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightRoutingElementExtension"/>
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
@XmlType(name = "FlightRoutingElementType", propOrder = {
    "orderNumber",
    "speed",
    "speedReference",
    "speedCriteria",
    "flightLevel",
    "elementDirectFlightElement",
    "elementRoutePortionElement",
    "elementStandardInstrumentDepartureElement",
    "elementStandardInstrumentArrivalElement",
    "pointElementFixDesignatedPoint",
    "pointElementNavaidSystem",
    "pointElementPosition",
    "pointElementRunwayPoint",
    "pointElementAimingPoint",
    "pointElementAirportReferencePoint",
    "elementAirspaceElement",
    "elementAirportHeliportElement",
    "elementAerialRefuellingElement",
    "annotation",
    "extension"
})
public class FlightRoutingElementType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "orderNumber", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoSequenceType> orderNumber;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElementRef(name = "speedReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeSpeedReferenceType> speedReference;
    @XmlElementRef(name = "speedCriteria", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeComparisonType> speedCriteria;
    @XmlElement(nillable = true)
    protected List<FlightRestrictionLevelPropertyType> flightLevel;
    @XmlElementRef(name = "element_directFlightElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectFlightSegmentPropertyType> elementDirectFlightElement;
    @XmlElementRef(name = "element_routePortionElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePortionPropertyType> elementRoutePortionElement;
    @XmlElementRef(name = "element_standardInstrumentDepartureElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentDeparturePropertyType> elementStandardInstrumentDepartureElement;
    @XmlElementRef(name = "element_standardInstrumentArrivalElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardInstrumentArrivalPropertyType> elementStandardInstrumentArrivalElement;
    @XmlElementRef(name = "pointElement_fixDesignatedPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DesignatedPointPropertyType> pointElementFixDesignatedPoint;
    @XmlElementRef(name = "pointElement_navaidSystem", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NavaidPropertyType> pointElementNavaidSystem;
    @XmlElementRef(name = "pointElement_position", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPropertyType> pointElementPosition;
    @XmlElementRef(name = "pointElement_runwayPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RunwayCentrelinePointPropertyType> pointElementRunwayPoint;
    @XmlElementRef(name = "pointElement_aimingPoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TouchDownLiftOffPropertyType> pointElementAimingPoint;
    @XmlElementRef(name = "pointElement_airportReferencePoint", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> pointElementAirportReferencePoint;
    @XmlElementRef(name = "element_airspaceElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspacePropertyType> elementAirspaceElement;
    @XmlElementRef(name = "element_airportHeliportElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirportHeliportPropertyType> elementAirportHeliportElement;
    @XmlElementRef(name = "element_aerialRefuellingElement", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerialRefuellingPropertyType> elementAerialRefuellingElement;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<FlightRoutingElementType.Extension> extension;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public JAXBElement<NoSequenceType> getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoSequenceType }{@code >}
     *     
     */
    public void setOrderNumber(JAXBElement<NoSequenceType> value) {
        this.orderNumber = value;
    }

    public boolean isSetOrderNumber() {
        return (this.orderNumber!= null);
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public JAXBElement<ValSpeedType> getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValSpeedType }{@code >}
     *     
     */
    public void setSpeed(JAXBElement<ValSpeedType> value) {
        this.speed = value;
    }

    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    /**
     * Gets the value of the speedReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeSpeedReferenceType> getSpeedReference() {
        return speedReference;
    }

    /**
     * Sets the value of the speedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeSpeedReferenceType }{@code >}
     *     
     */
    public void setSpeedReference(JAXBElement<CodeSpeedReferenceType> value) {
        this.speedReference = value;
    }

    public boolean isSetSpeedReference() {
        return (this.speedReference!= null);
    }

    /**
     * Gets the value of the speedCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeComparisonType }{@code >}
     *     
     */
    public JAXBElement<CodeComparisonType> getSpeedCriteria() {
        return speedCriteria;
    }

    /**
     * Sets the value of the speedCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeComparisonType }{@code >}
     *     
     */
    public void setSpeedCriteria(JAXBElement<CodeComparisonType> value) {
        this.speedCriteria = value;
    }

    public boolean isSetSpeedCriteria() {
        return (this.speedCriteria!= null);
    }

    /**
     * Gets the value of the flightLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightRestrictionLevelPropertyType }
     * 
     * 
     */
    public List<FlightRestrictionLevelPropertyType> getFlightLevel() {
        if (flightLevel == null) {
            flightLevel = new ArrayList<FlightRestrictionLevelPropertyType>();
        }
        return this.flightLevel;
    }

    public boolean isSetFlightLevel() {
        return ((this.flightLevel!= null)&&(!this.flightLevel.isEmpty()));
    }

    public void unsetFlightLevel() {
        this.flightLevel = null;
    }

    /**
     * Gets the value of the elementDirectFlightElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentPropertyType }{@code >}
     *     
     */
    public JAXBElement<DirectFlightSegmentPropertyType> getElementDirectFlightElement() {
        return elementDirectFlightElement;
    }

    /**
     * Sets the value of the elementDirectFlightElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectFlightSegmentPropertyType }{@code >}
     *     
     */
    public void setElementDirectFlightElement(JAXBElement<DirectFlightSegmentPropertyType> value) {
        this.elementDirectFlightElement = value;
    }

    public boolean isSetElementDirectFlightElement() {
        return (this.elementDirectFlightElement!= null);
    }

    /**
     * Gets the value of the elementRoutePortionElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePortionPropertyType> getElementRoutePortionElement() {
        return elementRoutePortionElement;
    }

    /**
     * Sets the value of the elementRoutePortionElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePortionPropertyType }{@code >}
     *     
     */
    public void setElementRoutePortionElement(JAXBElement<RoutePortionPropertyType> value) {
        this.elementRoutePortionElement = value;
    }

    public boolean isSetElementRoutePortionElement() {
        return (this.elementRoutePortionElement!= null);
    }

    /**
     * Gets the value of the elementStandardInstrumentDepartureElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentDeparturePropertyType> getElementStandardInstrumentDepartureElement() {
        return elementStandardInstrumentDepartureElement;
    }

    /**
     * Sets the value of the elementStandardInstrumentDepartureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentDeparturePropertyType }{@code >}
     *     
     */
    public void setElementStandardInstrumentDepartureElement(JAXBElement<StandardInstrumentDeparturePropertyType> value) {
        this.elementStandardInstrumentDepartureElement = value;
    }

    public boolean isSetElementStandardInstrumentDepartureElement() {
        return (this.elementStandardInstrumentDepartureElement!= null);
    }

    /**
     * Gets the value of the elementStandardInstrumentArrivalElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public JAXBElement<StandardInstrumentArrivalPropertyType> getElementStandardInstrumentArrivalElement() {
        return elementStandardInstrumentArrivalElement;
    }

    /**
     * Sets the value of the elementStandardInstrumentArrivalElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardInstrumentArrivalPropertyType }{@code >}
     *     
     */
    public void setElementStandardInstrumentArrivalElement(JAXBElement<StandardInstrumentArrivalPropertyType> value) {
        this.elementStandardInstrumentArrivalElement = value;
    }

    public boolean isSetElementStandardInstrumentArrivalElement() {
        return (this.elementStandardInstrumentArrivalElement!= null);
    }

    /**
     * Gets the value of the pointElementFixDesignatedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<DesignatedPointPropertyType> getPointElementFixDesignatedPoint() {
        return pointElementFixDesignatedPoint;
    }

    /**
     * Sets the value of the pointElementFixDesignatedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DesignatedPointPropertyType }{@code >}
     *     
     */
    public void setPointElementFixDesignatedPoint(JAXBElement<DesignatedPointPropertyType> value) {
        this.pointElementFixDesignatedPoint = value;
    }

    public boolean isSetPointElementFixDesignatedPoint() {
        return (this.pointElementFixDesignatedPoint!= null);
    }

    /**
     * Gets the value of the pointElementNavaidSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public JAXBElement<NavaidPropertyType> getPointElementNavaidSystem() {
        return pointElementNavaidSystem;
    }

    /**
     * Sets the value of the pointElementNavaidSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavaidPropertyType }{@code >}
     *     
     */
    public void setPointElementNavaidSystem(JAXBElement<NavaidPropertyType> value) {
        this.pointElementNavaidSystem = value;
    }

    public boolean isSetPointElementNavaidSystem() {
        return (this.pointElementNavaidSystem!= null);
    }

    /**
     * Gets the value of the pointElementPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public JAXBElement<PointPropertyType> getPointElementPosition() {
        return pointElementPosition;
    }

    /**
     * Sets the value of the pointElementPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     *     
     */
    public void setPointElementPosition(JAXBElement<PointPropertyType> value) {
        this.pointElementPosition = value;
    }

    public boolean isSetPointElementPosition() {
        return (this.pointElementPosition!= null);
    }

    /**
     * Gets the value of the pointElementRunwayPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public JAXBElement<RunwayCentrelinePointPropertyType> getPointElementRunwayPoint() {
        return pointElementRunwayPoint;
    }

    /**
     * Sets the value of the pointElementRunwayPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RunwayCentrelinePointPropertyType }{@code >}
     *     
     */
    public void setPointElementRunwayPoint(JAXBElement<RunwayCentrelinePointPropertyType> value) {
        this.pointElementRunwayPoint = value;
    }

    public boolean isSetPointElementRunwayPoint() {
        return (this.pointElementRunwayPoint!= null);
    }

    /**
     * Gets the value of the pointElementAimingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public JAXBElement<TouchDownLiftOffPropertyType> getPointElementAimingPoint() {
        return pointElementAimingPoint;
    }

    /**
     * Sets the value of the pointElementAimingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TouchDownLiftOffPropertyType }{@code >}
     *     
     */
    public void setPointElementAimingPoint(JAXBElement<TouchDownLiftOffPropertyType> value) {
        this.pointElementAimingPoint = value;
    }

    public boolean isSetPointElementAimingPoint() {
        return (this.pointElementAimingPoint!= null);
    }

    /**
     * Gets the value of the pointElementAirportReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getPointElementAirportReferencePoint() {
        return pointElementAirportReferencePoint;
    }

    /**
     * Sets the value of the pointElementAirportReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setPointElementAirportReferencePoint(JAXBElement<AirportHeliportPropertyType> value) {
        this.pointElementAirportReferencePoint = value;
    }

    public boolean isSetPointElementAirportReferencePoint() {
        return (this.pointElementAirportReferencePoint!= null);
    }

    /**
     * Gets the value of the elementAirspaceElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspacePropertyType> getElementAirspaceElement() {
        return elementAirspaceElement;
    }

    /**
     * Sets the value of the elementAirspaceElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspacePropertyType }{@code >}
     *     
     */
    public void setElementAirspaceElement(JAXBElement<AirspacePropertyType> value) {
        this.elementAirspaceElement = value;
    }

    public boolean isSetElementAirspaceElement() {
        return (this.elementAirspaceElement!= null);
    }

    /**
     * Gets the value of the elementAirportHeliportElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public JAXBElement<AirportHeliportPropertyType> getElementAirportHeliportElement() {
        return elementAirportHeliportElement;
    }

    /**
     * Sets the value of the elementAirportHeliportElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}
     *     
     */
    public void setElementAirportHeliportElement(JAXBElement<AirportHeliportPropertyType> value) {
        this.elementAirportHeliportElement = value;
    }

    public boolean isSetElementAirportHeliportElement() {
        return (this.elementAirportHeliportElement!= null);
    }

    /**
     * Gets the value of the elementAerialRefuellingElement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public JAXBElement<AerialRefuellingPropertyType> getElementAerialRefuellingElement() {
        return elementAerialRefuellingElement;
    }

    /**
     * Sets the value of the elementAerialRefuellingElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerialRefuellingPropertyType }{@code >}
     *     
     */
    public void setElementAerialRefuellingElement(JAXBElement<AerialRefuellingPropertyType> value) {
        this.elementAerialRefuellingElement = value;
    }

    public boolean isSetElementAerialRefuellingElement() {
        return (this.elementAerialRefuellingElement!= null);
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
     * {@link FlightRoutingElementType.Extension }
     * 
     * 
     */
    public List<FlightRoutingElementType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<FlightRoutingElementType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractFlightRoutingElementExtension"/>
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
        "abstractFlightRoutingElementExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractFlightRoutingElementExtension")
        protected AbstractExtensionType abstractFlightRoutingElementExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractFlightRoutingElementExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractFlightRoutingElementExtension() {
            return abstractFlightRoutingElementExtension;
        }

        /**
         * Sets the value of the abstractFlightRoutingElementExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractFlightRoutingElementExtension(AbstractExtensionType value) {
            this.abstractFlightRoutingElementExtension = value;
        }

        public boolean isSetAbstractFlightRoutingElementExtension() {
            return (this.abstractFlightRoutingElementExtension!= null);
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
