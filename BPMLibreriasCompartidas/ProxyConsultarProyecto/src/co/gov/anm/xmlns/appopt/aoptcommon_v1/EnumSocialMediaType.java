
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumSocialMediaType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumSocialMediaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Facebook"/&gt;
 *     &lt;enumeration value="Instagram"/&gt;
 *     &lt;enumeration value="Twitter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 */
@XmlType(name = "EnumSocialMediaType")
@XmlEnum
public enum EnumSocialMediaType {

    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),
    @XmlEnumValue("Instagram")
    INSTAGRAM("Instagram"),
    @XmlEnumValue("Twitter")
    TWITTER("Twitter");
    private final String value;

    EnumSocialMediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumSocialMediaType fromValue(String v) {
        for (EnumSocialMediaType c : EnumSocialMediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
