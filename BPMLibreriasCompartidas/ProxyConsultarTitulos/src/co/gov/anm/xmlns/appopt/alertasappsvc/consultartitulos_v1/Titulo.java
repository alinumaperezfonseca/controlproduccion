
package co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Titulo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Titulo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdTitulos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Titulo", propOrder = { "idTitulos", "nombreTitulo" })
public class Titulo {

    @XmlElement(name = "IdTitulos")
    protected String idTitulos;
    @XmlElement(name = "NombreTitulo")
    protected String nombreTitulo;

    /**
     * Gets the value of the idTitulos property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdTitulos() {
        return idTitulos;
    }

    /**
     * Sets the value of the idTitulos property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdTitulos(String value) {
        this.idTitulos = value;
    }

    /**
     * Gets the value of the nombreTitulo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreTitulo() {
        return nombreTitulo;
    }

    /**
     * Sets the value of the nombreTitulo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreTitulo(String value) {
        this.nombreTitulo = value;
    }

}
