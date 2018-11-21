
package co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1 package.
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

    private final static QName _ConsultarProyectoRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0", "ConsultarProyectoRq");
    private final static QName _ConsultarProyectoRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0", "ConsultarProyectoRs");
    private final static QName _ConsultarProyectoRqType_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0", "ConsultarProyectoRq_Type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarProyectoRqType }
     *
     */
    public ConsultarProyectoRqType createConsultarProyectoRqType() {
        return new ConsultarProyectoRqType();
    }

    /**
     * Create an instance of {@link ConsultarProyectoRsType }
     *
     */
    public ConsultarProyectoRsType createConsultarProyectoRsType() {
        return new ConsultarProyectoRsType();
    }

    /**
     * Create an instance of {@link Proyectos }
     *
     */
    public Proyectos createProyectos() {
        return new Proyectos();
    }

    /**
     * Create an instance of {@link Proyecto }
     *
     */
    public Proyecto createProyecto() {
        return new Proyecto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProyectoRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarProyectoRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0",
                    name = "ConsultarProyectoRq")
    public JAXBElement<ConsultarProyectoRqType> createConsultarProyectoRq(ConsultarProyectoRqType value) {
        return new JAXBElement<ConsultarProyectoRqType>(_ConsultarProyectoRq_QNAME, ConsultarProyectoRqType.class, null,
                                                        value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProyectoRsType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarProyectoRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0",
                    name = "ConsultarProyectoRs")
    public JAXBElement<ConsultarProyectoRsType> createConsultarProyectoRs(ConsultarProyectoRsType value) {
        return new JAXBElement<ConsultarProyectoRsType>(_ConsultarProyectoRs_QNAME, ConsultarProyectoRsType.class, null,
                                                        value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProyectoRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarProyectoRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AlertasAppSvc/ConsultarProyecto_V1.0",
                    name = "ConsultarProyectoRq_Type")
    public JAXBElement<ConsultarProyectoRqType> createConsultarProyectoRqType(ConsultarProyectoRqType value) {
        return new JAXBElement<ConsultarProyectoRqType>(_ConsultarProyectoRqType_QNAME, ConsultarProyectoRqType.class,
                                                        null, value);
    }

}
