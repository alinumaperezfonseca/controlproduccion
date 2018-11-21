
package co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1 package.
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

    private final static QName _ConsultarListaValoresRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ListaValoresAppSvc/ConsultarListaValores_V1.0",
                  "ConsultarListaValoresRq");
    private final static QName _ConsultarListaValoresRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/ListaValoresAppSvc/ConsultarListaValores_V1.0",
                  "ConsultarListaValoresRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarListaValoresRqType }
     *
     */
    public ConsultarListaValoresRqType createConsultarListaValoresRqType() {
        return new ConsultarListaValoresRqType();
    }

    /**
     * Create an instance of {@link ConsultarListaValoresRsType }
     *
     */
    public ConsultarListaValoresRsType createConsultarListaValoresRsType() {
        return new ConsultarListaValoresRsType();
    }

    /**
     * Create an instance of {@link ListaIn }
     *
     */
    public ListaIn createListaIn() {
        return new ListaIn();
    }

    /**
     * Create an instance of {@link Lista }
     *
     */
    public Lista createLista() {
        return new Lista();
    }

    /**
     * Create an instance of {@link TiposAlerta }
     *
     */
    public TiposAlerta createTiposAlerta() {
        return new TiposAlerta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaValoresRqType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarListaValoresRqType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ListaValoresAppSvc/ConsultarListaValores_V1.0",
                    name = "ConsultarListaValoresRq")
    public JAXBElement<ConsultarListaValoresRqType> createConsultarListaValoresRq(ConsultarListaValoresRqType value) {
        return new JAXBElement<ConsultarListaValoresRqType>(_ConsultarListaValoresRq_QNAME,
                                                            ConsultarListaValoresRqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarListaValoresRsType }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarListaValoresRsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/ListaValoresAppSvc/ConsultarListaValores_V1.0",
                    name = "ConsultarListaValoresRs")
    public JAXBElement<ConsultarListaValoresRsType> createConsultarListaValoresRs(ConsultarListaValoresRsType value) {
        return new JAXBElement<ConsultarListaValoresRsType>(_ConsultarListaValoresRs_QNAME,
                                                            ConsultarListaValoresRsType.class, null, value);
    }

}
