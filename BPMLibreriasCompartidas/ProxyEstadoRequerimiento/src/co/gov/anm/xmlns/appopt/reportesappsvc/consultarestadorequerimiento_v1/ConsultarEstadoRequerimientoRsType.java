
package co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.anm.xmlns.appopt.aoptcommon_v1.Status;


/**
 * <p>Java class for ConsultarEstadoRequerimientoRs_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarEstadoRequerimientoRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Estados" type="{http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarEstadoRequerimiento_V1.0}Estados" minOccurs="0"/&gt;
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
@XmlType(name = "ConsultarEstadoRequerimientoRs_Type", propOrder = { "estados", "status" })
public class ConsultarEstadoRequerimientoRsType {

    @XmlElement(name = "Estados")
    protected Estados estados;
    @XmlElement(name = "Status", required = true)
    protected Status status;

    /**
     * Gets the value of the estados property.
     *
     * @return
     *     possible object is
     *     {@link Estados }
     *
     */
    public Estados getEstados() {
        return estados;
    }

    /**
     * Sets the value of the estados property.
     *
     * @param value
     *     allowed object is
     *     {@link Estados }
     *
     */
    public void setEstados(Estados value) {
        this.estados = value;
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
