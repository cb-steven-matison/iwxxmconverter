//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationalOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationalOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABOVE"/>
 *     &lt;enumeration value="BELOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationalOperatorType")
@XmlEnum
public enum RelationalOperatorType {


    /**
     * The actual value is above the maximum value that can be determined by the system ("ABV", "P")
     * 
     */
    ABOVE,

    /**
     * The actual value is below the minimum value that can be determined by the system ("BLW", "M")
     * 
     */
    BELOW;

    public String value() {
        return name();
    }

    public static RelationalOperatorType fromValue(String v) {
        return valueOf(v);
    }

}
