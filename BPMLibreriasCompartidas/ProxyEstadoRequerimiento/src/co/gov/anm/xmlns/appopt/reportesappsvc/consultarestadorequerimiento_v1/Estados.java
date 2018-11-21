
package co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Estados complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Estados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Estado" type="{http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarEstadoRequerimiento_V1.0}Estado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estados", propOrder = { "estado" })
public class Estados {

    @XmlElement(name = "Estado")
    protected List<Estado> estado;

    /**
     * Gets the value of the estado property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estado property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstado().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Estado }
     *
     *
     */
    public List<Estado> getEstado() {
        if (estado == null) {
            estado = new ArrayList<Estado>();
        }
        return this.estado;
    }

}
