package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;

public class produccionRealizadaBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private int cantidadRealizada;
    private Date fechaReporteCantidadRealizada;


    public void setCantidadRealizada(int cantidadRealizada) {
        this.cantidadRealizada = cantidadRealizada;
    }

    public int getCantidadRealizada() {
        return cantidadRealizada;
    }

    public void setFechaReporteCantidadRealizada(Date fechaReporteCantidadRealizada) {
        this.fechaReporteCantidadRealizada = fechaReporteCantidadRealizada;
    }

    public Date getFechaReporteCantidadRealizada() {
        return fechaReporteCantidadRealizada;
    }


}
