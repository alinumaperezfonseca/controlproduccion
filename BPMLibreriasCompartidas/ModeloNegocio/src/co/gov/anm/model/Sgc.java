package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;

public class Sgc implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private Date fechaTomaMuestraCalidad;
    private Date fechaExpedicionCertificadoCalidad;
    private int valIndiceCalidad;


    public void setFechaTomaMuestraCalidad(Date fechaTomaMuestraCalidad) {
        this.fechaTomaMuestraCalidad = fechaTomaMuestraCalidad;
    }

    public Date getFechaTomaMuestraCalidad() {
        return fechaTomaMuestraCalidad;
    }

    public void setFechaExpedicionCertificadoCalidad(Date fechaExpedicionCertificadoCalidad) {
        this.fechaExpedicionCertificadoCalidad = fechaExpedicionCertificadoCalidad;
    }

    public Date getFechaExpedicionCertificadoCalidad() {
        return fechaExpedicionCertificadoCalidad;
    }

    public void setValIndiceCalidad(int valIndiceCalidad) {
        this.valIndiceCalidad = valIndiceCalidad;
    }

    public int getValIndiceCalidad() {
        return valIndiceCalidad;
    }


}
