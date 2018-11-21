
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkTrnData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NetworkTrnData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkTrnData", propOrder = { "hostName", "ipAddress", "macAddress" })
public class NetworkTrnData {

    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "MacAddress")
    protected String macAddress;

    /**
     * Gets the value of the hostName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the ipAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the macAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

}
