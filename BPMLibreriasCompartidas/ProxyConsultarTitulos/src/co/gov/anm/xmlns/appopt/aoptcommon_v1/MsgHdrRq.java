
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MsgHdrRq complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MsgHdrRq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientDt" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}dateTimePattern"/&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MsgPriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RqdOper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RqdOperType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RqdService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientApp" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}ClientApp" minOccurs="0"/&gt;
 *         &lt;element name="NetworkTrnData" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}NetworkTrnData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgHdrRq",
         propOrder =
         { "clientDt", "destination", "msgPriority", "requestId", "rqdOper", "rqdOperType", "rqdService", "clientApp",
           "networkTrnData"
    })
public class MsgHdrRq {

    @XmlElement(name = "ClientDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientDt;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "MsgPriority")
    protected BigInteger msgPriority;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "RqdOper")
    protected String rqdOper;
    @XmlElement(name = "RqdOperType")
    protected String rqdOperType;
    @XmlElement(name = "RqdService")
    protected String rqdService;
    @XmlElement(name = "ClientApp")
    protected ClientApp clientApp;
    @XmlElement(name = "NetworkTrnData")
    protected NetworkTrnData networkTrnData;

    /**
     * Gets the value of the clientDt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getClientDt() {
        return clientDt;
    }

    /**
     * Sets the value of the clientDt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setClientDt(XMLGregorianCalendar value) {
        this.clientDt = value;
    }

    /**
     * Gets the value of the destination property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the msgPriority property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getMsgPriority() {
        return msgPriority;
    }

    /**
     * Sets the value of the msgPriority property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setMsgPriority(BigInteger value) {
        this.msgPriority = value;
    }

    /**
     * Gets the value of the requestId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the rqdOper property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRqdOper() {
        return rqdOper;
    }

    /**
     * Sets the value of the rqdOper property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRqdOper(String value) {
        this.rqdOper = value;
    }

    /**
     * Gets the value of the rqdOperType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRqdOperType() {
        return rqdOperType;
    }

    /**
     * Sets the value of the rqdOperType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRqdOperType(String value) {
        this.rqdOperType = value;
    }

    /**
     * Gets the value of the rqdService property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRqdService() {
        return rqdService;
    }

    /**
     * Sets the value of the rqdService property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRqdService(String value) {
        this.rqdService = value;
    }

    /**
     * Gets the value of the clientApp property.
     *
     * @return
     *     possible object is
     *     {@link ClientApp }
     *
     */
    public ClientApp getClientApp() {
        return clientApp;
    }

    /**
     * Sets the value of the clientApp property.
     *
     * @param value
     *     allowed object is
     *     {@link ClientApp }
     *
     */
    public void setClientApp(ClientApp value) {
        this.clientApp = value;
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

}
