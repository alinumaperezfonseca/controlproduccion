
package co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarTituloRq_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarTituloRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TituloIn" type="{http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulo_V1.0}TituloIn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarTituloRq_Type", propOrder = { "tituloIn" })
public class ConsultarTituloRqType {

    @XmlElement(name = "TituloIn", required = true)
    protected TituloIn tituloIn;

    /**
     * Gets the value of the tituloIn property.
     *
     * @return
     *     possible object is
     *     {@link TituloIn }
     *
     */
    public TituloIn getTituloIn() {
        return tituloIn;
    }

    /**
     * Sets the value of the tituloIn property.
     *
     * @param value
     *     allowed object is
     *     {@link TituloIn }
     *
     */
    public void setTituloIn(TituloIn value) {
        this.tituloIn = value;
    }

}
