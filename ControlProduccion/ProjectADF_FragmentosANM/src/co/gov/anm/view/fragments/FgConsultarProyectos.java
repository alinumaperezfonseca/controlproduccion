package co.gov.anm.view.fragments;

import co.gov.anm.facade.ConsultarListaValoresFacade;
import co.gov.anm.facade.ConsultarProyectoFacade;
import co.gov.anm.facade.ConsultarTitulosFacade;
import co.gov.anm.model.FragConsultaBean;
import co.gov.anm.model.ListaSelectBean;

import com.soaint.util.JSFUtil;
import com.soaint.util.JSFUtils;

import com.soaint.util.service.ResponseWS;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class FgConsultarProyectos implements Serializable{
    @SuppressWarnings("compatibility:-5528396254081794205")
    private static final long serialVersionUID = 1L;
    
    private FragConsultaBean fragConsultaBean;
    private List<ListaSelectBean> listProyectos;
    private List<ListaSelectBean> listTitulos;
    private List<ListaSelectBean> listPeriodos;

    public FgConsultarProyectos() {
        super();
        this.fragConsultaBean = (FragConsultaBean) JSFUtil.resolveExpression("#{pageFlowScope.fragConsulta}");
        this.listProyectos = new ArrayList<ListaSelectBean>();
        this.listTitulos = new ArrayList<ListaSelectBean>();
        this.listPeriodos = new ArrayList<ListaSelectBean>();
        cargarListaProyectos();
        cargarListatitulos(this.fragConsultaBean.getIdProyecto());
        cargarListaPeriodos();
    }

    public void cargarListaProyectos() {
        ResponseWS responseWS = ConsultarProyectoFacade.consultarProyectos(this.listProyectos);
        System.out.println("Code Response = "+responseWS.getCodeResponse()+" con "+listProyectos.size()+" Resultados");
        
        if(!listProyectos.isEmpty()){
            for(ListaSelectBean item : this.listProyectos){
                System.out.println(" codigo = "+item.getCodigo()+" - Descripcion : "+item.getDescripcion());
            }
        }else{
            System.out.println("Lista VACIA");
        }

        /*         Integer codigo = 0;
        for(int i = 0; i < 10; i++){
          codigo = 10001+i;
            ListaSelectBean listSelect = new ListaSelectBean();
            listSelect.setCodigo(codigo.toString());
            listSelect.setDescripcion("Descripcion "+i);
            this.listProyectos.add(listSelect);
        } */

    }

    public void cargarListatitulos(String idProyectoBuscar) {
        //ResponseWS responseWS = ConsultarTitulosFacade.consultarTitulos(idProyectoBuscar, this.listTitulos);

        Integer codigo = 0;
        for(int i = 0; i < 10; i++){
          codigo = 200034348+i;
            ListaSelectBean listSelect = new ListaSelectBean();
            listSelect.setCodigo(codigo.toString());
            listSelect.setDescripcion("Contrato "+i);
            this.listTitulos.add(listSelect);
        }
    
    }

    public void cargarListaPeriodos() {
        //ResponseWS responseWS = ConsultarListaValoresFacade.consultarListaValores("6", this.listPeriodos);
            
        this.listPeriodos.add(new ListaSelectBean("1", "Mensual"));
        this.listPeriodos.add(new ListaSelectBean("2", "Trimestral"));
        this.listPeriodos.add(new ListaSelectBean("3", "Semestral"));
        this.listPeriodos.add(new ListaSelectBean("4", "Anual"));

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
