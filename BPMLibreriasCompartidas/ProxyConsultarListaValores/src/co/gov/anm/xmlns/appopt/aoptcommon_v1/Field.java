
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Field"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldCalc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldInq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListValues" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Restriction" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}FieldRestriction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field",
         propOrder =
         { "fieldCalc", "fieldId", "fieldInq", "fieldLabel", "fieldType", "listValues", "serviceField", "serviceOper",
           "restriction"
    })
public class Field {

    @XmlElement(name = "FieldCalc")
    protected String fieldCalc;
    @XmlElement(name = "FieldId")
    protected String fieldId;
    @XmlElement(name = "FieldInq")
    protected String fieldInq;
    @XmlElement(name = "FieldLabel")
    protected String fieldLabel;
    @XmlElement(name = "FieldType")
    protected String fieldType;
    @XmlElement(name = "ListValues")
    protected String listValues;
    @XmlElement(name = "ServiceField")
    protected String serviceField;
    @XmlElement(name = "ServiceOper")
    protected String serviceOper;
    @XmlElement(name = "Restriction")
    protected FieldRestriction restriction;

    /**
     * Gets the value of the fieldCalc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFieldCalc() {
        return fieldCalc;
    }

    /**
     * Sets the value of the fieldCalc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFieldCalc(String value) {
        this.fieldCalc = value;
    }

    /**
     * Gets the value of the fieldId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * Sets the value of the fieldId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFieldId(String value) {
        this.fieldId = value;
    }

    /**
     * Gets the value of the fieldInq property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFieldInq() {
        return fieldInq;
    }

    /**
     * Sets the value of the fieldInq property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFieldInq(String value) {
        this.fieldInq = value;
    }

    /**
     * Gets the value of the fieldLabel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFieldLabel() {
        return fieldLabel;
    }

    /**
     * Sets the value of the fieldLabel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFieldLabel(String value) {
        this.fieldLabel = value;
    }

    /**
     * Gets the value of the fieldType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the listValues property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getListValues() {
        return listValues;
    }

    /**
     * Sets the value of the listValues property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setListValues(String value) {
        this.listValues = value;
    }

    /**
     * Gets the value of the serviceField property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceField() {
        return serviceField;
    }

    /**
     * Sets the value of the serviceField property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceField(String value) {
        this.serviceField = value;
    }

    /**
     * Gets the value of the serviceOper property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceOper() {
        return serviceOper;
    }

    /**
     * Sets the value of the serviceOper property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceOper(String value) {
        this.serviceOper = value;
    }

    /**
     * Gets the value of the restriction property.
     *
     * @return
     *     possible object is
     *     {@link FieldRestriction }
     *
     */
    public FieldRestriction getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     *
     * @param value
     *     allowed object is
     *     {@link FieldRestriction }
     *
     */
    public void setRestriction(FieldRestriction value) {
        this.restriction = value;
    }

}
