package co.gov.anm.view;


import co.gov.anm.model.AlertaBean;

import com.soaint.util.JSFUtil;

import java.io.Serializable;

public class MbFragAlertas implements Serializable {
    @SuppressWarnings("compatibility")
    private static final long serialVersionUID = 1L;

    private AlertaBean fragAlertas;

    public MbFragAlertas() {
        super();
        this.fragAlertas = (AlertaBean) JSFUtil.resolveExpression("#{pageFlowScope.fragAlertas}");
    }


    public void setFragAlertas(AlertaBean fragAlertas) {
        this.fragAlertas = fragAlertas;
    }

    public AlertaBean getFragAlertas() {
        return fragAlertas;
    }

}
