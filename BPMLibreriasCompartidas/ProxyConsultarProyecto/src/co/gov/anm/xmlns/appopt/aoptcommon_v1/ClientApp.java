
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientApp complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ClientApp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientApp", propOrder = { "channelId", "name", "org", "userId", "userType" })
public class ClientApp {

    @XmlElement(name = "ChannelId")
    protected String channelId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Org")
    protected String org;
    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "UserType")
    protected String userType;

    /**
     * Gets the value of the channelId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the org property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrg(String value) {
        this.org = value;
    }

    /**
     * Gets the value of the userId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserType(String value) {
        this.userType = value;
    }

}
