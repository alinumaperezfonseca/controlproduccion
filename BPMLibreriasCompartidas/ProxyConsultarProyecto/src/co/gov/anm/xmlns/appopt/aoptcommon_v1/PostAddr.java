
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The PostAddr aggregate is used wherever a postal address is needed.
 *
 * <p>Java class for PostAddr complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PostAddr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Addr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddrDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Building" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}CommonType" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}CommonType" minOccurs="0"/&gt;
 *         &lt;element name="CountyDistrict" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}CommonType" minOccurs="0"/&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Jurisdiction" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}CommonType" minOccurs="0"/&gt;
 *         &lt;element name="POBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}CommonType" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}CommonType" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpDt" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}dateTimePattern" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}Country" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostAddr",
         propOrder =
         { "addr1", "addr2", "addr3", "addr4", "addrDesc", "addressIdent", "addrType", "building", "city",
           "countyDistrict", "houseNumber", "jurisdiction", "poBox", "postalCode", "province", "state", "street",
           "upDt", "country"
    })
public class PostAddr {

    @XmlElement(name = "Addr1")
    protected String addr1;
    @XmlElement(name = "Addr2")
    protected String addr2;
    @XmlElement(name = "Addr3")
    protected String addr3;
    @XmlElement(name = "Addr4")
    protected String addr4;
    @XmlElement(name = "AddrDesc")
    protected String addrDesc;
    @XmlElement(name = "AddressIdent")
    protected String addressIdent;
    @XmlElement(name = "AddrType")
    protected String addrType;
    @XmlElement(name = "Building")
    protected CommonType building;
    @XmlElement(name = "City")
    protected CommonType city;
    @XmlElement(name = "CountyDistrict")
    protected CommonType countyDistrict;
    @XmlElement(name = "HouseNumber")
    protected String houseNumber;
    @XmlElement(name = "Jurisdiction")
    protected CommonType jurisdiction;
    @XmlElement(name = "POBox")
    protected String poBox;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Province")
    protected CommonType province;
    @XmlElement(name = "State")
    protected CommonType state;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "UpDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar upDt;
    @XmlElement(name = "Country")
    protected Country country;

    /**
     * Gets the value of the addr1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddr1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddr3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddr3(String value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the addr4 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddr4() {
        return addr4;
    }

    /**
     * Sets the value of the addr4 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddr4(String value) {
        this.addr4 = value;
    }

    /**
     * Gets the value of the addrDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddrDesc() {
        return addrDesc;
    }

    /**
     * Sets the value of the addrDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddrDesc(String value) {
        this.addrDesc = value;
    }

    /**
     * Gets the value of the addressIdent property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressIdent() {
        return addressIdent;
    }

    /**
     * Sets the value of the addressIdent property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressIdent(String value) {
        this.addressIdent = value;
    }

    /**
     * Gets the value of the addrType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddrType(String value) {
        this.addrType = value;
    }

    /**
     * Gets the value of the building property.
     *
     * @return
     *     possible object is
     *     {@link CommonType }
     *
     */
    public CommonType getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonType }
     *
     */
    public void setBuilding(CommonType value) {
        this.building = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link CommonType }
     *
     */
    public CommonType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonType }
     *
     */
    public void setCity(CommonType value) {
        this.city = value;
    }

    /**
     * Gets the value of the countyDistrict property.
     *
     * @return
     *     possible object is
     *     {@link CommonType }
     *
     */
    public CommonType getCountyDistrict() {
        return countyDistrict;
    }

    /**
     * Sets the value of the countyDistrict property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonType }
     *
     */
    public void setCountyDistrict(CommonType value) {
        this.countyDistrict = value;
    }

    /**
     * Gets the value of the houseNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the jurisdiction property.
     *
     * @return
     *     possible object is
     *     {@link CommonType }
     *
     */
    public CommonType getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Sets the value of the jurisdiction property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonType }
     *
     */
    public void setJurisdiction(CommonType value) {
        this.jurisdiction = value;
    }

    /**
     * Gets the value of the poBox property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPOBox() {
        return poBox;
    }

    /**
     * Sets the value of the poBox property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPOBox(String value) {
        this.poBox = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the province property.
     *
     * @return
     *     possible object is
     *     {@link CommonType }
     *
     */
    public CommonType getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonType }
     *
     */
    public void setProvince(CommonType value) {
        this.province = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link CommonType }
     *
     */
    public CommonType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link CommonType }
     *
     */
    public void setState(CommonType value) {
        this.state = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the upDt property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUpDt() {
        return upDt;
    }

    /**
     * Sets the value of the upDt property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setUpDt(XMLGregorianCalendar value) {
        this.upDt = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link Country }
     *
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link Country }
     *
     */
    public void setCountry(Country value) {
        this.country = value;
    }

}
