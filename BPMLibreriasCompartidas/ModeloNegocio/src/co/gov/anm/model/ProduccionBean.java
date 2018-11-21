package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;

public class ProduccionBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private Date fechaInicialPeriodo;
    private Date fechaFinalPeriodo;
    private String unidadMedida;
    private int cantidadProduccion;
    private int valorIndiceCalidad;
    private Date fechaMuestraCalidad;
    private String nombreMineral;
    private String mesEtapa;
    private int ano;


    public void setFechaInicialPeriodo(Date fechaInicialPeriodo) {
        this.fechaInicialPeriodo = fechaInicialPeriodo;
    }

    public Date getFechaInicialPeriodo() {
        return fechaInicialPeriodo;
    }

    public void setFechaFinalPeriodo(Date fechaFinalPeriodo) {
        this.fechaFinalPeriodo = fechaFinalPeriodo;
    }

    public Date getFechaFinalPeriodo() {
        return fechaFinalPeriodo;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setCantidadProduccion(int cantidadProduccion) {
        this.cantidadProduccion = cantidadProduccion;
    }

    public int getCantidadProduccion() {
        return cantidadProduccion;
    }

    public void setValorIndiceCalidad(int valorIndiceCalidad) {
        this.valorIndiceCalidad = valorIndiceCalidad;
    }

    public int getValorIndiceCalidad() {
        return valorIndiceCalidad;
    }

    public void setFechaMuestraCalidad(Date fechaMuestraCalidad) {
        this.fechaMuestraCalidad = fechaMuestraCalidad;
    }

    public Date getFechaMuestraCalidad() {
        return fechaMuestraCalidad;
    }

    public void setNombreMineral(String nombreMineral) {
        this.nombreMineral = nombreMineral;
    }

    public String getNombreMineral() {
        return nombreMineral;
    }

    public void setMesEtapa(String mesEtapa) {
        this.mesEtapa = mesEtapa;
    }

    public String getMesEtapa() {
        return mesEtapa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
}
