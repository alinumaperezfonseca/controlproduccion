
package co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1;

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
 *         &lt;element name="NombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreComparacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NombreVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Titulo",
         propOrder = { "nombreTitular", "nombreTitulo", "nombreComparacion", "fechaCarga", "valor", "nombreVariable" })
public class Titulo {

    @XmlElement(name = "NombreTitular")
    protected String nombreTitular;
    @XmlElement(name = "NombreTitulo")
    protected String nombreTitulo;
    @XmlElement(name = "NombreComparacion")
    protected String nombreComparacion;
    @XmlElement(name = "FechaCarga")
    protected String fechaCarga;
    @XmlElement(name = "Valor")
    protected BigInteger valor;
    @XmlElement(name = "NombreVariable")
    protected String nombreVariable;

    /**
     * Gets the value of the nombreTitular property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Sets the value of the nombreTitular property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreTitular(String value) {
        this.nombreTitular = value;
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
     * Gets the value of the nombreComparacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreComparacion() {
        return nombreComparacion;
    }

    /**
     * Sets the value of the nombreComparacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreComparacion(String value) {
        this.nombreComparacion = value;
    }

    /**
     * Gets the value of the fechaCarga property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFechaCarga() {
        return fechaCarga;
    }

    /**
     * Sets the value of the fechaCarga property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFechaCarga(String value) {
        this.fechaCarga = value;
    }

    /**
     * Gets the value of the valor property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setValor(BigInteger value) {
        this.valor = value;
    }

    /**
     * Gets the value of the nombreVariable property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreVariable() {
        return nombreVariable;
    }

    /**
     * Sets the value of the nombreVariable property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreVariable(String value) {
        this.nombreVariable = value;
    }

}
