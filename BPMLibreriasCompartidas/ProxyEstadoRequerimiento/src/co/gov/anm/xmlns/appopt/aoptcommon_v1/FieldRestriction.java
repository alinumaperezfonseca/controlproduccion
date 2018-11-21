
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldRestriction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FieldRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxLenght" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MinLenght" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldRestriction", propOrder = { "isReadOnly", "maxLenght", "maxValue", "minLenght", "minValue" })
public class FieldRestriction {

    @XmlElement(name = "IsReadOnly")
    protected Boolean isReadOnly;
    @XmlElement(name = "MaxLenght")
    protected Integer maxLenght;
    @XmlElement(name = "MaxValue")
    protected BigDecimal maxValue;
    @XmlElement(name = "MinLenght")
    protected Integer minLenght;
    @XmlElement(name = "MinValue")
    protected BigDecimal minValue;

    /**
     * Gets the value of the isReadOnly property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Sets the value of the isReadOnly property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsReadOnly(Boolean value) {
        this.isReadOnly = value;
    }

    /**
     * Gets the value of the maxLenght property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxLenght() {
        return maxLenght;
    }

    /**
     * Sets the value of the maxLenght property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMaxLenght(Integer value) {
        this.maxLenght = value;
    }

    /**
     * Gets the value of the maxValue property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the minLenght property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMinLenght() {
        return minLenght;
    }

    /**
     * Sets the value of the minLenght property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMinLenght(Integer value) {
        this.minLenght = value;
    }

    /**
     * Gets the value of the minValue property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

}
