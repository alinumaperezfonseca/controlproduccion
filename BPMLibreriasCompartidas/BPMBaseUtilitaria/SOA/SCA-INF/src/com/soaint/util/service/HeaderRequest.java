package com.soaint.util.service;

import java.math.BigDecimal;

public class HeaderRequest {
    private String identificadorUnicoGlobal;
    private String identificacionCanal;
    private String siglaAplicacion;
    private String identificacionUsuario;
    private String direccionIpConsumidor;
    private String direccionIpCliente;
    private String fechaEnvioMensaje;
    private String horaEnvioMensaje;
    private String atributoPagineo;
    private String claveBusqueda;
    private BigDecimal cantidadRegistros;

    public HeaderRequest() {
        super();
    }

    public void setIdentificadorUnicoGlobal(String identificadorUnicoGlobal) {
        this.identificadorUnicoGlobal = identificadorUnicoGlobal;
    }

    public String getIdentificadorUnicoGlobal() {
        return identificadorUnicoGlobal;
    }

    public void setIdentificacionCanal(String identificacionCanal) {
        this.identificacionCanal = identificacionCanal;
    }

    public String getIdentificacionCanal() {
        return identificacionCanal;
    }

    public void setSiglaAplicacion(String siglaAplicacion) {
        this.siglaAplicacion = siglaAplicacion;
    }

    public String getSiglaAplicacion() {
        return siglaAplicacion;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setDireccionIpConsumidor(String direccionIpConsumidor) {
        this.direccionIpConsumidor = direccionIpConsumidor;
    }

    public String getDireccionIpConsumidor() {
        return direccionIpConsumidor;
    }

    public void setDireccionIpCliente(String direccionIpCliente) {
        this.direccionIpCliente = direccionIpCliente;
    }

    public String getDireccionIpCliente() {
        return direccionIpCliente;
    }

    public void setFechaEnvioMensaje(String fechaEnvioMensaje) {
        this.fechaEnvioMensaje = fechaEnvioMensaje;
    }

    public String getFechaEnvioMensaje() {
        return fechaEnvioMensaje;
    }

    public void setHoraEnvioMensaje(String horaEnvioMensaje) {
        this.horaEnvioMensaje = horaEnvioMensaje;
    }

    public String getHoraEnvioMensaje() {
        return horaEnvioMensaje;
    }

    public void setAtributoPagineo(String atributoPagineo) {
        this.atributoPagineo = atributoPagineo;
    }

    public String getAtributoPagineo() {
        return atributoPagineo;
    }

    public void setClaveBusqueda(String claveBusqueda) {
        this.claveBusqueda = claveBusqueda;
    }

    public String getClaveBusqueda() {
        return claveBusqueda;
    }

    public void setCantidadRegistros(BigDecimal cantidadRegistros) {
        this.cantidadRegistros = cantidadRegistros;
    }

    public BigDecimal getCantidadRegistros() {
        return cantidadRegistros;
    }
}
