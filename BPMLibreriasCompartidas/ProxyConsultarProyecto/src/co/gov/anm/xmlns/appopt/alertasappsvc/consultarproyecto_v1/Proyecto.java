
package co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proyecto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Proyecto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdProyecto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreProyecto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proyecto", propOrder = { "idProyecto", "nombreProyecto" })
public class Proyecto {

    @XmlElement(name = "IdProyecto")
    protected String idProyecto;
    @XmlElement(name = "NombreProyecto")
    protected String nombreProyecto;

    /**
     * Gets the value of the idProyecto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdProyecto() {
        return idProyecto;
    }

    /**
     * Sets the value of the idProyecto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdProyecto(String value) {
        this.idProyecto = value;
    }

    /**
     * Gets the value of the nombreProyecto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    /**
     * Sets the value of the nombreProyecto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreProyecto(String value) {
        this.nombreProyecto = value;
    }

}
