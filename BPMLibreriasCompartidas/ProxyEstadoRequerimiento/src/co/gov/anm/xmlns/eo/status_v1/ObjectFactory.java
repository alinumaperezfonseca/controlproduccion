
package co.gov.anm.xmlns.eo.status_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.eo.status_v1 package.
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

    private final static QName _BusinessFault_QNAME =
        new QName("http://xmlns.anm.gov.co/eo/Status_V1.0", "BusinessFault");
    private final static QName _SystemFault_QNAME = new QName("http://xmlns.anm.gov.co/eo/Status_V1.0", "SystemFault");
    private final static QName _Status_QNAME = new QName("http://xmlns.anm.gov.co/eo/Status_V1.0", "Status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.eo.status_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Status }
     *
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link AdditionalStatus }
     *
     */
    public AdditionalStatus createAdditionalStatus() {
        return new AdditionalStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Status }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/eo/Status_V1.0", name = "BusinessFault")
    public JAXBElement<Status> createBusinessFault(Status value) {
        return new JAXBElement<Status>(_BusinessFault_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Status }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/eo/Status_V1.0", name = "SystemFault")
    public JAXBElement<Status> createSystemFault(Status value) {
        return new JAXBElement<Status>(_SystemFault_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Status }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/eo/Status_V1.0", name = "Status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

}
