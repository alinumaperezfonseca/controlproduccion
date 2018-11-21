package co.gov.anm.model;

import java.util.Date;

import java.io.Serializable;


public class ConceptoBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private String codigoConcepto; // referencia del concepto
    private String rmn; //fdkslafjdks
    private String asunto; //asunto del concepto
    private String conceptoTecnico; //concepto tecnico
    private Date fecha; //fecha del concepto
    private String asociaRequerimientos; //Asociacion de requerimientos
    private String plazoRequerimiento; //Plazo del requerimiento
    private String requerimiento; //requerimiento
    private String idCorrespondencia; //id de la correspondencia
    private String requerimientoSubsanado; //requerimiento subsanado
    private String plazoSubsanar; //plazo a subsanar
    private String observacion; //observacion
    private String plazoRequerimientoSubsanar; //plazo a subsanar del requerimiento

    public void setCodigoConcepto(String referencia) {
        this.codigoConcepto = referencia;
    }

    public String getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setRmn(String rmn) {
        this.rmn = rmn;
    }

    public String getRmn() {
        return rmn;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setConceptoTecnico(String conceptoTecnico) {
        this.conceptoTecnico = conceptoTecnico;
    }

    public String getConceptoTecnico() {
        return conceptoTecnico;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setAsociaRequerimientos(String asociaRequerimientos) {
        this.asociaRequerimientos = asociaRequerimientos;
    }

    public String getAsociaRequerimientos() {
        return asociaRequerimientos;
    }

    public void setPlazoRequerimiento(String plazoRequerimiento) {
        this.plazoRequerimiento = plazoRequerimiento;
    }

    public String getPlazoRequerimiento() {
        return plazoRequerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setIdCorrespondencia(String idCorrespondencia) {
        this.idCorrespondencia = idCorrespondencia;
    }

    public String getIdCorrespondencia() {
        return idCorrespondencia;
    }

    public void setRequerimientoSubsanado(String requerimientoSubsanado) {
        this.requerimientoSubsanado = requerimientoSubsanado;
    }

    public String getRequerimientoSubsanado() {
        return requerimientoSubsanado;
    }

    public void setPlazoSubsanar(String plazoSubsanar) {
        this.plazoSubsanar = plazoSubsanar;
    }

    public String getPlazoSubsanar() {
        return plazoSubsanar;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setPlazoRequerimientoSubsanar(String plazoRequerimientoSubsanar) {
        this.plazoRequerimientoSubsanar = plazoRequerimientoSubsanar;
    }

    public String getPlazoRequerimientoSubsanar() {
        return plazoRequerimientoSubsanar;
    }

}
