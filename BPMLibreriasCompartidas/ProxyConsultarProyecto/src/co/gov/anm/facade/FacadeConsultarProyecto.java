package co.gov.anm.Facade;

import co.gov.anm.model.ListaSelectBean;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1.ConsultarProyectoRqType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1.ConsultarProyectoRsType;
import co.gov.anm.xmlns.appopt.alertasappsvc.consultarproyecto_v1.Proyecto;
import co.gov.anm.xmlns.appsvc.consultarproyecto_v1.AlertasAppSvcBindingSOAP11QSService;
import co.gov.anm.xmlns.appsvc.consultarproyecto_v1.AlertasAppSvcPort;


import com.soaint.extend.base.Base;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;

public class FacadeConsultarProyecto {
    
    private static AlertasAppSvcBindingSOAP11QSService ConsultarProyecto;
    private static FacadeConsultarProyecto ProxyService;
    private static AlertasAppSvcPort ConsultarProyectoPorType;

    public FacadeConsultarProyecto() {
        super();

    }

    private static AlertasAppSvcBindingSOAP11QSService getConsultarProyectoSoapService() {
        if (FacadeConsultarProyecto.ConsultarProyecto == null) {
            ConsultarProyecto = new AlertasAppSvcBindingSOAP11QSService();
        }
        return ConsultarProyecto;
    }

    public static FacadeConsultarProyecto getService() {
        if (ProxyService == null) {
            ProxyService = new FacadeConsultarProyecto();
        }
        return ProxyService;
    }
    private static AlertasAppSvcPort get() {
        try {
            
       
        if (FacadeConsultarProyecto.ConsultarProyectoPorType == null) {
            FacadeConsultarProyecto.ConsultarProyectoPorType =
                FacadeConsultarProyecto.getConsultarProyectoSoapService().getAlertasAppSvcBindingSOAP11QSPort();
            ((BindingProvider) FacadeConsultarProyecto.ConsultarProyectoPorType).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                     Base.getLoad().getOSBUrl() + "/AlertasRS/ConsultarProyecto?WSDL");
        }
        
        } catch (Exception e) {
             // TODO: Add catch code
             e.printStackTrace();
         }
        return ConsultarProyectoPorType;
    }
    
    public List<ListaSelectBean> consultarProyecto() {
        List<ListaSelectBean> listaConsulta;
        listaConsulta = new ArrayList<ListaSelectBean>();

        AlertasAppSvcBindingSOAP11QSService alertasAppSvcBindingSOAP11QSService =
            new AlertasAppSvcBindingSOAP11QSService();
        AlertasAppSvcPort alertasAppSvcPort = alertasAppSvcBindingSOAP11QSService.getAlertasAppSvcBindingSOAP11QSPort();


        try {
            ConsultarProyectoRqType consultarProyectoRqType = new ConsultarProyectoRqType();
            ConsultarProyectoRsType salida = FacadeConsultarProyecto.get().consultarProyecto(consultarProyectoRqType);
            List<Proyecto> lstProyectos = salida.getProyectos().getProyecto();

            for (Proyecto item1 : lstProyectos) {
                ListaSelectBean item;
                item = new ListaSelectBean();
                item.setCodigo(item1.getIdProyecto());
                item.setDescripcion(item1.getNombreProyecto());
                listaConsulta.add(item);
            }


        } catch (Exception e) {
            e.printStackTrace();


        }
        return listaConsulta;
    }

    
    
}
