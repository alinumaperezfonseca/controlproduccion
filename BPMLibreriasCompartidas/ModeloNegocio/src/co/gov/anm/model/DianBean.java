package co.gov.anm.model;

import java.io.Serializable;

public class DianBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private String numeroDeclaracionExportacion;
    private double cantidadExplotaciones;


    public void setNumeroDeclaracionExportacion(String numeroDeclaracionExportacion) {
        this.numeroDeclaracionExportacion = numeroDeclaracionExportacion;
    }

    public String getNumeroDeclaracionExportacion() {
        return numeroDeclaracionExportacion;
    }

    public void setCantidadExplotaciones(double cantidadExplotaciones) {
        this.cantidadExplotaciones = cantidadExplotaciones;
    }

    public double getCantidadExplotaciones() {
        return cantidadExplotaciones;
    }
}
