package com.soaint.conf.bean.constantes;

public class Cabecera {
    private String aplicacion;
    private String identificacionUnicoGlobal;
    private String identificacionCanal;
    private String claveBusqueda;
    public Cabecera() {
        super();
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setIdentificacionUnicoGlobal(String identificacionUnicoGlobal) {
        this.identificacionUnicoGlobal = identificacionUnicoGlobal;
    }

    public String getIdentificacionUnicoGlobal() {
        return identificacionUnicoGlobal;
    }

    public void setIdentificacionCanal(String identificacionCanal) {
        this.identificacionCanal = identificacionCanal;
    }

    public String getIdentificacionCanal() {
        return identificacionCanal;
    }

    public void setClaveBusqueda(String claveBusqueda) {
        this.claveBusqueda = claveBusqueda;
    }

    public String getClaveBusqueda() {
        return claveBusqueda;
    }
}
