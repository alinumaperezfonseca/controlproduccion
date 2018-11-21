package gov.anm.view;

import co.gov.anm.model.AlertaBean;

import com.soaint.extend.base.AbstractBPMManageBeanBase;
import com.soaint.extend.contextual.event.ProcessContextualEventInterface;
import com.soaint.util.BPMUtil;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

public class MBPrincipal extends AbstractBPMManageBeanBase implements Serializable, ProcessContextualEventInterface {
    @SuppressWarnings("compatibility:-775511035452273891")
    private static final long serialVersionUID = 1L;


    private AlertaBean alertaBean;
    private String usuario;
    private String rolBPM;
    private String instancia;
    
    

    public MBPrincipal() {
        super();
        this.usuario=(BPMUtil.getUsuarioBPM());
        this.rolBPM=(String) BPMUtil.getAtributeValue("swimlaneRole");
        this.instancia=(BPMUtil.getInstanceId());
    }



    @Override
    public void processContextualEvent(Object object, Object object2) {
        // TODO Implement this method



    }

    @Override
    public void processOnError(Object object, Object object2) {
        // TODO Implement this method



    }

    @Override
    public void processOnCleanError(Object object, Object object2) {
        // TODO Implement this method



    }

    @Override
    public void processOnSelect(Object object, Object object2) {
        // TODO Implement this method



    }

    @Override
    public void processOnRefresh(Object object, Object object2) {
        // TODO Implement this method



    }

    @Override
    public void processOnSearch(Object object, Object object2) {
        // TODO Implement this method



    }

    @Override
    public void processOnChange(Object object, Object object2) {
        // TODO Implement this method



    }

    @Override
    public void finalizarActionListener(ActionEvent actionEvent) {
        // TODO Implement this method
    }

    @Override
    public Boolean finalizarActividad() {
        // TODO Implement this method
        return null;
    }

    public void setAlertaBean(AlertaBean alertaBean) {
        this.alertaBean = alertaBean;
    }

    public AlertaBean getAlertaBean() {
        return alertaBean;
    }
}
