package co.gov.anm.facade;

import co.gov.anm.model.DashBoardComparaBean;
import co.gov.anm.proxy.ReportesAppSvcBindingSOAP11QSPortClient;
import co.gov.anm.proxy.ReportesAppSvcBindingSOAP11QSService;
import co.gov.anm.proxy.ReportesResultadosComparacionesAppSvcPort;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.ClientApp;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRq;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRs;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.NetworkTrnData;
import co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1.ResultadosComparacionesRqType;
import co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1.ResultadosComparacionesRsType;
import co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1.Titulo;
import co.gov.anm.xmlns.appopt.reportesappsvc.resultadoscomparaciones_v1.TituloIn;

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

public class Comparacionesfacade implements Serializable {
    @SuppressWarnings("compatibility:-4605479509196820812")
    private static final long serialVersionUID = 1L;
    private static ReportesAppSvcBindingSOAP11QSService Comparaciones;
    private static ReportesAppSvcBindingSOAP11QSPortClient ComparacionesPortClient;
    private static ReportesResultadosComparacionesAppSvcPort ComparacionesPorType;
    private Object it;

    public Comparacionesfacade() {
        super();
    }

    private static ReportesAppSvcBindingSOAP11QSService getPComparacionesSoapService() {
        if (Comparacionesfacade.Comparaciones == null) {
            Comparaciones = new ReportesAppSvcBindingSOAP11QSService();
        }
        return Comparaciones;
    }

    private static ReportesResultadosComparacionesAppSvcPort get() {
        if (Comparacionesfacade.ComparacionesPorType == null) {
            Comparacionesfacade.ComparacionesPorType =
                Comparacionesfacade.getPComparacionesSoapService().getReportesAppSvcBindingSOAP11QSPort();
            ((BindingProvider) Comparacionesfacade.ComparacionesPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/ReportesRS1/ResultadosComparaciones?WSDL");
        }
        return ComparacionesPorType;
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

    public static ResponseWS consultaComparaciones(String idTitulo, List<DashBoardComparaBean> dashBoardComparas) {
        ResponseWS responseWS = new ResponseWS();
        responseWS.setSuccess(true);
        try {

            MsgHdrRq msgHdrRq = new MsgHdrRq();
            MsgHdrRs msgHdrRs = new MsgHdrRs();
            ResultadosComparacionesRqType resultadosComparacionesRq = new ResultadosComparacionesRqType();
            ResultadosComparacionesRsType resultadosComparacionesRs = new ResultadosComparacionesRsType();

            msgHdrRq = Comparacionesfacade.getHeaderRequest();
            TituloIn tituloIn = new TituloIn();
            tituloIn.setIdTitulo(idTitulo);
            resultadosComparacionesRq.setTituloIn(tituloIn);
            resultadosComparacionesRs =
                Comparacionesfacade.get().resultadosComparaciones(resultadosComparacionesRq, msgHdrRq, msgHdrRs);
            dashBoardComparas.clear();
            Iterator<Titulo> it = resultadosComparacionesRs.getTitulos()
                                                           .getTitulo()
                                                           .iterator();
            while (it.hasNext()) {
                Titulo item = it.next();
                DashBoardComparaBean dashBoardCompara;
                dashBoardCompara = new DashBoardComparaBean();
                dashBoardCompara.setTitular(item.getNombreTitular());
                dashBoardCompara.setTitulo(item.getNombreTitulo());
                dashBoardCompara.setComparacion(item.getNombreComparacion());
                dashBoardCompara.setCantidad(item.getValor());
                dashBoardCompara.setFecha(DateUtil.converFormatSOAtoDateGarantia(item.getFechaCarga()));
                dashBoardComparas.add(dashBoardCompara);

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
