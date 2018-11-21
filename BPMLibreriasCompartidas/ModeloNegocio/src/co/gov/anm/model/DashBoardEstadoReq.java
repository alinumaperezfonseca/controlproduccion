package co.gov.anm.model;

import java.io.Serializable;


public class DashBoardEstadoReq implements Serializable {
    @SuppressWarnings("compatibility:-5263326364146673016")
    private static final long serialVersionUID = 1L;

    private String cantidad;
    private String estado;


    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
