
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Binary data type is a compound type consisting of three logical elements:
 *
 *  1. ContentType.
 *  2. BinLength.
 *  3. BinData.
 *
 * <p>Java class for Binary complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Binary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="BinLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Binary", propOrder = { "binData", "binLength", "contentType", "fileURL" })
public class Binary {

    @XmlElement(name = "BinData")
    protected byte[] binData;
    @XmlElement(name = "BinLength")
    protected Long binLength;
    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElement(name = "FileURL")
    protected String fileURL;

    /**
     * Gets the value of the binData property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinData() {
        return binData;
    }

    /**
     * Sets the value of the binData property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinData(byte[] value) {
        this.binData = value;
    }

    /**
     * Gets the value of the binLength property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBinLength() {
        return binLength;
    }

    /**
     * Sets the value of the binLength property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBinLength(Long value) {
        this.binLength = value;
    }

    /**
     * Gets the value of the contentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the fileURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileURL() {
        return fileURL;
    }

    /**
     * Sets the value of the fileURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileURL(String value) {
        this.fileURL = value;
    }

}
