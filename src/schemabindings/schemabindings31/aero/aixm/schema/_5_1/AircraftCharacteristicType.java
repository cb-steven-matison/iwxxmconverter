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
 * <p>Java class for AircraftCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftCharacteristicType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}AircraftCharacteristicPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAircraftCharacteristicExtension"/>
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
@XmlType(name = "AircraftCharacteristicType", propOrder = {
    "type",
    "engine",
    "numberEngine",
    "typeAircraftICAO",
    "aircraftLandingCategory",
    "wingSpan",
    "wingSpanInterpretation",
    "classWingSpan",
    "weight",
    "weightInterpretation",
    "passengers",
    "passengersInterpretation",
    "speed",
    "speedInterpretation",
    "wakeTurbulence",
    "navigationEquipment",
    "navigationSpecification",
    "verticalSeparationCapability",
    "antiCollisionAndSeparationEquipment",
    "communicationEquipment",
    "surveillanceEquipment",
    "annotation",
    "extension"
})
public class AircraftCharacteristicType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftType> type;
    @XmlElementRef(name = "engine", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftEngineType> engine;
    @XmlElementRef(name = "numberEngine", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftEngineNumberType> numberEngine;
    @XmlElementRef(name = "typeAircraftICAO", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftICAOType> typeAircraftICAO;
    @XmlElementRef(name = "aircraftLandingCategory", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftCategoryType> aircraftLandingCategory;
    @XmlElementRef(name = "wingSpan", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> wingSpan;
    @XmlElementRef(name = "wingSpanInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> wingSpanInterpretation;
    @XmlElementRef(name = "classWingSpan", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAircraftWingspanClassType> classWingSpan;
    @XmlElementRef(name = "weight", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValWeightType> weight;
    @XmlElementRef(name = "weightInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> weightInterpretation;
    @XmlElementRef(name = "passengers", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> passengers;
    @XmlElementRef(name = "passengersInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> passengersInterpretation;
    @XmlElementRef(name = "speed", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValSpeedType> speed;
    @XmlElementRef(name = "speedInterpretation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeValueInterpretationType> speedInterpretation;
    @XmlElementRef(name = "wakeTurbulence", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeWakeTurbulenceType> wakeTurbulence;
    @XmlElementRef(name = "navigationEquipment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationEquipmentType> navigationEquipment;
    @XmlElementRef(name = "navigationSpecification", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNavigationSpecificationType> navigationSpecification;
    @XmlElementRef(name = "verticalSeparationCapability", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRVSMType> verticalSeparationCapability;
    @XmlElementRef(name = "antiCollisionAndSeparationEquipment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeEquipmentAntiCollisionType> antiCollisionAndSeparationEquipment;
    @XmlElementRef(name = "communicationEquipment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationModeType> communicationEquipment;
    @XmlElementRef(name = "surveillanceEquipment", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTransponderType> surveillanceEquipment;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AircraftCharacteristicType.Extension> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAircraftType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftEngineType> getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineType }{@code >}
     *     
     */
    public void setEngine(JAXBElement<CodeAircraftEngineType> value) {
        this.engine = value;
    }

    public boolean isSetEngine() {
        return (this.engine!= null);
    }

    /**
     * Gets the value of the numberEngine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineNumberType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftEngineNumberType> getNumberEngine() {
        return numberEngine;
    }

    /**
     * Sets the value of the numberEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftEngineNumberType }{@code >}
     *     
     */
    public void setNumberEngine(JAXBElement<CodeAircraftEngineNumberType> value) {
        this.numberEngine = value;
    }

    public boolean isSetNumberEngine() {
        return (this.numberEngine!= null);
    }

    /**
     * Gets the value of the typeAircraftICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftICAOType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftICAOType> getTypeAircraftICAO() {
        return typeAircraftICAO;
    }

    /**
     * Sets the value of the typeAircraftICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftICAOType }{@code >}
     *     
     */
    public void setTypeAircraftICAO(JAXBElement<CodeAircraftICAOType> value) {
        this.typeAircraftICAO = value;
    }

    public boolean isSetTypeAircraftICAO() {
        return (this.typeAircraftICAO!= null);
    }

    /**
     * Gets the value of the aircraftLandingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftCategoryType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftCategoryType> getAircraftLandingCategory() {
        return aircraftLandingCategory;
    }

    /**
     * Sets the value of the aircraftLandingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftCategoryType }{@code >}
     *     
     */
    public void setAircraftLandingCategory(JAXBElement<CodeAircraftCategoryType> value) {
        this.aircraftLandingCategory = value;
    }

    public boolean isSetAircraftLandingCategory() {
        return (this.aircraftLandingCategory!= null);
    }

    /**
     * Gets the value of the wingSpan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getWingSpan() {
        return wingSpan;
    }

    /**
     * Sets the value of the wingSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setWingSpan(JAXBElement<ValDistanceType> value) {
        this.wingSpan = value;
    }

    public boolean isSetWingSpan() {
        return (this.wingSpan!= null);
    }

    /**
     * Gets the value of the wingSpanInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getWingSpanInterpretation() {
        return wingSpanInterpretation;
    }

    /**
     * Sets the value of the wingSpanInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setWingSpanInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.wingSpanInterpretation = value;
    }

    public boolean isSetWingSpanInterpretation() {
        return (this.wingSpanInterpretation!= null);
    }

    /**
     * Gets the value of the classWingSpan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    public JAXBElement<CodeAircraftWingspanClassType> getClassWingSpan() {
        return classWingSpan;
    }

    /**
     * Sets the value of the classWingSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAircraftWingspanClassType }{@code >}
     *     
     */
    public void setClassWingSpan(JAXBElement<CodeAircraftWingspanClassType> value) {
        this.classWingSpan = value;
    }

    public boolean isSetClassWingSpan() {
        return (this.classWingSpan!= null);
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public JAXBElement<ValWeightType> getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValWeightType }{@code >}
     *     
     */
    public void setWeight(JAXBElement<ValWeightType> value) {
        this.weight = value;
    }

    public boolean isSetWeight() {
        return (this.weight!= null);
    }

    /**
     * Gets the value of the weightInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getWeightInterpretation() {
        return weightInterpretation;
    }

    /**
     * Sets the value of the weightInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setWeightInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.weightInterpretation = value;
    }

    public boolean isSetWeightInterpretation() {
        return (this.weightInterpretation!= null);
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setPassengers(JAXBElement<NoNumberType> value) {
        this.passengers = value;
    }

    public boolean isSetPassengers() {
        return (this.passengers!= null);
    }

    /**
     * Gets the value of the passengersInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getPassengersInterpretation() {
        return passengersInterpretation;
    }

    /**
     * Sets the value of the passengersInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setPassengersInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.passengersInterpretation = value;
    }

    public boolean isSetPassengersInterpretation() {
        return (this.passengersInterpretation!= null);
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
     * Gets the value of the speedInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public JAXBElement<CodeValueInterpretationType> getSpeedInterpretation() {
        return speedInterpretation;
    }

    /**
     * Sets the value of the speedInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeValueInterpretationType }{@code >}
     *     
     */
    public void setSpeedInterpretation(JAXBElement<CodeValueInterpretationType> value) {
        this.speedInterpretation = value;
    }

    public boolean isSetSpeedInterpretation() {
        return (this.speedInterpretation!= null);
    }

    /**
     * Gets the value of the wakeTurbulence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeWakeTurbulenceType }{@code >}
     *     
     */
    public JAXBElement<CodeWakeTurbulenceType> getWakeTurbulence() {
        return wakeTurbulence;
    }

    /**
     * Sets the value of the wakeTurbulence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeWakeTurbulenceType }{@code >}
     *     
     */
    public void setWakeTurbulence(JAXBElement<CodeWakeTurbulenceType> value) {
        this.wakeTurbulence = value;
    }

    public boolean isSetWakeTurbulence() {
        return (this.wakeTurbulence!= null);
    }

    /**
     * Gets the value of the navigationEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationEquipmentType }{@code >}
     *     
     */
    public JAXBElement<CodeNavigationEquipmentType> getNavigationEquipment() {
        return navigationEquipment;
    }

    /**
     * Sets the value of the navigationEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationEquipmentType }{@code >}
     *     
     */
    public void setNavigationEquipment(JAXBElement<CodeNavigationEquipmentType> value) {
        this.navigationEquipment = value;
    }

    public boolean isSetNavigationEquipment() {
        return (this.navigationEquipment!= null);
    }

    /**
     * Gets the value of the navigationSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationSpecificationType }{@code >}
     *     
     */
    public JAXBElement<CodeNavigationSpecificationType> getNavigationSpecification() {
        return navigationSpecification;
    }

    /**
     * Sets the value of the navigationSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNavigationSpecificationType }{@code >}
     *     
     */
    public void setNavigationSpecification(JAXBElement<CodeNavigationSpecificationType> value) {
        this.navigationSpecification = value;
    }

    public boolean isSetNavigationSpecification() {
        return (this.navigationSpecification!= null);
    }

    /**
     * Gets the value of the verticalSeparationCapability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public JAXBElement<CodeRVSMType> getVerticalSeparationCapability() {
        return verticalSeparationCapability;
    }

    /**
     * Sets the value of the verticalSeparationCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRVSMType }{@code >}
     *     
     */
    public void setVerticalSeparationCapability(JAXBElement<CodeRVSMType> value) {
        this.verticalSeparationCapability = value;
    }

    public boolean isSetVerticalSeparationCapability() {
        return (this.verticalSeparationCapability!= null);
    }

    /**
     * Gets the value of the antiCollisionAndSeparationEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentAntiCollisionType }{@code >}
     *     
     */
    public JAXBElement<CodeEquipmentAntiCollisionType> getAntiCollisionAndSeparationEquipment() {
        return antiCollisionAndSeparationEquipment;
    }

    /**
     * Sets the value of the antiCollisionAndSeparationEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeEquipmentAntiCollisionType }{@code >}
     *     
     */
    public void setAntiCollisionAndSeparationEquipment(JAXBElement<CodeEquipmentAntiCollisionType> value) {
        this.antiCollisionAndSeparationEquipment = value;
    }

    public boolean isSetAntiCollisionAndSeparationEquipment() {
        return (this.antiCollisionAndSeparationEquipment!= null);
    }

    /**
     * Gets the value of the communicationEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public JAXBElement<CodeCommunicationModeType> getCommunicationEquipment() {
        return communicationEquipment;
    }

    /**
     * Sets the value of the communicationEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationModeType }{@code >}
     *     
     */
    public void setCommunicationEquipment(JAXBElement<CodeCommunicationModeType> value) {
        this.communicationEquipment = value;
    }

    public boolean isSetCommunicationEquipment() {
        return (this.communicationEquipment!= null);
    }

    /**
     * Gets the value of the surveillanceEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    public JAXBElement<CodeTransponderType> getSurveillanceEquipment() {
        return surveillanceEquipment;
    }

    /**
     * Sets the value of the surveillanceEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTransponderType }{@code >}
     *     
     */
    public void setSurveillanceEquipment(JAXBElement<CodeTransponderType> value) {
        this.surveillanceEquipment = value;
    }

    public boolean isSetSurveillanceEquipment() {
        return (this.surveillanceEquipment!= null);
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
     * {@link AircraftCharacteristicType.Extension }
     * 
     * 
     */
    public List<AircraftCharacteristicType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AircraftCharacteristicType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAircraftCharacteristicExtension"/>
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
        "abstractAircraftCharacteristicExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractAircraftCharacteristicExtension")
        protected AbstractExtensionType abstractAircraftCharacteristicExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractAircraftCharacteristicExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractAircraftCharacteristicExtension() {
            return abstractAircraftCharacteristicExtension;
        }

        /**
         * Sets the value of the abstractAircraftCharacteristicExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractAircraftCharacteristicExtension(AbstractExtensionType value) {
            this.abstractAircraftCharacteristicExtension = value;
        }

        public boolean isSetAbstractAircraftCharacteristicExtension() {
            return (this.abstractAircraftCharacteristicExtension!= null);
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
