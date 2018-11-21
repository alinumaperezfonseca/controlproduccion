package co.gov.anm.facade;

import co.gov.anm.model.ListaSelectBean;
import co.gov.anm.proxy.ListaValoresAppSvcBindingSOAP11QSPortClient;
import co.gov.anm.proxy.ListaValoresAppSvcBindingSOAP11QSService;
import co.gov.anm.proxy.ListaValoresAppSvcPort;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.ClientApp;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRq;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.MsgHdrRs;
import co.gov.anm.xmlns.appopt.aoptcommon_v1.NetworkTrnData;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.ConsultarListaValoresRqType;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.ConsultarListaValoresRsType;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.ListaIn;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.TiposAlerta;

import com.soaint.extend.base.Base;
import com.soaint.util.DateUtil;
import com.soaint.util.service.ResponseWS;

import java.io.Serializable;

import java.math.BigInteger;

import java.text.ParseException;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;


public class ConsultarListaValoresFacade implements Serializable {
    @SuppressWarnings("compatibility:-3115501130499790912")
    private static final long serialVersionUID = 1L;
    private static ListaValoresAppSvcBindingSOAP11QSService ConsultarListaValores;
    private static ListaValoresAppSvcBindingSOAP11QSPortClient ConsultarListaValoresPortClient;
    private static ListaValoresAppSvcPort ConsultarListaValoresPorType;
    private Object it;
    public ConsultarListaValoresFacade() {
        super();
    }
    
    
    private static ListaValoresAppSvcBindingSOAP11QSService getConsultarListaValoresSoapService() {
        if (ConsultarListaValoresFacade.ConsultarListaValores == null) {
            ConsultarListaValores = new ListaValoresAppSvcBindingSOAP11QSService();
        }
        return ConsultarListaValores;
    }

    private static ListaValoresAppSvcPort get() {
        if (ConsultarListaValoresFacade.ConsultarListaValoresPorType == null) {
            ConsultarListaValoresFacade.ConsultarListaValoresPorType =
                ConsultarListaValoresFacade.getConsultarListaValoresSoapService().getListaValoresAppSvcBindingSOAP11QSPort();
            ((BindingProvider) ConsultarListaValoresFacade.ConsultarListaValoresPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/ListaValoresRS/ConsultarListaValores?WSDL");
        }
        return ConsultarListaValoresPorType;
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
            /*             networkTrnData.setHostName(IpUtil.getClientIpAddress());
            networkTrnData.setIpAddress(IpUtil.getClientIpAddress());
            networkTrnData.setMacAddress(IpUtil.getClientIpAddress()); */
            networkTrnData.setHostName("");
            networkTrnData.setIpAddress("");
            networkTrnData.setMacAddress("");
            rq.setNetworkTrnData(networkTrnData);
        } catch (ParseException e) {
            rq.setClientDt(null);
        } catch (DatatypeConfigurationException e) {
            rq.setClientDt(null);
        }
        return rq;
    }

    public static ResponseWS consultarListaValores(String idDominio, List<ListaSelectBean> listaSelects) {
        ResponseWS responseWS = new ResponseWS();
        responseWS.setSuccess(true);
        try {
            System.out.println(">>> Paso");
            MsgHdrRq msgHdrRq = new MsgHdrRq();
            MsgHdrRs msgHdrRs = new MsgHdrRs();
            ConsultarListaValoresRqType consultarListaValoresRq = new ConsultarListaValoresRqType();
            ConsultarListaValoresRsType consultarListaValoresRs = new ConsultarListaValoresRsType();

            msgHdrRq = ConsultarListaValoresFacade.getHeaderRequest();
            ListaIn listaIn = new ListaIn();
            listaIn.setIdDominio(idDominio);
            consultarListaValoresRq.setListaIn(listaIn);
            
            consultarListaValoresRs =
                ConsultarListaValoresFacade.get().consultarListaValores(consultarListaValoresRq, msgHdrRq, msgHdrRs);
            listaSelects.clear();
            Iterator<TiposAlerta> it = consultarListaValoresRs.getLista().getTiposAlerta().listIterator();
            while (it.hasNext()) {
                TiposAlerta item = it.next();
                ListaSelectBean listaSelect;
                listaSelect = new ListaSelectBean();
                listaSelect.setCodigo(item.getIdCodigo());
                listaSelect.setDescripcion(item.getDescripcion());
                listaSelects.add(listaSelect);
            }


        /*         } catch (ClientTransportException e) {
            responseWS.setSuccess(false);

            Base.logError("ResultadosComparaciones", "PreSolicitudServiceFacade.listarPresolicitud", e);
            e.printStackTrace();
        } catch (javax.xml.ws.soap.SOAPFaultException e) {
            responseWS.setSuccess(false);
            Base.logError("ResultadosComparaciones", "PreSolicitudServiceFacade.listarPresolicitud", e);
            e.printStackTrace(); */
        } catch (Exception e) {
            responseWS.setSuccess(false);
            Base.logError("ResultadosComparaciones", "PreSolicitudServiceFacade.listarPresolicitud", e);
            e.printStackTrace();
        }
        return responseWS;
    }

}
