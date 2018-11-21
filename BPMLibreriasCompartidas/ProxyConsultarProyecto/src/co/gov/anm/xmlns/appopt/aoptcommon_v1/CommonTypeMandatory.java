
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Generico
 *
 * <p>Java class for CommonTypeMandatory complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CommonTypeMandatory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Cod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonTypeMandatory", propOrder = { "cod", "desc" })
public class CommonTypeMandatory {

    @XmlElement(name = "Cod")
    protected String cod;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the cod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCod() {
        return cod;
    }

    /**
     * Sets the value of the cod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCod(String value) {
        this.cod = value;
    }

    /**
     * Gets the value of the desc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
