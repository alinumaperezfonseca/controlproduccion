
package co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarTitulosRq_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarTitulosRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proyecto" type="{http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulos_V1.0}Proyecto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarTitulosRq_Type", propOrder = { "proyecto" })
public class ConsultarTitulosRqType {

    @XmlElement(name = "Proyecto", required = true)
    protected Proyecto proyecto;

    /**
     * Gets the value of the proyecto property.
     *
     * @return
     *     possible object is
     *     {@link Proyecto }
     *
     */
    public Proyecto getProyecto() {
        return proyecto;
    }

    /**
     * Sets the value of the proyecto property.
     *
     * @param value
     *     allowed object is
     *     {@link Proyecto }
     *
     */
    public void setProyecto(Proyecto value) {
        this.proyecto = value;
    }

}
