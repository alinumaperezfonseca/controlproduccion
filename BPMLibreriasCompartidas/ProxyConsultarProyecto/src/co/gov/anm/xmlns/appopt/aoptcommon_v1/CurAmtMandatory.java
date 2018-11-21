
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Currency Amount.
 *
 * All monetary amounts in the IFX Specification are handled with the Currency Amount data type. When included, this data type contains a decimal value for the amount, an optional currency code.
 *
 * <p>Java class for CurAmtMandatory complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CurAmtMandatory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CurCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurAmtMandatory", propOrder = { "amt", "curCode" })
public class CurAmtMandatory {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CurCode", required = true)
    protected String curCode;

    /**
     * Gets the value of the amt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the curCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Sets the value of the curCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

}
