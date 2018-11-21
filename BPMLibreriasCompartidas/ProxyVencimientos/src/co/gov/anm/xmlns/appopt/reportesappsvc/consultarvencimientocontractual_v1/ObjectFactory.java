
package co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1 package.
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

    private final static QName _ConsultarVencimientoContractualRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarVencimientoContractual_V1.0",
                  "ConsultarVencimientoContractualRq");
    private final static QName _ConsultarVencimientoContractualRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarVencimientoContractual_V1.0",
                  "ConsultarVencimientoContractualRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarVencimientoContractualRqType }
     *
     */
    public ConsultarVencimientoContractualRqType createConsultarVencimientoContractualRqType() {
        return new ConsultarVencimientoContractualRqType();
    }

    /**
     * Create an instance of {@link ConsultarVencimientoContractualRsType }
     *
     */
    public ConsultarVencimientoContractualRsType createConsultarVencimientoContractualRsType() {
        return new ConsultarVencimientoContractualRsType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarVencimientoContractualRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarVencimientoContractualRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarVencimientoContractual_V1.0",
                    name = "ConsultarVencimientoContractualRq")
    public JAXBElement<ConsultarVencimientoContractualRqType> createConsultarVencimientoContractualRq(ConsultarVencimientoContractualRqType value) {
        return new JAXBElement<ConsultarVencimientoContractualRqType>(_ConsultarVencimientoContractualRq_QNAME,
                                                                      ConsultarVencimientoContractualRqType.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarVencimientoContractualRsType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarVencimientoContractualRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ConsultarVencimientoContractual_V1.0",
                    name = "ConsultarVencimientoContractualRs")
    public JAXBElement<ConsultarVencimientoContractualRsType> createConsultarVencimientoContractualRs(ConsultarVencimientoContractualRsType value) {
        return new JAXBElement<ConsultarVencimientoContractualRsType>(_ConsultarVencimientoContractualRs_QNAME,
                                                                      ConsultarVencimientoContractualRsType.class, null,
                                                                      value);
    }

}
