
package co.gov.anm.view;

import co.gov.anm.facade.EstadoRequerimientoFacade;
import co.gov.anm.model.DashBoardEstadoReq;
import co.gov.anm.model.FragConsultaBean;

import com.soaint.util.JSFUtil;
import com.soaint.util.service.ResponseWS;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


public class MbFragEstadoReque implements Serializable {
    @SuppressWarnings("compatibility")
    private static final long serialVersionUID = 1L;

    private DashBoardEstadoReq fragEstadoReque;
    private FragConsultaBean fragConsultaBean;
    
    private List<DashBoardEstadoReq> listaEstadoReq = new ArrayList<DashBoardEstadoReq>();

    public MbFragEstadoReque() {
        super();
        this.fragEstadoReque = (DashBoardEstadoReq) JSFUtil.resolveExpression("#{pageFlowScope.fragEstadoReque}");
        this.fragConsultaBean = (FragConsultaBean) JSFUtil.resolveExpression("#{pageFlowScope.fragConsulta}");
        consultarEstadoReque(fragConsultaBean.getIdContrato());
    }

    private void consultarEstadoReque(String titulo) {
        ResponseWS responseWS = EstadoRequerimientoFacade.consultarEstadoRequerimientos(titulo, this.listaEstadoReq);

    }


    public void setFragEstadoReque(DashBoardEstadoReq fragEstadoReque) {
        this.fragEstadoReque = fragEstadoReque;
    }

    public DashBoardEstadoReq getFragEstadoReque() {
        return fragEstadoReque;
    }

    public void setFragConsultaBean(FragConsultaBean fragConsultaBean) {
        this.fragConsultaBean = fragConsultaBean;
    }

    public FragConsultaBean getFragConsultaBean() {
        return fragConsultaBean;
    }

    public void setListaEstadoReq(List<DashBoardEstadoReq> listaEstadoReq) {
        this.listaEstadoReq = listaEstadoReq;
    }

    public List<DashBoardEstadoReq> getListaEstadoReq() {
        return listaEstadoReq;
    }

}
