
package co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarTitulosRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulos_V1.0", "ConsultarTitulosRq");
    private final static QName _ConsultarTitulosRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulos_V1.0", "ConsultarTitulosRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarTitulosRqType }
     *
     */
    public ConsultarTitulosRqType createConsultarTitulosRqType() {
        return new ConsultarTitulosRqType();
    }

    /**
     * Create an instance of {@link ConsultarTitulosRsType }
     *
     */
    public ConsultarTitulosRsType createConsultarTitulosRsType() {
        return new ConsultarTitulosRsType();
    }

    /**
     * Create an instance of {@link Proyecto }
     *
     */
    public Proyecto createProyecto() {
        return new Proyecto();
    }

    /**
     * Create an instance of {@link Titulos }
     *
     */
    public Titulos createTitulos() {
        return new Titulos();
    }

    /**
     * Create an instance of {@link Titulo }
     *
     */
    public Titulo createTitulo() {
        return new Titulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTitulosRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarTitulosRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulos_V1.0",
                    name = "ConsultarTitulosRq")
    public JAXBElement<ConsultarTitulosRqType> createConsultarTitulosRq(ConsultarTitulosRqType value) {
        return new JAXBElement<ConsultarTitulosRqType>(_ConsultarTitulosRq_QNAME, ConsultarTitulosRqType.class, null,
                                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTitulosRsType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarTitulosRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulos_V1.0",
                    name = "ConsultarTitulosRs")
    public JAXBElement<ConsultarTitulosRsType> createConsultarTitulosRs(ConsultarTitulosRsType value) {
        return new JAXBElement<ConsultarTitulosRsType>(_ConsultarTitulosRs_QNAME, ConsultarTitulosRsType.class, null,
                                                       value);
    }

}
