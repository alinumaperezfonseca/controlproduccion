
package co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.anm.xmlns.appopt.aoptcommon_v1.Status;


/**
 * <p>Java class for ConsultarVencimientoContractualRs_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarVencimientoContractualRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Titulos" type="{http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarVencimientoContractual_V1.0}Titulos" minOccurs="0"/&gt;
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
@XmlType(name = "ConsultarVencimientoContractualRs_Type", propOrder = { "titulos", "status" })
public class ConsultarVencimientoContractualRsType {

    @XmlElement(name = "Titulos")
    protected Titulos titulos;
    @XmlElement(name = "Status", required = true)
    protected Status status;

    /**
     * Gets the value of the titulos property.
     *
     * @return
     *     possible object is
     *     {@link Titulos }
     *
     */
    public Titulos getTitulos() {
        return titulos;
    }

    /**
     * Sets the value of the titulos property.
     *
     * @param value
     *     allowed object is
     *     {@link Titulos }
     *
     */
    public void setTitulos(Titulos value) {
        this.titulos = value;
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
