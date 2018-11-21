
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
@WebServiceClient(name = "AlertasAppSvcBindingSOAP11QSService",
                  targetNamespace = "http://xmlns.anm.gov.co/AppSvc/ConsultarTitulo_V1.0",
                  wsdlLocation =
                  "http://192.168.1.24:8011/AlertasRS1/ConsultarTitulo?WSDL#%7Bhttp%3A%2F%2Fxmlns.anm.gov.co%2FAppSvc%2FConsultarTitulo_V1.0%7DAlertasAppSvcBindingSOAP11QSService")
public class AlertasAppSvcBindingSOAP11QSService extends Service {

    private final static URL ALERTASAPPSVCBINDINGSOAP11QSSERVICE_WSDL_LOCATION;
    private final static WebServiceException ALERTASAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION;
    private final static QName ALERTASAPPSVCBINDINGSOAP11QSSERVICE_QNAME =
        new QName("http://xmlns.anm.gov.co/AppSvc/ConsultarTitulo_V1.0", "AlertasAppSvcBindingSOAP11QSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url =
                new URL("http://192.168.1.24:8011/AlertasRS1/ConsultarTitulo?WSDL#%7Bhttp%3A%2F%2Fxmlns.anm.gov.co%2FAppSvc%2FConsultarTitulo_V1.0%7DAlertasAppSvcBindingSOAP11QSService");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALERTASAPPSVCBINDINGSOAP11QSSERVICE_WSDL_LOCATION = url;
        ALERTASAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION = e;
    }

    public AlertasAppSvcBindingSOAP11QSService() {
        super(__getWsdlLocation(), ALERTASAPPSVCBINDINGSOAP11QSSERVICE_QNAME);
    }

    public AlertasAppSvcBindingSOAP11QSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ALERTASAPPSVCBINDINGSOAP11QSSERVICE_QNAME, features);
    }

    public AlertasAppSvcBindingSOAP11QSService(URL wsdlLocation) {
        super(wsdlLocation, ALERTASAPPSVCBINDINGSOAP11QSSERVICE_QNAME);
    }

    public AlertasAppSvcBindingSOAP11QSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ALERTASAPPSVCBINDINGSOAP11QSSERVICE_QNAME, features);
    }

    public AlertasAppSvcBindingSOAP11QSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlertasAppSvcBindingSOAP11QSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AlertasConsultarTituloAppSvcPort
     */
    @WebEndpoint(name = "AlertasAppSvcBindingSOAP11QSPort")
    public AlertasConsultarTituloAppSvcPort getAlertasAppSvcBindingSOAP11QSPort() {
        return super.getPort(new QName("http://xmlns.anm.gov.co/AppSvc/ConsultarTitulo_V1.0",
                                       "AlertasAppSvcBindingSOAP11QSPort"), AlertasConsultarTituloAppSvcPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlertasConsultarTituloAppSvcPort
     */
    @WebEndpoint(name = "AlertasAppSvcBindingSOAP11QSPort")
    public AlertasConsultarTituloAppSvcPort getAlertasAppSvcBindingSOAP11QSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.anm.gov.co/AppSvc/ConsultarTitulo_V1.0",
                                       "AlertasAppSvcBindingSOAP11QSPort"), AlertasConsultarTituloAppSvcPort.class,
                             features);
    }

    private static URL __getWsdlLocation() {
        if (ALERTASAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION != null) {
            throw ALERTASAPPSVCBINDINGSOAP11QSSERVICE_EXCEPTION;
        }
        return ALERTASAPPSVCBINDINGSOAP11QSSERVICE_WSDL_LOCATION;
    }

}