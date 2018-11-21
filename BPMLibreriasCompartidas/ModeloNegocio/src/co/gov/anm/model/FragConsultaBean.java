package co.gov.anm.model;

import java.io.Serializable;

public class FragConsultaBean implements Serializable {
    @SuppressWarnings("compatibility:6908318731552504326")
    private static final long serialVersionUID = 1L;

    private String idProyecto;
    private String nombreProyecto;
    private String idContrato;
    private String nombreContrato;
    private String ano;
    private String idPeriodo;
    private String periodo;

    public void setIdPeriodo(String idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getIdPeriodo() {
        return idPeriodo;
    }

    public FragConsultaBean() {
        super();
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setNombreContrato(String nombreContrato) {
        this.nombreContrato = nombreContrato;
    }

    public String getNombreContrato() {
        return nombreContrato;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }
}
