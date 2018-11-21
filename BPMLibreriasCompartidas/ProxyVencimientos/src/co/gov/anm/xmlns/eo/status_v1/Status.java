
package co.gov.anm.xmlns.eo.status_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Functional message.
 *
 * <p>Java class for Status complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Status"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStatus" type="{http://xmlns.anm.gov.co/eo/Status_V1.0}AdditionalStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", propOrder = { "statusCode", "statusDesc", "additionalStatus" })
public class Status {

    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "StatusDesc")
    protected String statusDesc;
    @XmlElement(name = "AdditionalStatus")
    protected AdditionalStatus additionalStatus;

    /**
     * Gets the value of the statusCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Sets the value of the statusDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

    /**
     * Gets the value of the additionalStatus property.
     *
     * @return
     *     possible object is
     *     {@link AdditionalStatus }
     *
     */
    public AdditionalStatus getAdditionalStatus() {
        return additionalStatus;
    }

    /**
     * Sets the value of the additionalStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link AdditionalStatus }
     *
     */
    public void setAdditionalStatus(AdditionalStatus value) {
        this.additionalStatus = value;
    }

}
