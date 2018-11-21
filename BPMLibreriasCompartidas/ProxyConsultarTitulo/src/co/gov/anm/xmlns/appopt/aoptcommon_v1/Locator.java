
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information necessary to establish contact.
 *
 * <p>Java class for Locator complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Locator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Email" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}ValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResourceLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SocialMedia" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}SocialMedia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}Phone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PostAddr" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}PostAddr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Locator", propOrder = { "email", "resourceLocator", "socialMedia", "phone", "postAddr" })
public class Locator {

    @XmlElement(name = "Email")
    protected List<ValueType> email;
    @XmlElement(name = "ResourceLocator")
    protected String resourceLocator;
    @XmlElement(name = "SocialMedia")
    protected List<SocialMedia> socialMedia;
    @XmlElement(name = "Phone")
    protected List<Phone> phone;
    @XmlElement(name = "PostAddr")
    protected List<PostAddr> postAddr;

    /**
     * Gets the value of the email property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     *
     *
     */
    public List<ValueType> getEmail() {
        if (email == null) {
            email = new ArrayList<ValueType>();
        }
        return this.email;
    }

    /**
     * Gets the value of the resourceLocator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResourceLocator() {
        return resourceLocator;
    }

    /**
     * Sets the value of the resourceLocator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResourceLocator(String value) {
        this.resourceLocator = value;
    }

    /**
     * Gets the value of the socialMedia property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialMedia property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialMedia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialMedia }
     *
     *
     */
    public List<SocialMedia> getSocialMedia() {
        if (socialMedia == null) {
            socialMedia = new ArrayList<SocialMedia>();
        }
        return this.socialMedia;
    }

    /**
     * Gets the value of the phone property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     *
     *
     */
    public List<Phone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<Phone>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the postAddr property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postAddr property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostAddr().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostAddr }
     *
     *
     */
    public List<PostAddr> getPostAddr() {
        if (postAddr == null) {
            postAddr = new ArrayList<PostAddr>();
        }
        return this.postAddr;
    }

}
