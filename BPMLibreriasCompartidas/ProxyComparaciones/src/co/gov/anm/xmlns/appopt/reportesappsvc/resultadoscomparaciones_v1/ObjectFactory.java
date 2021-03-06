
package co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1 package.
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

    private final static QName _ResultadosComparacionesRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ResultadosComparaciones_V1.0",
                  "ResultadosComparacionesRq");
    private final static QName _ResultadosComparacionesRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ResultadosComparaciones_V1.0",
                  "ResultadosComparacionesRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadosComparacionesRqType }
     *
     */
    public ResultadosComparacionesRqType createResultadosComparacionesRqType() {
        return new ResultadosComparacionesRqType();
    }

    /**
     * Create an instance of {@link ResultadosComparacionesRsType }
     *
     */
    public ResultadosComparacionesRsType createResultadosComparacionesRsType() {
        return new ResultadosComparacionesRsType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadosComparacionesRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadosComparacionesRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ResultadosComparaciones_V1.0",
                    name = "ResultadosComparacionesRq")
    public JAXBElement<ResultadosComparacionesRqType> createResultadosComparacionesRq(ResultadosComparacionesRqType value) {
        return new JAXBElement<ResultadosComparacionesRqType>(_ResultadosComparacionesRq_QNAME,
                                                              ResultadosComparacionesRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadosComparacionesRsType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadosComparacionesRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ReportesAppSvc/ResultadosComparaciones_V1.0",
                    name = "ResultadosComparacionesRs")
    public JAXBElement<ResultadosComparacionesRsType> createResultadosComparacionesRs(ResultadosComparacionesRsType value) {
        return new JAXBElement<ResultadosComparacionesRsType>(_ResultadosComparacionesRs_QNAME,
                                                              ResultadosComparacionesRsType.class, null, value);
    }

}
