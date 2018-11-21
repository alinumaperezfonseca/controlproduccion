
package co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proyectos complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Proyectos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proyecto" type="{http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0}Proyecto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proyectos", propOrder = { "proyecto" })
public class Proyectos {

    @XmlElement(name = "Proyecto")
    protected List<Proyecto> proyecto;

    /**
     * Gets the value of the proyecto property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proyecto property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProyecto().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proyecto }
     *
     *
     */
    public List<Proyecto> getProyecto() {
        if (proyecto == null) {
            proyecto = new ArrayList<Proyecto>();
        }
        return this.proyecto;
    }

}
