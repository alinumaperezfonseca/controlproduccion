package co.gov.anm.facade;

import co.gov.anm.model.DashBoardComparaBean;
import co.gov.anm.model.ListaSelectBean;
import co.gov.anm.proxy.AlertasAppSvcBindingSOAP11QSPortClient;
import co.gov.anm.proxy.AlertasAppSvcBindingSOAP11QSService;
import co.gov.anm.proxy.AlertasAppSvcPort;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.ClientApp;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRq;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRs;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.NetworkTrnData;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1.ConsultarProyectoRqType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1.ConsultarProyectoRsType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1.Proyectos;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1.Proyecto;

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
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;

public class ConsultarProyectoFacade  implements Serializable {
    @SuppressWarnings("compatibility:-3252768149961635493")
    private static final long serialVersionUID = 1L;
    private static AlertasAppSvcBindingSOAP11QSService ConsultarProyecto;
    private static AlertasAppSvcBindingSOAP11QSPortClient ConsultarProyectoPortClient;
    private static AlertasAppSvcPort ConsultarProyectoPorType;
    private Object it;
    public ConsultarProyectoFacade() {
        super();
    }
    private static AlertasAppSvcBindingSOAP11QSService getConsultarProyectoSoapService() {
        if (ConsultarProyectoFacade.ConsultarProyecto == null) {
            ConsultarProyecto = new AlertasAppSvcBindingSOAP11QSService();
        }
        return ConsultarProyecto;
    }

    private static AlertasAppSvcPort get() {
        if (ConsultarProyectoFacade.ConsultarProyectoPorType == null) {
            ConsultarProyectoFacade.ConsultarProyectoPorType =
                ConsultarProyectoFacade.getConsultarProyectoSoapService().getAlertasAppSvcBindingSOAP11QSPort();
            ((BindingProvider) ConsultarProyectoFacade.ConsultarProyectoPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/AlertasRS/ConsultarProyecto?WSDL");
        }
        return ConsultarProyectoPorType;
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

    public static ResponseWS consultarProyectos( List<ListaSelectBean> listaProyectos) {
        ResponseWS responseWS = new ResponseWS();
        responseWS.setSuccess(true);
        try {
            MsgHdrRq msgHdrRq = new MsgHdrRq();
            MsgHdrRs msgHdrRs = new MsgHdrRs();
            ConsultarProyectoRqType consultarProyectoRq = new ConsultarProyectoRqType();
            ConsultarProyectoRsType consultarProyectoRs = new ConsultarProyectoRsType();

            msgHdrRq = ConsultarProyectoFacade.getHeaderRequest();
            
            consultarProyectoRs =
                ConsultarProyectoFacade.get().consultarProyecto(consultarProyectoRq, msgHdrRq, msgHdrRs);
            listaProyectos.clear();
            Iterator<Proyecto> it = consultarProyectoRs.getProyectos().getProyecto().listIterator();
            while (it.hasNext()) {
                Proyecto item = it.next();
                ListaSelectBean listaProyecto;
                listaProyecto = new ListaSelectBean();
                listaProyecto.setCodigo(item.getIdProyecto());
                listaProyecto.setDescripcion(item.getNombreProyecto());
                listaProyectos.add(listaProyecto);
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
