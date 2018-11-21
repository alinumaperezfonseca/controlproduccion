
package co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Lista complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Lista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TiposAlerta" type="{http://xmlns.anm.gov.co/appopt/ListaValoresAppSvc/ConsultarListaValores_V1.0}TiposAlerta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lista", propOrder = { "tiposAlerta" })
public class Lista {

    @XmlElement(name = "TiposAlerta")
    protected List<TiposAlerta> tiposAlerta;

    /**
     * Gets the value of the tiposAlerta property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposAlerta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposAlerta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiposAlerta }
     *
     *
     */
    public List<TiposAlerta> getTiposAlerta() {
        if (tiposAlerta == null) {
            tiposAlerta = new ArrayList<TiposAlerta>();
        }
        return this.tiposAlerta;
    }

}
