package co.gov.anm.facade;

import co.gov.anm.model.ListaSelectBean;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1.ConsultarTitulosRqType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1.ConsultarTitulosRsType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1.Proyecto;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultartitulos_v1.Titulo;
import co.gov.anm.xmlns.appsvc.consultartitulos_v1.AlertasAppSvcBindingSOAP11QSService;
import co.gov.anm.xmlns.appsvc.consultartitulos_v1.AlertasConsultarTitulosAppSvcPort;

import com.soaint.extend.base.Base;

import com.soaint.util.service.ResponseWS;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;

public class FacadeConsultarTitulos {
    
    private static AlertasAppSvcBindingSOAP11QSService ConsultarTitulos;
    private static FacadeConsultarTitulos ProxyService;
    private static AlertasConsultarTitulosAppSvcPort ConsultarProyectoPorType;
    
    public FacadeConsultarTitulos() {
        super();
    }
    
    
    private static AlertasAppSvcBindingSOAP11QSService getConsultarProyectoSoapService() {
        if (FacadeConsultarTitulos.ConsultarTitulos == null) {
            ConsultarTitulos = new AlertasAppSvcBindingSOAP11QSService();
        }
        return ConsultarTitulos;
    }
    
    public static FacadeConsultarTitulos getService() {
        if (ProxyService == null) {
            ProxyService = new FacadeConsultarTitulos();
        }
        return ProxyService;
    }
    
    private static AlertasConsultarTitulosAppSvcPort get() {
        try {
            
       
        if (FacadeConsultarTitulos.ConsultarProyectoPorType == null) {
            FacadeConsultarTitulos.ConsultarProyectoPorType =
                FacadeConsultarTitulos.getConsultarProyectoSoapService().getAlertasAppSvcBindingSOAP11QSPort();
            ((BindingProvider) FacadeConsultarTitulos.ConsultarProyectoPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/AlertasRS2/ConsultarTitulos?wsdl");
        }
        
        } catch (Exception e) {
             // TODO: Add catch code
             e.printStackTrace();
         }
        return ConsultarProyectoPorType;
    }
    
    public ResponseWS consultarTitulos(String idProyecto,List<ListaSelectBean> listaTitulos) {
        
        ResponseWS response = new ResponseWS();
        response.setSuccess(Boolean.TRUE);
        try {
            ConsultarTitulosRqType consultarProyectoRqType = new ConsultarTitulosRqType();
            
            Proyecto proyect = new Proyecto();
            proyect.setIdProyecto(idProyecto);
            
            consultarProyectoRqType.setProyecto(proyect);
            
            ConsultarTitulosRsType salida = FacadeConsultarTitulos.get().consultarTitulos(consultarProyectoRqType);
            List<Titulo> lista = salida.getTitulos().getTitulo();

            for (Titulo item1 : lista) {
                ListaSelectBean item;
                item = new ListaSelectBean();
                item.setCodigo(item1.getIdTitulos());
                item.setDescripcion(item1.getNombreTitulo());
                listaTitulos.add(item);
            }


        } catch (Exception e) {
            e.printStackTrace();


        }
        return response;
    }
    
}
