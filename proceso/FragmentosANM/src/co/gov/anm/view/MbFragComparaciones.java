package co.gov.anm.view;

import co.gov.anm.facade.Comparacionesfacade;
import co.gov.anm.model.DashBoardComparaBean;

import com.soaint.util.JSFUtil;
import com.soaint.util.service.ResponseWS;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class MbFragComparaciones implements Serializable {
    @SuppressWarnings("compatibility")
    private static final long serialVersionUID = 1L;

    private DashBoardComparaBean fragComparaciones;
    private List<DashBoardComparaBean> listComparaciones;

    public MbFragComparaciones() {
        super();
        this.fragComparaciones = (DashBoardComparaBean) JSFUtil.resolveExpression("#{pageFlowScope.fragComparaciones}");
        this.listComparaciones = new ArrayList<DashBoardComparaBean>();
        consultar(this.fragComparaciones.getTitulo());

    }

    public void consultar(String titulo) {
        ResponseWS responseWS = Comparacionesfacade.consultaComparaciones(titulo, this.listComparaciones);
    }

    public void setFragComparaciones(DashBoardComparaBean fragComparaciones) {
        this.fragComparaciones = fragComparaciones;
    }

    public DashBoardComparaBean getFragComparaciones() {
        return fragComparaciones;
    }

    public void setListComparaciones(List<DashBoardComparaBean> listComparaciones) {
        this.listComparaciones = listComparaciones;
    }

    public List<DashBoardComparaBean> getListComparaciones() {
        return listComparaciones;
    }

}
