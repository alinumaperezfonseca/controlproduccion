
package co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Titulos complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Titulos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Titulo" type="{http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulos_V1.0}Titulo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Titulos", propOrder = { "titulo" })
public class Titulos {

    @XmlElement(name = "Titulo")
    protected List<Titulo> titulo;

    /**
     * Gets the value of the titulo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Titulo }
     *
     *
     */
    public List<Titulo> getTitulo() {
        if (titulo == null) {
            titulo = new ArrayList<Titulo>();
        }
        return this.titulo;
    }

}
