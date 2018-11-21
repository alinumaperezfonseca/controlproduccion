
package co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1;

import java.math.BigInteger;

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
 *         &lt;element name="NombreTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaFinVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiasRestantes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Titulo", propOrder = { "nombreTitulo", "fechaFinVigencia", "diasRestantes" })
public class Titulo {

    @XmlElement(name = "NombreTitulo")
    protected String nombreTitulo;
    @XmlElement(name = "FechaFinVigencia")
    protected String fechaFinVigencia;
    @XmlElement(name = "DiasRestantes")
    protected BigInteger diasRestantes;

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
     * Gets the value of the fechaFinVigencia property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    /**
     * Sets the value of the fechaFinVigencia property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaFinVigencia(String value) {
        this.fechaFinVigencia = value;
    }

    /**
     * Gets the value of the diasRestantes property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getDiasRestantes() {
        return diasRestantes;
    }

    /**
     * Sets the value of the diasRestantes property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setDiasRestantes(BigInteger value) {
        this.diasRestantes = value;
    }

}
