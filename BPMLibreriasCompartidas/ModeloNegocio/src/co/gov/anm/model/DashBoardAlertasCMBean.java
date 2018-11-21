package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;

public class DashBoardAlertasCMBean implements Serializable {
    @SuppressWarnings("compatibility:-7096846653695644569")
    private static final long serialVersionUID = 1L;

    private String nombreAlerta;
    private Date fechaAlerta;
    private String severidad;
    private String detalle;


    public void setNombreAlerta(String nombreAlerta) {
        this.nombreAlerta = nombreAlerta;
    }

    public String getNombreAlerta() {
        return nombreAlerta;
    }

    public void setFechaAlerta(Date fechaAlerta) {
        this.fechaAlerta = fechaAlerta;
    }

    public Date getFechaAlerta() {
        return fechaAlerta;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getDetalle() {
        return detalle;
    }

}
