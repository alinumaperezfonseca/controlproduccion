
package co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1;

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
 *         &lt;element name="IdTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mineral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Titulo", propOrder = { "idTitulo", "nombreTitulo", "ubicacion", "mineral", "titular" })
public class Titulo {

    @XmlElement(name = "IdTitulo")
    protected String idTitulo;
    @XmlElement(name = "NombreTitulo")
    protected String nombreTitulo;
    @XmlElement(name = "Ubicacion")
    protected String ubicacion;
    @XmlElement(name = "Mineral")
    protected String mineral;
    @XmlElement(name = "Titular")
    protected String titular;

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

    /**
     * Gets the value of the ubicacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the mineral property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMineral() {
        return mineral;
    }

    /**
     * Sets the value of the mineral property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMineral(String value) {
        this.mineral = value;
    }

    /**
     * Gets the value of the titular property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Sets the value of the titular property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitular(String value) {
        this.titular = value;
    }

}
