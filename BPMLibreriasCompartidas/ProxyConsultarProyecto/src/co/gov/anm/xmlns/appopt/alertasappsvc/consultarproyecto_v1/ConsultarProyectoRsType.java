
package co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.anm.xmlns.appopt.aoptcommon_v1.Status;


/**
 * <p>Java class for ConsultarProyectoRs_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarProyectoRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proyectos" type="{http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0}Proyectos" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0}Status"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarProyectoRs_Type", propOrder = { "proyectos", "status" })
public class ConsultarProyectoRsType {

    @XmlElement(name = "Proyectos")
    protected Proyectos proyectos;
    @XmlElement(name = "Status", required = true)
    protected Status status;

    /**
     * Gets the value of the proyectos property.
     *
     * @return
     *     possible object is
     *     {@link Proyectos }
     *
     */
    public Proyectos getProyectos() {
        return proyectos;
    }

    /**
     * Sets the value of the proyectos property.
     *
     * @param value
     *     allowed object is
     *     {@link Proyectos }
     *
     */
    public void setProyectos(Proyectos value) {
        this.proyectos = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link Status }
     *
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link Status }
     *
     */
    public void setStatus(Status value) {
        this.status = value;
    }

}
