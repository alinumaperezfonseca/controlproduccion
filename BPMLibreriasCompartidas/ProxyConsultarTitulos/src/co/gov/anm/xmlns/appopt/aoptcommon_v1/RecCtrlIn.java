
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecCtrlIn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RecCtrlIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RecCountLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="StartRecNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecCtrlIn", propOrder = { "recCountLimit", "startRecNum" })
public class RecCtrlIn {

    @XmlElement(name = "RecCountLimit")
    protected BigInteger recCountLimit;
    @XmlElement(name = "StartRecNum")
    protected BigInteger startRecNum;

    /**
     * Gets the value of the recCountLimit property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getRecCountLimit() {
        return recCountLimit;
    }

    /**
     * Sets the value of the recCountLimit property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setRecCountLimit(BigInteger value) {
        this.recCountLimit = value;
    }

    /**
     * Gets the value of the startRecNum property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getStartRecNum() {
        return startRecNum;
    }

    /**
     * Sets the value of the startRecNum property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setStartRecNum(BigInteger value) {
        this.startRecNum = value;
    }

}
