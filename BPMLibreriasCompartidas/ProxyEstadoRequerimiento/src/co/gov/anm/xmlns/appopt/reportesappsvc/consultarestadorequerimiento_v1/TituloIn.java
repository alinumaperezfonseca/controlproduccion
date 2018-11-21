
package co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TituloIn complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TituloIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TituloIn", propOrder = { "idTitulo" })
public class TituloIn {

    @XmlElement(name = "IdTitulo")
    protected String idTitulo;

    /**
     * Gets the value of the idTitulo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTitulo() {
        return idTitulo;
    }

    /**
     * Sets the value of the idTitulo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTitulo(String value) {
        this.idTitulo = value;
    }

}
