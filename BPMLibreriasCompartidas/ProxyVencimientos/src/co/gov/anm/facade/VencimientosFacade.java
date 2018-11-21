package co.gov.anm.facade;

import co.gov.anm.model.DashBoardVencimiento;
import co.gov.anm.model.ListaSelectBean;
import co.gov.anm.proxy.ReportesAppSvcBindingSOAP11QSPortClient;
import co.gov.anm.proxy.ReportesAppSvcBindingSOAP11QSService;
import co.gov.anm.proxy.ConsultarVencimientoContractualAppSvcPort;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.ClientApp;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRq;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRs;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.NetworkTrnData;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1.ConsultarVencimientoContractualRqType;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1.ConsultarVencimientoContractualRsType;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1.Titulo;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1.TituloIn;
import co.gov.anm.xmlns.appopt.reportesappsvc.consultarvencimientocontractual_v1.Titulos;

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

public class VencimientosFacade implements Serializable {
    @SuppressWarnings("compatibility:5924012322182991946")
    private static final long serialVersionUID = 1L;
    private static ReportesAppSvcBindingSOAP11QSService Vencimientos;
    private static ReportesAppSvcBindingSOAP11QSPortClient VencimientosPortClient;
    private static ConsultarVencimientoContractualAppSvcPort VencimientosPorType;
    private Object it;

    public VencimientosFacade() {
        super();
    }
    
    private static ReportesAppSvcBindingSOAP11QSService getConsultarListaValoresSoapService() {
        if (VencimientosFacade.Vencimientos == null) {
            Vencimientos = new ReportesAppSvcBindingSOAP11QSService();
        }
        return Vencimientos;
    }

    private static ConsultarVencimientoContractualAppSvcPort get() {
        if (VencimientosFacade.VencimientosPorType == null) {
            VencimientosFacade.VencimientosPorType =
                VencimientosFacade.getConsultarListaValoresSoapService().getReportesAppSvcBindingSOAP11QSPort();
            ((BindingProvider) VencimientosFacade.VencimientosPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/ReportesRS/ConsultarVencimientoContractual?WSDL");
        }
        return VencimientosPorType;
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

    public static ResponseWS consultarListaValores(String IdTitulo, List<DashBoardVencimiento> DashBoardVencimientos) {
        ResponseWS responseWS = new ResponseWS();
        responseWS.setSuccess(true);
        try {

            MsgHdrRq msgHdrRq = new MsgHdrRq();
            MsgHdrRs msgHdrRs = new MsgHdrRs();
            ConsultarVencimientoContractualRqType consultarVencimientoContractualRq = new ConsultarVencimientoContractualRqType();
            ConsultarVencimientoContractualRsType consultarVencimientoContractualRs = new ConsultarVencimientoContractualRsType();

            msgHdrRq = VencimientosFacade.getHeaderRequest();
            TituloIn tituloIn = new TituloIn();
            tituloIn.setIdTitulo(IdTitulo);
            consultarVencimientoContractualRq.setTituloIn(tituloIn);
            
            consultarVencimientoContractualRs =
                VencimientosFacade.get().consultarVencimientoContractual(consultarVencimientoContractualRq);
            DashBoardVencimientos.clear();
            Iterator<Titulo> it = consultarVencimientoContractualRs.getTitulos().getTitulo().listIterator();
            while (it.hasNext()) {
                Titulo item = it.next();
                DashBoardVencimiento vencimiento;
                vencimiento = new DashBoardVencimiento();
                vencimiento.setDiasRestantes(item.getDiasRestantes());
                vencimiento.setFechaVencimiento(item.getFechaFinVigencia());
                vencimiento.setTitulo(item.getNombreTitulo());
                DashBoardVencimientos.add(vencimiento);
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
