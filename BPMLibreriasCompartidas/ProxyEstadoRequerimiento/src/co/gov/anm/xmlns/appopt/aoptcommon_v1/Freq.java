
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contiene los campos necesarios para las frecuencias asociadas a los pagos de cualquier producto.
 *
 * <p>Java class for Freq complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Freq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Every" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreqValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoPaymentMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnDayNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnWeekDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Freq", propOrder = { "every", "freqValue", "noPaymentMonth", "onDay", "onDayNumber", "onWeekDay" })
public class Freq {

    @XmlElement(name = "Every")
    protected String every;
    @XmlElement(name = "FreqValue")
    protected String freqValue;
    @XmlElement(name = "NoPaymentMonth")
    protected String noPaymentMonth;
    @XmlElement(name = "OnDay")
    protected String onDay;
    @XmlElement(name = "OnDayNumber")
    protected String onDayNumber;
    @XmlElement(name = "OnWeekDay")
    protected String onWeekDay;

    /**
     * Gets the value of the every property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEvery() {
        return every;
    }

    /**
     * Sets the value of the every property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEvery(String value) {
        this.every = value;
    }

    /**
     * Gets the value of the freqValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFreqValue() {
        return freqValue;
    }

    /**
     * Sets the value of the freqValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFreqValue(String value) {
        this.freqValue = value;
    }

    /**
     * Gets the value of the noPaymentMonth property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNoPaymentMonth() {
        return noPaymentMonth;
    }

    /**
     * Sets the value of the noPaymentMonth property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNoPaymentMonth(String value) {
        this.noPaymentMonth = value;
    }

    /**
     * Gets the value of the onDay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnDay() {
        return onDay;
    }

    /**
     * Sets the value of the onDay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnDay(String value) {
        this.onDay = value;
    }

    /**
     * Gets the value of the onDayNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnDayNumber() {
        return onDayNumber;
    }

    /**
     * Sets the value of the onDayNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnDayNumber(String value) {
        this.onDayNumber = value;
    }

    /**
     * Gets the value of the onWeekDay property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOnWeekDay() {
        return onWeekDay;
    }

    /**
     * Sets the value of the onWeekDay property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOnWeekDay(String value) {
        this.onWeekDay = value;
    }

}
