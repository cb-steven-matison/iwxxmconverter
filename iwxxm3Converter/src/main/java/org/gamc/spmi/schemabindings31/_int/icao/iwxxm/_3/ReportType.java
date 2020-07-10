//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import schemabindings31.net.opengis.gml.v_3_2_1.AbstractFeatureType;


/**
 * <p>Java class for ReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="reportStatus" use="required" type="{http://icao.int/iwxxm/3.0}ReportStatusType" />
 *       &lt;attribute name="permissibleUsage" use="required" type="{http://icao.int/iwxxm/3.0}PermissibleUsageType" />
 *       &lt;attribute name="permissibleUsageReason" type="{http://icao.int/iwxxm/3.0}PermissibleUsageReasonType" />
 *       &lt;attribute name="permissibleUsageSupplementary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translatedBulletinID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translatedBulletinReceptionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="translationCentreDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translationCentreName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="translationFailedTAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportType")
@XmlSeeAlso({
    SpaceWeatherAdvisoryType.class,
    SIGMETType.class,
    TropicalCycloneAdvisoryType.class,
    AIRMETType.class,
    MeteorologicalAerodromeObservationReportType.class,
    TAFType.class,
    VolcanicAshAdvisoryType.class
})
public abstract class ReportType
    extends AbstractFeatureType
{

    @XmlAttribute(name = "reportStatus", required = true)
    protected ReportStatusType reportStatus;
    @XmlAttribute(name = "permissibleUsage", required = true)
    protected PermissibleUsageType permissibleUsage;
    @XmlAttribute(name = "permissibleUsageReason")
    protected PermissibleUsageReasonType permissibleUsageReason;
    @XmlAttribute(name = "permissibleUsageSupplementary")
    protected String permissibleUsageSupplementary;
    @XmlAttribute(name = "translatedBulletinID")
    protected String translatedBulletinID;
    @XmlAttribute(name = "translatedBulletinReceptionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar translatedBulletinReceptionTime;
    @XmlAttribute(name = "translationCentreDesignator")
    protected String translationCentreDesignator;
    @XmlAttribute(name = "translationCentreName")
    protected String translationCentreName;
    @XmlAttribute(name = "translationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar translationTime;
    
    @XmlAttribute(name = "translationFailedTAC", required = false)
    protected String translationFailedTAC = null;

    /**
     * Gets the value of the reportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReportStatusType }
     *     
     */
    public ReportStatusType getReportStatus() {
        return reportStatus;
    }

    /**
     * Sets the value of the reportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportStatusType }
     *     
     */
    public void setReportStatus(ReportStatusType value) {
        this.reportStatus = value;
    }

    public boolean isSetReportStatus() {
        return (this.reportStatus!= null);
    }

    /**
     * Gets the value of the permissibleUsage property.
     * 
     * @return
     *     possible object is
     *     {@link PermissibleUsageType }
     *     
     */
    public PermissibleUsageType getPermissibleUsage() {
        return permissibleUsage;
    }

    /**
     * Sets the value of the permissibleUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissibleUsageType }
     *     
     */
    public void setPermissibleUsage(PermissibleUsageType value) {
        this.permissibleUsage = value;
    }

    public boolean isSetPermissibleUsage() {
        return (this.permissibleUsage!= null);
    }

    /**
     * Gets the value of the permissibleUsageReason property.
     * 
     * @return
     *     possible object is
     *     {@link PermissibleUsageReasonType }
     *     
     */
    public PermissibleUsageReasonType getPermissibleUsageReason() {
        return permissibleUsageReason;
    }

    /**
     * Sets the value of the permissibleUsageReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissibleUsageReasonType }
     *     
     */
    public void setPermissibleUsageReason(PermissibleUsageReasonType value) {
        this.permissibleUsageReason = value;
    }

    public boolean isSetPermissibleUsageReason() {
        return (this.permissibleUsageReason!= null);
    }

    /**
     * Gets the value of the permissibleUsageSupplementary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissibleUsageSupplementary() {
        return permissibleUsageSupplementary;
    }

    /**
     * Sets the value of the permissibleUsageSupplementary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissibleUsageSupplementary(String value) {
        this.permissibleUsageSupplementary = value;
    }

    public boolean isSetPermissibleUsageSupplementary() {
        return (this.permissibleUsageSupplementary!= null);
    }

    /**
     * Gets the value of the translatedBulletinID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslatedBulletinID() {
        return translatedBulletinID;
    }

    /**
     * Sets the value of the translatedBulletinID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslatedBulletinID(String value) {
        this.translatedBulletinID = value;
    }

    public boolean isSetTranslatedBulletinID() {
        return (this.translatedBulletinID!= null);
    }

    /**
     * Gets the value of the translatedBulletinReceptionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranslatedBulletinReceptionTime() {
        return translatedBulletinReceptionTime;
    }

    /**
     * Sets the value of the translatedBulletinReceptionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranslatedBulletinReceptionTime(XMLGregorianCalendar value) {
        this.translatedBulletinReceptionTime = value;
    }

    public boolean isSetTranslatedBulletinReceptionTime() {
        return (this.translatedBulletinReceptionTime!= null);
    }

    /**
     * Gets the value of the translationCentreDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationCentreDesignator() {
        return translationCentreDesignator;
    }

    /**
     * Sets the value of the translationCentreDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationCentreDesignator(String value) {
        this.translationCentreDesignator = value;
    }

    public boolean isSetTranslationCentreDesignator() {
        return (this.translationCentreDesignator!= null);
    }

    /**
     * Gets the value of the translationCentreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationCentreName() {
        return translationCentreName;
    }

    /**
     * Sets the value of the translationCentreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationCentreName(String value) {
        this.translationCentreName = value;
    }

    public boolean isSetTranslationCentreName() {
        return (this.translationCentreName!= null);
    }

    /**
     * Gets the value of the translationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranslationTime() {
        return translationTime;
    }

    /**
     * Sets the value of the translationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranslationTime(XMLGregorianCalendar value) {
        this.translationTime = value;
    }

    public boolean isSetTranslationTime() {
        return (this.translationTime!= null);
    }

    /**
     * Gets the value of the translationFailedTAC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationFailedTAC() {
        return translationFailedTAC;
    }

    /**
     * Sets the value of the translationFailedTAC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationFailedTAC(String value) {
        this.translationFailedTAC = value;
    }

    public boolean isSetTranslationFailedTAC() {
        return (this.translationFailedTAC!= null);
    }

}
