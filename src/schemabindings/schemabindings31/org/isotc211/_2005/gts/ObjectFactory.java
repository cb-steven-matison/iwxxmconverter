//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.org.isotc211._2005.gts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.isotc211._2005.gts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TMPeriodDuration_QNAME = new QName("http://www.isotc211.org/2005/gts", "TM_PeriodDuration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.isotc211._2005.gts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMPeriodDurationPropertyType }
     * 
     */
    public TMPeriodDurationPropertyType createTMPeriodDurationPropertyType() {
        return new TMPeriodDurationPropertyType();
    }

    /**
     * Create an instance of {@link TMPrimitivePropertyType }
     * 
     */
    public TMPrimitivePropertyType createTMPrimitivePropertyType() {
        return new TMPrimitivePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gts", name = "TM_PeriodDuration")
    public JAXBElement<Duration> createTMPeriodDuration(Duration value) {
        return new JAXBElement<Duration>(_TMPeriodDuration_QNAME, Duration.class, null, value);
    }

}
