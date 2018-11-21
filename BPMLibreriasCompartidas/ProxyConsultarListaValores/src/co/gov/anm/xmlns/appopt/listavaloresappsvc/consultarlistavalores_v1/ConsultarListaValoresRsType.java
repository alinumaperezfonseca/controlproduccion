
package co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import co.gov.anm.xmlns.appopt.aoptcommon_v1.Status;


/**
 * <p>Java class for ConsultarListaValoresRs_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarListaValoresRs_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Lista" type="{http://xmlns.anm.gov.co/appopt/ListaValoresAppSvc/ConsultarListaValores_V1.0}Lista" minOccurs="0"/&gt;
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
@XmlType(name = "ConsultarListaValoresRs_Type", propOrder = { "lista", "status" })
public class ConsultarListaValoresRsType {

    @XmlElement(name = "Lista")
    protected Lista lista;
    @XmlElement(name = "Status", required = true)
    protected Status status;

    /**
     * Gets the value of the lista property.
     *
     * @return
     *     possible object is
     *     {@link Lista }
     *
     */
    public Lista getLista() {
        return lista;
    }

    /**
     * Sets the value of the lista property.
     *
     * @param value
     *     allowed object is
     *     {@link Lista }
     *
     */
    public void setLista(Lista value) {
        this.lista = value;
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
