//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CylinderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CylinderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGriddedSurfaceType">
 *       &lt;attribute name="horizontalCurveType" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="circularArc3Points" />
 *       &lt;attribute name="verticalCurveType" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="linear" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CylinderType")
public class CylinderType
    extends AbstractGriddedSurfaceType
{

    /**
     * 
     * 
     */
    @XmlAttribute(name = "horizontalCurveType")
    public final static CurveInterpolationType HORIZONTAL_CURVE_TYPE = CurveInterpolationType.CIRCULAR_ARC_3_POINTS;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "verticalCurveType")
    public final static CurveInterpolationType VERTICAL_CURVE_TYPE = CurveInterpolationType.LINEAR;

}
