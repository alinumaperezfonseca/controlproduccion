
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Custom Date
 *
 * <p>Java class for CustomDate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CustomDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomDate", propOrder = { "day", "month", "year" })
public class CustomDate {

    @XmlElement(name = "Day")
    protected String day;
    @XmlElement(name = "Month")
    protected String month;
    @XmlElement(name = "Year")
    protected String year;

    /**
     * Gets the value of the day property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDay(String value) {
        this.day = value;
    }

    /**
     * Gets the value of the month property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMonth(String value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYear(String value) {
        this.year = value;
    }

}
