package co.gov.anm.view.fragments;

import java.io.Serializable;
import co.gov.anm.facade.ConsultarTituloFacade;
import co.gov.anm.model.TituloContratoBean;

import com.soaint.util.JSFUtil;
import com.soaint.util.service.ResponseWS;

import java.util.ArrayList;
import java.util.List;

public class FgEncabezado implements Serializable {
    @SuppressWarnings("compatibility")
    private static final long serialVersionUID = 1L;

    private TituloContratoBean fragTituloContratoBean;
    
    private List<TituloContratoBean> listaEstadoReq = new ArrayList<TituloContratoBean>();

    public FgEncabezado() {
        super();
        this.fragTituloContratoBean = (TituloContratoBean) JSFUtil.resolveExpression("#{pageFlowScope.fragEncabezado}");
        //consultarEstadoReque(fragTituloContratoBean.getTituloMinero());
    }
    
    private void consultarEstadoReque(String titulo) {
        ResponseWS responseWS = ConsultarTituloFacade.ConsultarTitulo(titulo, this.fragTituloContratoBean);
    }

    public void setFragTituloContratoBean(TituloContratoBean fragTituloContratoBean) {
        this.fragTituloContratoBean = fragTituloContratoBean;
    }

    public TituloContratoBean getFragTituloContratoBean() {
        return fragTituloContratoBean;
    }

    public void setListaEstadoReq(List<TituloContratoBean> listaEstadoReq) {
        this.listaEstadoReq = listaEstadoReq;
    }

    public List<TituloContratoBean> getListaEstadoReq() {
        return listaEstadoReq;
    }
}

