
package co.gov.anm.xmlns.appopt.aoptcommon_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.gov.anm.xmlns.appopt.aoptcommon_v1 package.
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

    private final static QName _MsgHdrRq_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0", "MsgHdrRq");
    private final static QName _MsgHdrRs_QNAME =
        new QName("http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0", "MsgHdrRs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.anm.xmlns.appopt.aoptcommon_v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MsgHdrRq }
     *
     */
    public MsgHdrRq createMsgHdrRq() {
        return new MsgHdrRq();
    }

    /**
     * Create an instance of {@link MsgHdrRs }
     *
     */
    public MsgHdrRs createMsgHdrRs() {
        return new MsgHdrRs();
    }

    /**
     * Create an instance of {@link CommonTypeMandatory }
     *
     */
    public CommonTypeMandatory createCommonTypeMandatory() {
        return new CommonTypeMandatory();
    }

    /**
     * Create an instance of {@link RecCtrlOut }
     *
     */
    public RecCtrlOut createRecCtrlOut() {
        return new RecCtrlOut();
    }

    /**
     * Create an instance of {@link ClientApp }
     *
     */
    public ClientApp createClientApp() {
        return new ClientApp();
    }

    /**
     * Create an instance of {@link ValueType }
     *
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link NetworkTrnData }
     *
     */
    public NetworkTrnData createNetworkTrnData() {
        return new NetworkTrnData();
    }

    /**
     * Create an instance of {@link CountryCode }
     *
     */
    public CountryCode createCountryCode() {
        return new CountryCode();
    }

    /**
     * Create an instance of {@link Status }
     *
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link RecCtrlIn }
     *
     */
    public RecCtrlIn createRecCtrlIn() {
        return new RecCtrlIn();
    }

    /**
     * Create an instance of {@link SessionInfo }
     *
     */
    public SessionInfo createSessionInfo() {
        return new SessionInfo();
    }

    /**
     * Create an instance of {@link CustomDate }
     *
     */
    public CustomDate createCustomDate() {
        return new CustomDate();
    }

    /**
     * Create an instance of {@link Binary }
     *
     */
    public Binary createBinary() {
        return new Binary();
    }

    /**
     * Create an instance of {@link FieldRestriction }
     *
     */
    public FieldRestriction createFieldRestriction() {
        return new FieldRestriction();
    }

    /**
     * Create an instance of {@link CommonType }
     *
     */
    public CommonType createCommonType() {
        return new CommonType();
    }

    /**
     * Create an instance of {@link Duration }
     *
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link TimeFrame }
     *
     */
    public TimeFrame createTimeFrame() {
        return new TimeFrame();
    }

    /**
     * Create an instance of {@link SocialMedia }
     *
     */
    public SocialMedia createSocialMedia() {
        return new SocialMedia();
    }

    /**
     * Create an instance of {@link Contact }
     *
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Country }
     *
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Locator }
     *
     */
    public Locator createLocator() {
        return new Locator();
    }

    /**
     * Create an instance of {@link Phone }
     *
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link PostAddr }
     *
     */
    public PostAddr createPostAddr() {
        return new PostAddr();
    }

    /**
     * Create an instance of {@link ValueTypeMandatory }
     *
     */
    public ValueTypeMandatory createValueTypeMandatory() {
        return new ValueTypeMandatory();
    }

    /**
     * Create an instance of {@link CurAmtMandatory }
     *
     */
    public CurAmtMandatory createCurAmtMandatory() {
        return new CurAmtMandatory();
    }

    /**
     * Create an instance of {@link Field }
     *
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Freq }
     *
     */
    public Freq createFreq() {
        return new Freq();
    }

    /**
     * Create an instance of {@link CurAmt }
     *
     */
    public CurAmt createCurAmt() {
        return new CurAmt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgHdrRq }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgHdrRq }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0", name = "MsgHdrRq")
    public JAXBElement<MsgHdrRq> createMsgHdrRq(MsgHdrRq value) {
        return new JAXBElement<MsgHdrRq>(_MsgHdrRq_QNAME, MsgHdrRq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgHdrRs }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgHdrRs }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.anm.gov.co/appopt/AOptCommon_V1.0", name = "MsgHdrRs")
    public JAXBElement<MsgHdrRs> createMsgHdrRs(MsgHdrRs value) {
        return new JAXBElement<MsgHdrRs>(_MsgHdrRs_QNAME, MsgHdrRs.class, null, value);
    }

}
