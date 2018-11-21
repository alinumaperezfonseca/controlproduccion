package co.gov.anm.facade;

import co.gov.anm.model.DashBoardEstadoReq;
import co.gov.anm.model.ListaSelectBean;
import co.gov.anm.proxy.ReportesAppSvcBindingSOAP11QSPortClient;
import co.gov.anm.proxy.ReportesAppSvcBindingSOAP11QSService;
import co.gov.anm.proxy.ReportesConsultarEstadoRequerimientoAppSvcPort;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.ClientApp;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRq;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRs;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.NetworkTrnData;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1.ConsultarEstadoRequerimientoRqType;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1.ConsultarEstadoRequerimientoRsType;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1.Estado;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1.Estados;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarestadorequerimiento_v1.TituloIn;

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

public class EstadoRequerimientoFacade implements Serializable {
    @SuppressWarnings("compatibility:-7331579967548423766")
    private static final long serialVersionUID = 1L;
    private static ReportesAppSvcBindingSOAP11QSService EstadoRequerimiento;
    private static ReportesAppSvcBindingSOAP11QSPortClient EstadoRequerimientoPortClient;
    private static ReportesConsultarEstadoRequerimientoAppSvcPort EstadoRequerimientoPorType;
    private Object it;
    public EstadoRequerimientoFacade() {
        super();
    }
    private static ReportesAppSvcBindingSOAP11QSService getConsultarListaValoresSoapService() {
        if (EstadoRequerimientoFacade.EstadoRequerimiento == null) {
            EstadoRequerimiento = new ReportesAppSvcBindingSOAP11QSService();
        }
        return EstadoRequerimiento;
    }

    private static ReportesConsultarEstadoRequerimientoAppSvcPort get() {
        if (EstadoRequerimientoFacade.EstadoRequerimientoPorType == null) {
            EstadoRequerimientoFacade.EstadoRequerimientoPorType =
                EstadoRequerimientoFacade.getConsultarListaValoresSoapService().getReportesAppSvcBindingSOAP11QSPort();
            ((BindingProvider) EstadoRequerimientoFacade.EstadoRequerimientoPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/ListaValoresRS/ConsultarListaValores?WSDL");
        }
        return EstadoRequerimientoPorType;
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
    
    public static ResponseWS consultarEstadoRequerimientos(String IdTitulo, List<DashBoardEstadoReq> estadosRequerimientos) {
        ResponseWS responseWS = new ResponseWS();
        responseWS.setSuccess(true);
        try {

            MsgHdrRq msgHdrRq = new MsgHdrRq();
            MsgHdrRs msgHdrRs = new MsgHdrRs();
            ConsultarEstadoRequerimientoRqType consultarEstadoRequerimientoRq = new ConsultarEstadoRequerimientoRqType();
            ConsultarEstadoRequerimientoRsType consultarEstadoRequerimientoRs = new ConsultarEstadoRequerimientoRsType();

            msgHdrRq = EstadoRequerimientoFacade.getHeaderRequest();
            TituloIn tituloIn = new TituloIn();
            tituloIn.setIdTitulo(IdTitulo);
            consultarEstadoRequerimientoRq.setTituloIn(tituloIn);
            
            consultarEstadoRequerimientoRs =
                EstadoRequerimientoFacade.get().consultarEstadoRequerimiento(consultarEstadoRequerimientoRq, msgHdrRq, msgHdrRs);
            estadosRequerimientos.clear();
            Iterator<Estado> it = consultarEstadoRequerimientoRs.getEstados().getEstado().listIterator();
            while (it.hasNext()) {
                Estado item = it.next();
                DashBoardEstadoReq estadoRequerimiento;
                estadoRequerimiento = new DashBoardEstadoReq();
                estadoRequerimiento.setCantidad(item.getCantidad());
                estadoRequerimiento.setEstado(item.getEstado());
                estadosRequerimientos.add(estadoRequerimiento);
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
