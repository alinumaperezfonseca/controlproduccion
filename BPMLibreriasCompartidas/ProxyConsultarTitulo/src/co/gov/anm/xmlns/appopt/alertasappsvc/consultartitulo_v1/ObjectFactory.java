
package co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1 package.
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

    private final static QName _ConsultarTituloRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulo_V1.0", "ConsultarTituloRq");
    private final static QName _ConsultarTituloRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulo_V1.0", "ConsultarTituloRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarTituloRqType }
     *
     */
    public ConsultarTituloRqType createConsultarTituloRqType() {
        return new ConsultarTituloRqType();
    }

    /**
     * Create an instance of {@link ConsultarTituloRsType }
     *
     */
    public ConsultarTituloRsType createConsultarTituloRsType() {
        return new ConsultarTituloRsType();
    }

    /**
     * Create an instance of {@link TituloIn }
     *
     */
    public TituloIn createTituloIn() {
        return new TituloIn();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTituloRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarTituloRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulo_V1.0",
                    name = "ConsultarTituloRq")
    public JAXBElement<ConsultarTituloRqType> createConsultarTituloRq(ConsultarTituloRqType value) {
        return new JAXBElement<ConsultarTituloRqType>(_ConsultarTituloRq_QNAME, ConsultarTituloRqType.class, null,
                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTituloRsType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarTituloRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarTitulo_V1.0",
                    name = "ConsultarTituloRs")
    public JAXBElement<ConsultarTituloRsType> createConsultarTituloRs(ConsultarTituloRsType value) {
        return new JAXBElement<ConsultarTituloRsType>(_ConsultarTituloRs_QNAME, ConsultarTituloRsType.class, null,
                                                      value);
    }

}
