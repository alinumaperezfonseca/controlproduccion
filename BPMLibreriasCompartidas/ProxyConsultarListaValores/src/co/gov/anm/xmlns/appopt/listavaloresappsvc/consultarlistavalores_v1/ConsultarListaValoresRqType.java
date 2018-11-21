
package co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarListaValoresRq_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarListaValoresRq_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListaIn" type="{http://xmlns.anm.gov.co/appopt/ListaValoresAppSvc/ConsultarListaValores_V1.0}ListaIn"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarListaValoresRq_Type", propOrder = { "listaIn" })
public class ConsultarListaValoresRqType {

    @XmlElement(name = "ListaIn", required = true)
    protected ListaIn listaIn;

    /**
     * Gets the value of the listaIn property.
     *
     * @return
     *     possible object is
     *     {@link ListaIn }
     *
     */
    public ListaIn getListaIn() {
        return listaIn;
    }

    /**
     * Sets the value of the listaIn property.
     *
     * @param value
     *     allowed object is
     *     {@link ListaIn }
     *
     */
    public void setListaIn(ListaIn value) {
        this.listaIn = value;
    }

}
