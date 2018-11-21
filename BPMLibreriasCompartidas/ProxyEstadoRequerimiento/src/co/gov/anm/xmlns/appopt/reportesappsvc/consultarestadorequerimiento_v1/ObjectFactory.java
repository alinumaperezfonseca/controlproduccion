
package co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1 package.
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

    private final static QName _ConsultarEstadoRequerimientoRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarEstadoRequerimiento_V1.0",
                  "ConsultarEstadoRequerimientoRq");
    private final static QName _ConsultarEstadoRequerimientoRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarEstadoRequerimiento_V1.0",
                  "ConsultarEstadoRequerimientoRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarEstadoRequerimientoRqType }
     *
     */
    public ConsultarEstadoRequerimientoRqType createConsultarEstadoRequerimientoRqType() {
        return new ConsultarEstadoRequerimientoRqType();
    }

    /**
     * Create an instance of {@link ConsultarEstadoRequerimientoRsType }
     *
     */
    public ConsultarEstadoRequerimientoRsType createConsultarEstadoRequerimientoRsType() {
        return new ConsultarEstadoRequerimientoRsType();
    }

    /**
     * Create an instance of {@link TituloIn }
     *
     */
    public TituloIn createTituloIn() {
        return new TituloIn();
    }

    /**
     * Create an instance of {@link Estados }
     *
     */
    public Estados createEstados() {
        return new Estados();
    }

    /**
     * Create an instance of {@link Estado }
     *
     */
    public Estado createEstado() {
        return new Estado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoRequerimientoRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoRequerimientoRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarEstadoRequerimiento_V1.0",
                    name = "ConsultarEstadoRequerimientoRq")
    public JAXBElement<ConsultarEstadoRequerimientoRqType> createConsultarEstadoRequerimientoRq(ConsultarEstadoRequerimientoRqType value) {
        return new JAXBElement<ConsultarEstadoRequerimientoRqType>(_ConsultarEstadoRequerimientoRq_QNAME,
                                                                   ConsultarEstadoRequerimientoRqType.class, null,
                                                                   value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoRequerimientoRsType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoRequerimientoRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarEstadoRequerimiento_V1.0",
                    name = "ConsultarEstadoRequerimientoRs")
    public JAXBElement<ConsultarEstadoRequerimientoRsType> createConsultarEstadoRequerimientoRs(ConsultarEstadoRequerimientoRsType value) {
        return new JAXBElement<ConsultarEstadoRequerimientoRsType>(_ConsultarEstadoRequerimientoRs_QNAME,
                                                                   ConsultarEstadoRequerimientoRsType.class, null,
                                                                   value);
    }

}
