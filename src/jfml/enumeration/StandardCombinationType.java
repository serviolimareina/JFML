package jfml.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardCombinationType.
 * 
 * <pre>
 * &lt;simpleType name="standardCombinationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * @author sotillo19
 */
@XmlType(name = "standardCombinationType")
@XmlEnum
public enum StandardCombinationType {

    WA;

    public String value() {
        return name();
    }

    public static StandardCombinationType fromValue(String v) {
        return valueOf(v);
    }

}
