
package co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TiposAlerta complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TiposAlerta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TiposAlerta", propOrder = { "idCodigo", "descripcion" })
public class TiposAlerta {

    @XmlElement(name = "IdCodigo")
    protected String idCodigo;
    @XmlElement(name = "Descripcion")
    protected String descripcion;

    /**
     * Gets the value of the idCodigo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdCodigo() {
        return idCodigo;
    }

    /**
     * Sets the value of the idCodigo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdCodigo(String value) {
        this.idCodigo = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
