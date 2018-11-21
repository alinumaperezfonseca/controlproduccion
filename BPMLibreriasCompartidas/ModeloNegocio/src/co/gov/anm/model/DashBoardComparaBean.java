package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;

import java.math.BigInteger;

public class DashBoardComparaBean implements Serializable {
    @SuppressWarnings("compatibility:-1015525432753133332")
    private static final long serialVersionUID = 1L;

    private String titular;
    private String titulo;
    private String comparacion;
    private Date fecha;
    private BigInteger cantidad;

    public DashBoardComparaBean() {
        super();
    }

    public void setComparacion(String comparacion) {
        this.comparacion = comparacion;
    }

    public String getComparacion() {
        return comparacion;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

}
