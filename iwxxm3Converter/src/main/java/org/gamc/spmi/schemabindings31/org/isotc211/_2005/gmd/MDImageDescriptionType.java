//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.org.isotc211._2005.gco.BooleanPropertyType;
import schemabindings31.org.isotc211._2005.gco.IntegerPropertyType;
import schemabindings31.org.isotc211._2005.gco.RealPropertyType;


/**
 * Information about an image's suitability for use
 * 
 * <p>Java class for MD_ImageDescription_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_ImageDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_CoverageDescription_Type">
 *       &lt;sequence>
 *         &lt;element name="illuminationElevationAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="illuminationAzimuthAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="imagingCondition" type="{http://www.isotc211.org/2005/gmd}MD_ImagingConditionCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="imageQualityCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="cloudCoverPercentage" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="processingLevelCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="compressionGenerationQuantity" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="triangulationIndicator" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="radiometricCalibrationDataAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="cameraCalibrationInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="filmDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="lensDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ImageDescription_Type", propOrder = {
    "illuminationElevationAngle",
    "illuminationAzimuthAngle",
    "imagingCondition",
    "imageQualityCode",
    "cloudCoverPercentage",
    "processingLevelCode",
    "compressionGenerationQuantity",
    "triangulationIndicator",
    "radiometricCalibrationDataAvailability",
    "cameraCalibrationInformationAvailability",
    "filmDistortionInformationAvailability",
    "lensDistortionInformationAvailability"
})
public class MDImageDescriptionType
    extends MDCoverageDescriptionType
{

    protected RealPropertyType illuminationElevationAngle;
    protected RealPropertyType illuminationAzimuthAngle;
    protected MDImagingConditionCodePropertyType imagingCondition;
    protected MDIdentifierPropertyType imageQualityCode;
    protected RealPropertyType cloudCoverPercentage;
    protected MDIdentifierPropertyType processingLevelCode;
    protected IntegerPropertyType compressionGenerationQuantity;
    protected BooleanPropertyType triangulationIndicator;
    protected BooleanPropertyType radiometricCalibrationDataAvailability;
    protected BooleanPropertyType cameraCalibrationInformationAvailability;
    protected BooleanPropertyType filmDistortionInformationAvailability;
    protected BooleanPropertyType lensDistortionInformationAvailability;

    /**
     * Gets the value of the illuminationElevationAngle property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationElevationAngle() {
        return illuminationElevationAngle;
    }

    /**
     * Sets the value of the illuminationElevationAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationElevationAngle(RealPropertyType value) {
        this.illuminationElevationAngle = value;
    }

    public boolean isSetIlluminationElevationAngle() {
        return (this.illuminationElevationAngle!= null);
    }

    /**
     * Gets the value of the illuminationAzimuthAngle property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationAzimuthAngle() {
        return illuminationAzimuthAngle;
    }

    /**
     * Sets the value of the illuminationAzimuthAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationAzimuthAngle(RealPropertyType value) {
        this.illuminationAzimuthAngle = value;
    }

    public boolean isSetIlluminationAzimuthAngle() {
        return (this.illuminationAzimuthAngle!= null);
    }

    /**
     * Gets the value of the imagingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public MDImagingConditionCodePropertyType getImagingCondition() {
        return imagingCondition;
    }

    /**
     * Sets the value of the imagingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public void setImagingCondition(MDImagingConditionCodePropertyType value) {
        this.imagingCondition = value;
    }

    public boolean isSetImagingCondition() {
        return (this.imagingCondition!= null);
    }

    /**
     * Gets the value of the imageQualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getImageQualityCode() {
        return imageQualityCode;
    }

    /**
     * Sets the value of the imageQualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setImageQualityCode(MDIdentifierPropertyType value) {
        this.imageQualityCode = value;
    }

    public boolean isSetImageQualityCode() {
        return (this.imageQualityCode!= null);
    }

    /**
     * Gets the value of the cloudCoverPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getCloudCoverPercentage() {
        return cloudCoverPercentage;
    }

    /**
     * Sets the value of the cloudCoverPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setCloudCoverPercentage(RealPropertyType value) {
        this.cloudCoverPercentage = value;
    }

    public boolean isSetCloudCoverPercentage() {
        return (this.cloudCoverPercentage!= null);
    }

    /**
     * Gets the value of the processingLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getProcessingLevelCode() {
        return processingLevelCode;
    }

    /**
     * Sets the value of the processingLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setProcessingLevelCode(MDIdentifierPropertyType value) {
        this.processingLevelCode = value;
    }

    public boolean isSetProcessingLevelCode() {
        return (this.processingLevelCode!= null);
    }

    /**
     * Gets the value of the compressionGenerationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getCompressionGenerationQuantity() {
        return compressionGenerationQuantity;
    }

    /**
     * Sets the value of the compressionGenerationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setCompressionGenerationQuantity(IntegerPropertyType value) {
        this.compressionGenerationQuantity = value;
    }

    public boolean isSetCompressionGenerationQuantity() {
        return (this.compressionGenerationQuantity!= null);
    }

    /**
     * Gets the value of the triangulationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTriangulationIndicator() {
        return triangulationIndicator;
    }

    /**
     * Sets the value of the triangulationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTriangulationIndicator(BooleanPropertyType value) {
        this.triangulationIndicator = value;
    }

    public boolean isSetTriangulationIndicator() {
        return (this.triangulationIndicator!= null);
    }

    /**
     * Gets the value of the radiometricCalibrationDataAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getRadiometricCalibrationDataAvailability() {
        return radiometricCalibrationDataAvailability;
    }

    /**
     * Sets the value of the radiometricCalibrationDataAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setRadiometricCalibrationDataAvailability(BooleanPropertyType value) {
        this.radiometricCalibrationDataAvailability = value;
    }

    public boolean isSetRadiometricCalibrationDataAvailability() {
        return (this.radiometricCalibrationDataAvailability!= null);
    }

    /**
     * Gets the value of the cameraCalibrationInformationAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCameraCalibrationInformationAvailability() {
        return cameraCalibrationInformationAvailability;
    }

    /**
     * Sets the value of the cameraCalibrationInformationAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCameraCalibrationInformationAvailability(BooleanPropertyType value) {
        this.cameraCalibrationInformationAvailability = value;
    }

    public boolean isSetCameraCalibrationInformationAvailability() {
        return (this.cameraCalibrationInformationAvailability!= null);
    }

    /**
     * Gets the value of the filmDistortionInformationAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getFilmDistortionInformationAvailability() {
        return filmDistortionInformationAvailability;
    }

    /**
     * Sets the value of the filmDistortionInformationAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setFilmDistortionInformationAvailability(BooleanPropertyType value) {
        this.filmDistortionInformationAvailability = value;
    }

    public boolean isSetFilmDistortionInformationAvailability() {
        return (this.filmDistortionInformationAvailability!= null);
    }

    /**
     * Gets the value of the lensDistortionInformationAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getLensDistortionInformationAvailability() {
        return lensDistortionInformationAvailability;
    }

    /**
     * Sets the value of the lensDistortionInformationAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setLensDistortionInformationAvailability(BooleanPropertyType value) {
        this.lensDistortionInformationAvailability = value;
    }

    public boolean isSetLensDistortionInformationAvailability() {
        return (this.lensDistortionInformationAvailability!= null);
    }

}
