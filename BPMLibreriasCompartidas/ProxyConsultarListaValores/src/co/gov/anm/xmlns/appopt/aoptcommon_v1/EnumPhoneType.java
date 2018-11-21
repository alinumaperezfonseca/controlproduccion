
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumPhoneType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPhoneType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fax"/&gt;
 *     &lt;enumeration value="Home"/&gt;
 *     &lt;enumeration value="LandLine"/&gt;
 *     &lt;enumeration value="Mobile"/&gt;
 *     &lt;enumeration value="Office"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "EnumPhoneType")
@XmlEnum
public enum EnumPhoneType {

    @XmlEnumValue("Fax")
    FAX("Fax"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("LandLine")
    LAND_LINE("LandLine"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Office")
    OFFICE("Office"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EnumPhoneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPhoneType fromValue(String v) {
        for (EnumPhoneType c : EnumPhoneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
