
package co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaIn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListaIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdDominio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaIn", propOrder = { "idDominio" })
public class ListaIn {

    @XmlElement(name = "IdDominio", required = true)
    protected String idDominio;

    /**
     * Gets the value of the idDominio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdDominio() {
        return idDominio;
    }

    /**
     * Sets the value of the idDominio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdDominio(String value) {
        this.idDominio = value;
    }

}
