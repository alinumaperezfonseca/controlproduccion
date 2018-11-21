
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * All representations of countries in the IFX Specification are based upon agreed upon standard codes between client and server. The default, if not specified, is the Alpha 3-character codes for countries that are defined in ISO-3166.
 *
 * <p>Java class for CountryCode complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CountryCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCodeSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryCode", propOrder = { "countryCodeSource", "countryCodeValue" })
public class CountryCode {

    @XmlElement(name = "CountryCodeSource")
    protected String countryCodeSource;
    @XmlElement(name = "CountryCodeValue")
    protected String countryCodeValue;

    /**
     * Gets the value of the countryCodeSource property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryCodeSource() {
        return countryCodeSource;
    }

    /**
     * Sets the value of the countryCodeSource property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryCodeSource(String value) {
        this.countryCodeSource = value;
    }

    /**
     * Gets the value of the countryCodeValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryCodeValue() {
        return countryCodeValue;
    }

    /**
     * Sets the value of the countryCodeValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryCodeValue(String value) {
        this.countryCodeValue = value;
    }

}
