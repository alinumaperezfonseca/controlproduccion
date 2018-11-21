
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SessionInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SessionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccesDt" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="AccesHr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Browser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BrowserVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}Country" minOccurs="0"/&gt;
 *         &lt;element name="DNADevice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FailedAttempts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IBUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isNotified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ISPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkTrnData" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}NetworkTrnData" minOccurs="0"/&gt;
 *         &lt;element name="NotificationDt" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}datePattern" minOccurs="0"/&gt;
 *         &lt;element name="NotificationHr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrivateIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Region" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}CommonType" minOccurs="0"/&gt;
 *         &lt;element name="UserStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionInfo",
         propOrder =
         { "accesDt", "accesHr", "actionType", "browser", "browserVersion", "channel", "city", "country", "dnaDevice",
           "failedAttempts", "ibUserId", "isNotified", "ispCode", "latitude", "longitude", "networkTrnData",
           "notificationDt", "notificationHr", "notificationMethod", "prefix", "privateIp", "region", "userStatus"
    })
public class SessionInfo {

    @XmlElement(name = "AccesDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accesDt;
    @XmlElement(name = "AccesHr")
    protected String accesHr;
    @XmlElement(name = "ActionType")
    protected String actionType;
    @XmlElement(name = "Browser")
    protected String browser;
    @XmlElement(name = "BrowserVersion")
    protected String browserVersion;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "DNADevice")
    protected String dnaDevice;
    @XmlElement(name = "FailedAttempts")
    protected Integer failedAttempts;
    @XmlElement(name = "IBUserId")
    protected String ibUserId;
    protected Boolean isNotified;
    @XmlElement(name = "ISPCode")
    protected String ispCode;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "NetworkTrnData")
    protected NetworkTrnData networkTrnData;
    @XmlElement(name = "NotificationDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notificationDt;
    @XmlElement(name = "NotificationHr")
    protected String notificationHr;
    @XmlElement(name = "NotificationMethod")
    protected String notificationMethod;
    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "PrivateIp")
    protected String privateIp;
    @XmlElement(name = "Region")
    protected CommonType region;
    @XmlElement(name = "UserStatus")
    protected String userStatus;

    /**
     * Gets the value of the accesDt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getAccesDt() {
        return accesDt;
    }

    /**
     * Sets the value of the accesDt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setAccesDt(XMLGregorianCalendar value) {
        this.accesDt = value;
    }

    /**
     * Gets the value of the accesHr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccesHr() {
        return accesHr;
    }

    /**
     * Sets the value of the accesHr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccesHr(String value) {
        this.accesHr = value;
    }

    /**
     * Gets the value of the actionType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActionType(String value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the browser property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * Sets the value of the browser property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBrowser(String value) {
        this.browser = value;
    }

    /**
     * Gets the value of the browserVersion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBrowserVersion() {
        return browserVersion;
    }

    /**
     * Sets the value of the browserVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBrowserVersion(String value) {
        this.browserVersion = value;
    }

    /**
     * Gets the value of the channel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link Country }
     *
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link Country }
     *
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the dnaDevice property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDNADevice() {
        return dnaDevice;
    }

    /**
     * Sets the value of the dnaDevice property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDNADevice(String value) {
        this.dnaDevice = value;
    }

    /**
     * Gets the value of the failedAttempts property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getFailedAttempts() {
        return failedAttempts;
    }

    /**
     * Sets the value of the failedAttempts property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setFailedAttempts(Integer value) {
        this.failedAttempts = value;
    }

    /**
     * Gets the value of the ibUserId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIBUserId() {
        return ibUserId;
    }

    /**
     * Sets the value of the ibUserId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIBUserId(String value) {
        this.ibUserId = value;
    }

    /**
     * Gets the value of the isNotified property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsNotified() {
        return isNotified;
    }

    /**
     * Sets the value of the isNotified property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsNotified(Boolean value) {
        this.isNotified = value;
    }

    /**
     * Gets the value of the ispCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getISPCode() {
        return ispCode;
    }

    /**
     * Sets the value of the ispCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setISPCode(String value) {
        this.ispCode = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the networkTrnData property.
     *
     * @return
     *     possible object is
     *     {@link NetworkTrnData }
     *
     */
    public NetworkTrnData getNetworkTrnData() {
        return networkTrnData;
    }

    /**
     * Sets the value of the networkTrnData property.
     *
     * @param value
     *     allowed object is
     *     {@link NetworkTrnData }
     *
     */
    public void setNetworkTrnData(NetworkTrnData value) {
        this.networkTrnData = value;
    }

    /**
     * Gets the value of the notificationDt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getNotificationDt() {
        return notificationDt;
    }

    /**
     * Sets the value of the notificationDt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setNotificationDt(XMLGregorianCalendar value) {
        this.notificationDt = value;
    }

    /**
     * Gets the value of the notificationHr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNotificationHr() {
        return notificationHr;
    }

    /**
     * Sets the value of the notificationHr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNotificationHr(String value) {
        this.notificationHr = value;
    }

    /**
     * Gets the value of the notificationMethod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNotificationMethod() {
        return notificationMethod;
    }

    /**
     * Sets the value of the notificationMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNotificationMethod(String value) {
        this.notificationMethod = value;
    }

    /**
     * Gets the value of the prefix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the privateIp property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * Sets the value of the privateIp property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrivateIp(String value) {
        this.privateIp = value;
    }

    /**
     * Gets the value of the region property.
     *
     * @return
     *     possible object is
     *     {@link CommonType }
     *
     */
    public CommonType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonType }
     *
     */
    public void setRegion(CommonType value) {
        this.region = value;
    }

    /**
     * Gets the value of the userStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserStatus(String value) {
        this.userStatus = value;
    }

}
