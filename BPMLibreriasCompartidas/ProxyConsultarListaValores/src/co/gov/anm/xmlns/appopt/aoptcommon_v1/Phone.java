
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Phone
 *
 * <p>Java class for Phone complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Phone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneType" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}EnumPhoneType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Phone", propOrder = { "areaCode", "phoneExt", "phoneNum", "phoneType" })
public class Phone {

    @XmlElement(name = "AreaCode")
    protected String areaCode;
    @XmlElement(name = "PhoneExt")
    protected String phoneExt;
    @XmlElement(name = "PhoneNum")
    protected String phoneNum;
    @XmlElement(name = "PhoneType")
    @XmlSchemaType(name = "string")
    protected EnumPhoneType phoneType;

    /**
     * Gets the value of the areaCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the phoneExt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Sets the value of the phoneExt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }

    /**
     * Gets the value of the phoneNum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the phoneType property.
     *
     * @return
     *     possible object is
     *     {@link EnumPhoneType }
     *
     */
    public EnumPhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * Sets the value of the phoneType property.
     *
     * @param value
     *     allowed object is
     *     {@link EnumPhoneType }
     *
     */
    public void setPhoneType(EnumPhoneType value) {
        this.phoneType = value;
    }

}
