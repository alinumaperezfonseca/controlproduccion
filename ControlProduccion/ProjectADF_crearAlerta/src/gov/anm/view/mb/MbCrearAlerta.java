package gov.anm.view.mb;

import co.gov.anm.facade.ConsultarListaValoresFacade;
import co.gov.anm.facade.ConsultarProyectoFacade;
import co.gov.anm.model.FragConsultaBean;
import co.gov.anm.model.ListaSelectBean;

import co.gov.anm.model.TituloContratoBean;

import java.util.ArrayList;
import java.util.List;


public class MbCrearAlerta {
    
    
    private FragConsultaBean fragConsultaBean;
    private TituloContratoBean fragTituloContratoBean;
    private String idAlertaSeleccionada;
    private String idSeveridadSeleccionada;
    private List<ListaSelectBean> listaAlertas;
    private List<ListaSelectBean> listaSeveridad;
    private String concepto;
    
    public MbCrearAlerta() {
        super();
        this.fragConsultaBean = new FragConsultaBean();
        this.fragTituloContratoBean = new TituloContratoBean();
        this.listaAlertas = new ArrayList<ListaSelectBean>();
        this.listaSeveridad = new ArrayList<ListaSelectBean>();
        consultarAlerta();
        consultarSeveridad();
        
    }
    
    public static void main(String args[]){
        
        List<ListaSelectBean> listaSelects = new ArrayList<ListaSelectBean>();
        
        //ConsultarListaValoresFacade.consultarListaValores("1", listaSelects);
        
        ConsultarProyectoFacade.consultarProyectos(listaSelects);
        
        for(ListaSelectBean select : listaSelects){
            System.out.println(" valores = "+select.getDescripcion());
        }
        
    }


    public void setFragConsultaBean(FragConsultaBean fragConsultaBean) {
        this.fragConsultaBean = fragConsultaBean;
    }

    public FragConsultaBean getFragConsultaBean() {
        return fragConsultaBean;
    }

    public void setFragTituloContratoBean(TituloContratoBean fragTituloContratoBean) {
        this.fragTituloContratoBean = fragTituloContratoBean;
    }

    public TituloContratoBean getFragTituloContratoBean() {
        return fragTituloContratoBean;
    }


    public void setIdAlertaSeleccionada(String idAlertaSeleccionada) {
        this.idAlertaSeleccionada = idAlertaSeleccionada;
    }

    public String getIdAlertaSeleccionada() {
        return idAlertaSeleccionada;
    }


    public void setListaAlertas(List<ListaSelectBean> listaAlertas) {
        this.listaAlertas = listaAlertas;
    }

    public List<ListaSelectBean> getListaAlertas() {
        return listaAlertas;
    }

    private void consultarAlerta() {

        this.listaAlertas.add(new ListaSelectBean("1", "Alerta 1"));
        this.listaAlertas.add(new ListaSelectBean("2", "Alerta 2"));
        this.listaAlertas.add(new ListaSelectBean("3", "Alerta 3"));
        this.listaAlertas.add(new ListaSelectBean("4", "Alerta 4"));
        this.listaAlertas.add(new ListaSelectBean("5", "Alerta 5"));
        this.listaAlertas.add(new ListaSelectBean("6", "Alerta 6"));

    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setIdSeveridadSeleccionada(String idSeveridadSeleccionada) {
        this.idSeveridadSeleccionada = idSeveridadSeleccionada;
    }

    public String getIdSeveridadSeleccionada() {
        return idSeveridadSeleccionada;
    }

    public void setListaSeveridad(List<ListaSelectBean> listaSeveridad) {
        this.listaSeveridad = listaSeveridad;
    }

    public List<ListaSelectBean> getListaSeveridad() {
        return listaSeveridad;
    }

    private void consultarSeveridad() {
        
        this.listaSeveridad.add(new ListaSelectBean("1", "Baja"));
        this.listaSeveridad.add(new ListaSelectBean("2", "Media"));
        this.listaSeveridad.add(new ListaSelectBean("3", "Alta"));

    }
}
