
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Contact aggregate appears wherever a person's or organization's contact information is needed.
 *
 * <p>Java class for Contact complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locator" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}Locator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = { "contactName", "contactType", "locator" })
public class Contact {

    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlElement(name = "Locator")
    protected Locator locator;

    /**
     * Gets the value of the contactName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the locator property.
     *
     * @return
     *     possible object is
     *     {@link Locator }
     *
     */
    public Locator getLocator() {
        return locator;
    }

    /**
     * Sets the value of the locator property.
     *
     * @param value
     *     allowed object is
     *     {@link Locator }
     *
     */
    public void setLocator(Locator value) {
        this.locator = value;
    }

}
