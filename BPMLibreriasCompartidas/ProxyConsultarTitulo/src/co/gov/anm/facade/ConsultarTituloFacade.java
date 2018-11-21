package co.gov.anm.facade;

import co.gov.anm.model.TituloContratoBean;
import co.gov.anm.proxy.AlertasAppSvcBindingSOAP11QSPortClient;
import co.gov.anm.proxy.AlertasAppSvcBindingSOAP11QSService;
import co.gov.anm.proxy.AlertasConsultarTituloAppSvcPort;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1.ConsultarTituloRqType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1.ConsultarTituloRsType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1.TituloIn;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.ClientApp;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRq;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRs;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.NetworkTrnData;

import com.soaint.extend.base.Base;
import com.soaint.util.DateUtil;
import com.soaint.util.IpUtil;
import com.soaint.util.service.ResponseWS;

import com.sun.xml.ws.client.ClientTransportException;

import java.io.Serializable;

import java.math.BigInteger;

import java.text.ParseException;

import java.util.Date;
import java.util.Iterator;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;

public class ConsultarTituloFacade implements Serializable {
    @SuppressWarnings("compatibility:-7633627940390529958")
    private static final long serialVersionUID = 1L;
    private static AlertasAppSvcBindingSOAP11QSService ConsultarTituloValores;
    private static AlertasAppSvcBindingSOAP11QSPortClient ConsultarTituloPortClient;
    private static AlertasConsultarTituloAppSvcPort ConsultarTituloPorType;
    private Object it;

    public ConsultarTituloFacade() {
        super();
    }


    private static AlertasAppSvcBindingSOAP11QSService getConsultarListaValoresSoapService() {
        if (ConsultarTituloFacade.ConsultarTituloValores == null) {
            ConsultarTituloValores = new AlertasAppSvcBindingSOAP11QSService();
        }
        return ConsultarTituloValores;
    }

    private static AlertasConsultarTituloAppSvcPort get() {
        if (ConsultarTituloFacade.ConsultarTituloPorType == null) {
            ConsultarTituloFacade.ConsultarTituloPorType =
                ConsultarTituloFacade.getConsultarListaValoresSoapService().getAlertasAppSvcBindingSOAP11QSPort();
            ((BindingProvider) ConsultarTituloFacade.ConsultarTituloPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/AlertasRS1/ConsultarTitulo?WSDL");
        }
        return ConsultarTituloPorType;
    }

    private static MsgHdrRq getHeaderRequest() {
        MsgHdrRq rq = new MsgHdrRq();
        try {
            rq.setClientDt(DateUtil.dateToXMLGregorianCalendar(new Date()));
            rq.setDestination("?");
            rq.setMsgPriority(new BigInteger("0"));
            rq.setRequestId("0");
            rq.setRqdOper("0");
            rq.setRqdOperType("0");
            rq.setRqdService("0");
            ClientApp clientApp = new ClientApp();
            clientApp.setChannelId("0");
            clientApp.setName("0");
            clientApp.setOrg("0");
            clientApp.setUserId("0");
            clientApp.setUserType("0");
            rq.setClientApp(clientApp);
            NetworkTrnData networkTrnData = new NetworkTrnData();
            networkTrnData.setHostName(IpUtil.getClientIpAddress());
            networkTrnData.setIpAddress(IpUtil.getClientIpAddress());
            networkTrnData.setMacAddress(IpUtil.getClientIpAddress());
            rq.setNetworkTrnData(networkTrnData);
        } catch (ParseException e) {
            rq.setClientDt(null);
        } catch (DatatypeConfigurationException e) {
            rq.setClientDt(null);
        }
        return rq;
    }

    public static ResponseWS ConsultarTitulo(String IdTitulo, TituloContratoBean tituloContrato) {
        ResponseWS responseWS = new ResponseWS();
        responseWS.setSuccess(true);
        try {

            MsgHdrRq msgHdrRq = new MsgHdrRq();
            MsgHdrRs msgHdrRs = new MsgHdrRs();
            ConsultarTituloRqType consultarTituloRq = new ConsultarTituloRqType();
            ConsultarTituloRsType consultarTituloRs = new ConsultarTituloRsType();

            msgHdrRq = ConsultarTituloFacade.getHeaderRequest();
            TituloIn tituloIn = new TituloIn();
            tituloIn.setIdTitulo(IdTitulo);
            consultarTituloRq.setTituloIn(tituloIn);

            consultarTituloRs = ConsultarTituloFacade.get().consultarTitulo(consultarTituloRq, msgHdrRq, msgHdrRs);

            Iterator<co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1.Titulo> it = consultarTituloRs.getTitulos()
                                                                                                            .getTitulo()
                                                                                                            .iterator();

            while (it.hasNext()) {
                co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulo_v1.Titulo item = it.next();
                tituloContrato.setIdTitularMinero(item.getIdTitulo());
                tituloContrato.setNombreTitularMinero(item.getNombreTitulo());
                tituloContrato.setIdUbicacion(item.getUbicacion());
                tituloContrato.setTituloMinero(item.getTitular());

            }


        } catch (ClientTransportException e) {
            responseWS.setSuccess(false);
            Base.logError("ResultadosComparaciones", "PreSolicitudServiceFacade.listarPresolicitud", e);
            e.printStackTrace();
        } catch (javax.xml.ws.soap.SOAPFaultException e) {
            responseWS.setSuccess(false);
            Base.logError("ResultadosComparaciones", "PreSolicitudServiceFacade.listarPresolicitud", e);
            e.printStackTrace();
        } catch (Exception e) {
            responseWS.setSuccess(false);
            Base.logError("ResultadosComparaciones", "PreSolicitudServiceFacade.listarPresolicitud", e);
            e.printStackTrace();
        }
        return responseWS;
    }
}
