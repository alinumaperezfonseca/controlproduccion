
package co.gov.anm.proxy;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * OSB Service
 *
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "ReportesAppSvcBindingSOAP11QSService",
                  targetNamespace = "http://xmlns.anm.gov.co/AppSvc/ResultadosComparaciones_V1.0",
                  wsdlLocation =
                  "http://192.168.1.24:8011/ReportesRS1/ResultadosComparaciones?WSDL#%7Bhttp%3A%2F%2Fxmlns.anm.gov.co%2FAppSvc%2FResultadosComparaciones_V1.0%7DReportesAppSvcBindingSOAP11QSService")
public class ReportesAppSvcBindingSOAP11QSService extends Service {

    private final static URL REPORTESAPPSVCBINDINGSOAP11QSSERVICE_WSDL_LOCATION;
    private final static WebServiceException REPORTESAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION;
    private final static QName REPORTESAPPSVCBINDINGSOAP11QSSERVICE_QNAME =
        new QName("http://xmlns.anm.gov.co/AppSvc/ResultadosComparaciones_V1.0",
                  "ReportesAppSvcBindingSOAP11QSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.1.24:8011/ReportesRS1/ResultadosComparaciones?WSDL#%7Bhttp%3A%2F%2Fxmlns.anm.gov.co%2FAppSvc%2FResultadosComparaciones_V1.0%7DReportesAppSvcBindingSOAP11QSService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPORTESAPPSVCBINDINGSOAP11QSSERVICE_WSDL_LOCATION = url;
        REPORTESAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION = e;
    }

    public ReportesAppSvcBindingSOAP11QSService() {
        super(__getWsdlLocation(), REPORTESAPPSVCBINDINGSOAP11QSSERVICE_QNAME);
    }

    public ReportesAppSvcBindingSOAP11QSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REPORTESAPPSVCBINDINGSOAP11QSSERVICE_QNAME, features);
    }

    public ReportesAppSvcBindingSOAP11QSService(URL wsdlLocation) {
        super(wsdlLocation, REPORTESAPPSVCBINDINGSOAP11QSSERVICE_QNAME);
    }

    public ReportesAppSvcBindingSOAP11QSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REPORTESAPPSVCBINDINGSOAP11QSSERVICE_QNAME, features);
    }

    public ReportesAppSvcBindingSOAP11QSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportesAppSvcBindingSOAP11QSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ReportesResultadosComparacionesAppSvcPort
     */
    @WebEndpoint(name = "ReportesAppSvcBindingSOAP11QSPort")
    public ReportesResultadosComparacionesAppSvcPort getReportesAppSvcBindingSOAP11QSPort() {
        return super.getPort(new QName("http://xmlns.anm.gov.co/AppSvc/ResultadosComparaciones_V1.0",
                                       "ReportesAppSvcBindingSOAP11QSPort"),
                             ReportesResultadosComparacionesAppSvcPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportesResultadosComparacionesAppSvcPort
     */
    @WebEndpoint(name = "ReportesAppSvcBindingSOAP11QSPort")
    public ReportesResultadosComparacionesAppSvcPort getReportesAppSvcBindingSOAP11QSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.anm.gov.co/AppSvc/ResultadosComparaciones_V1.0",
                                       "ReportesAppSvcBindingSOAP11QSPort"),
                             ReportesResultadosComparacionesAppSvcPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPORTESAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION != null) {
            throw REPORTESAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION;
        }
        return REPORTESAPPSVCBINDINGSOAP11QSSERVICE_WSDL_LOCATION;
    }

}
