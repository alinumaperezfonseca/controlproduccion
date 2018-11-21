package co.gov.anm.Facade;

import co.gov.anm.model.ListaSelectBean;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.ConsultarListaValoresRqType;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.ConsultarListaValoresRsType;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.ListaIn;
import co.gov.anm.xmlns.appopt.listavaloresappsvc.consultarlistavalores_v1.TiposAlerta;
import co.gov.anm.xmlns.appsvc.consultarlistavalores_v1.ListaValoresAppSvcBindingSOAP11QSService;

import co.gov.anm.xmlns.appsvc.consultarlistavalores_v1.ListaValoresAppSvcPort;

import com.soaint.extend.base.Base;
import com.soaint.util.service.ResponseWS;

import java.util.List;

import javax.xml.ws.BindingProvider;

public class FacadeConsultarListaValores {
    
    private static ListaValoresAppSvcBindingSOAP11QSService ConsultarListaValores;
    private static FacadeConsultarListaValores ProxyService;
    private static ListaValoresAppSvcPort ConsultarListaValoresPorType;
    
    
    public FacadeConsultarListaValores() {
        
        super();
    }
    
    private static ListaValoresAppSvcBindingSOAP11QSService getConsultarProyectoSoapService() {
        if (FacadeConsultarListaValores.ConsultarListaValores == null) {
            ConsultarListaValores = new ListaValoresAppSvcBindingSOAP11QSService();
        }
        return ConsultarListaValores;
    }
    
    public static FacadeConsultarListaValores getService() {
        if (ProxyService == null) {
            ProxyService = new FacadeConsultarListaValores();
        }
        return ProxyService;
    }
    
    private static ListaValoresAppSvcPort get() {
        try {
            
       
        if (FacadeConsultarListaValores.ConsultarListaValoresPorType == null) {
            FacadeConsultarListaValores.ConsultarListaValoresPorType =
                FacadeConsultarListaValores.getConsultarProyectoSoapService().getListaValoresAppSvcBindingSOAP11QSPort();
            ((BindingProvider) FacadeConsultarListaValores.ConsultarListaValoresPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/ListaValoresRS/ConsultarListaValores?wsdl");
        }
        
        } catch (Exception e) {
             // TODO: Add catch code
             e.printStackTrace();
         }
        return ConsultarListaValoresPorType;
    }
    
    public ResponseWS consultarListaValores(String idDominio,List<ListaSelectBean> listaValores) {
        
        ResponseWS response = new ResponseWS();
        response.setSuccess(Boolean.TRUE);
        try {
            ConsultarListaValoresRqType consultarListaValoresRqType = new ConsultarListaValoresRqType();
            
            ListaIn listaIn = new ListaIn();
            listaIn.setIdDominio(idDominio);
            
            consultarListaValoresRqType.setListaIn(listaIn);
            
            ConsultarListaValoresRsType salida = FacadeConsultarListaValores.get().consultarListaValores(consultarListaValoresRqType);
            List<TiposAlerta> lista = salida.getLista().getTiposAlerta();

            for (TiposAlerta item1 : lista) {
                ListaSelectBean item;
                item = new ListaSelectBean();
                item.setCodigo(item1.getIdCodigo());
                item.setDescripcion(item1.getDescripcion());
                listaValores.add(item);
            }


        } catch (Exception e) {
            e.printStackTrace();
            response.setSuccess(false);


        }
        return response;
    }
    
    
}
