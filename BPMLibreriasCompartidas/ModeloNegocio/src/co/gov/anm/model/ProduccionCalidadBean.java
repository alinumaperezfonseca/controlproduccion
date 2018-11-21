package co.gov.anm.model;

import java.util.Date;

import java.io.Serializable;


public class ProduccionCalidadBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private Date fechaTomaMuestraCalidad; //Fecha toma de muestras calidad
    private Date fechaExpedCertiCalidad; //Fecha expedicion de certificado de calidad
    private String valIndiceCalidad; //Valor Indice Calidad


    public void setFechaTomaMuestraCalidad(Date fechaTomaMuestraCalidad) {
        this.fechaTomaMuestraCalidad = fechaTomaMuestraCalidad;
    }

    public Date getFechaTomaMuestraCalidad() {
        return fechaTomaMuestraCalidad;
    }

    public void setFechaExpedCertiCalidad(Date fechaExpedCertiCalidad) {
        this.fechaExpedCertiCalidad = fechaExpedCertiCalidad;
    }

    public Date getFechaExpedCertiCalidad() {
        return fechaExpedCertiCalidad;
    }

    public void setValIndiceCalidad(String valIndiceCalidad) {
        this.valIndiceCalidad = valIndiceCalidad;
    }

    public String getValIndiceCalidad() {
        return valIndiceCalidad;
    }

}
