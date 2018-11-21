package co.gov.anm.view;

import co.gov.anm.facade.ConsultarListaValoresFacade;
import co.gov.anm.facade.ConsultarProyectoFacade;
import co.gov.anm.facade.ConsultarTitulosFacade;
import co.gov.anm.model.FragConsultaBean;
import co.gov.anm.model.ListaSelectBean;

import com.soaint.util.JSFUtil;
import com.soaint.util.service.ResponseWS;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class MbFragConsulta implements Serializable {
    @SuppressWarnings("compatibility")
    private static final long serialVersionUID = 1L;

    private FragConsultaBean fragConsultaBean;
    private List<ListaSelectBean> listProyectos;
    private List<ListaSelectBean> listTitulos;
    private List<ListaSelectBean> listPeriodos;

    public MbFragConsulta() {
        super();
        this.fragConsultaBean = (FragConsultaBean) JSFUtil.resolveExpression("#{pageFlowScope.fragConsulta}");
        this.listProyectos = new ArrayList<ListaSelectBean>();
        this.listTitulos = new ArrayList<ListaSelectBean>();
        this.listPeriodos = new ArrayList<ListaSelectBean>();
        CargarListaProyectos();
        CargarListatitulos(this.fragConsultaBean.getIdProyecto());
        CargarListaPeriodos();
    }

    public void CargarListaProyectos() {
        ResponseWS responseWS = ConsultarProyectoFacade.consultarProyectos(this.listProyectos);
    }

    public void CargarListatitulos(String idProyectoBuscar) {
        ResponseWS responseWS = ConsultarTitulosFacade.consultarTitulos(idProyectoBuscar, this.listTitulos);
    }

    public void CargarListaPeriodos() {
        ResponseWS responseWS = ConsultarListaValoresFacade.consultarListaValores("6", this.listPeriodos);
    }

    public void setFragConsultaBean(FragConsultaBean fragConsultaBean) {
        this.fragConsultaBean = fragConsultaBean;
    }

    public FragConsultaBean getFragConsultaBean() {
        return fragConsultaBean;
    }

    public void setListProyectos(List<ListaSelectBean> listProyectos) {
        this.listProyectos = listProyectos;
    }

    public List<ListaSelectBean> getListProyectos() {
        return listProyectos;
    }

    public void setListTitulos(List<ListaSelectBean> listTitulos) {
        this.listTitulos = listTitulos;
    }

    public List<ListaSelectBean> getListTitulos() {
        return listTitulos;
    }

    public void setListPeriodos(List<ListaSelectBean> listPeriodos) {
        this.listPeriodos = listPeriodos;
    }

    public List<ListaSelectBean> getListPeriodos() {
        return listPeriodos;
    }
}
