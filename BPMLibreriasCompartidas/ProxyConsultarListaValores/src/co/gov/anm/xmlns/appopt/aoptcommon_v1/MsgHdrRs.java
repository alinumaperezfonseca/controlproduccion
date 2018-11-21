
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MsgHdrRs complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MsgHdrRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientDt" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}dateTimePattern"/&gt;
 *         &lt;element name="MsgPriority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RqdOper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RqdService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerDt" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}dateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="ClientApp" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}ClientApp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MsgHdrRs",
         propOrder =
         { "clientDt", "msgPriority", "requestId", "responseId", "rqdOper", "rqdService", "serverDt", "clientApp"
    })
public class MsgHdrRs {

    @XmlElement(name = "ClientDt", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientDt;
    @XmlElement(name = "MsgPriority")
    protected BigInteger msgPriority;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "ResponseId")
    protected String responseId;
    @XmlElement(name = "RqdOper")
    protected String rqdOper;
    @XmlElement(name = "RqdService")
    protected String rqdService;
    @XmlElement(name = "ServerDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serverDt;
    @XmlElement(name = "ClientApp")
    protected ClientApp clientApp;

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
     * Gets the value of the responseId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseId() {
        return responseId;
    }

    /**
     * Sets the value of the responseId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseId(String value) {
        this.responseId = value;
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
     * Gets the value of the serverDt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getServerDt() {
        return serverDt;
    }

    /**
     * Sets the value of the serverDt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setServerDt(XMLGregorianCalendar value) {
        this.serverDt = value;
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

}
