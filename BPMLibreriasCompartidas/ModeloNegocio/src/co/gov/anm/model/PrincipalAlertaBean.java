package co.gov.anm.model;

import java.io.Serializable;

public class PrincipalAlertaBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private String proyecto;
    private String Titulo;
    private String ano;
    private String severidad;
    private String tipoPeriodo;
    private String periodo;
    private String idTitulo;
    private String nombreTitulo;
    private String ubicacion;
    private String mineral;
    private String titular;
    private String fecha;
    private String tipoAlerta;
    private String concepto;
    private String Archivo;


    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setTipoPeriodo(String tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
    }

    public String getTipoPeriodo() {
        return tipoPeriodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setIdTitulo(String idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getIdTitulo() {
        return idTitulo;
    }

    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setMineral(String mineral) {
        this.mineral = mineral;
    }

    public String getMineral() {
        return mineral;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public String getArchivo() {
        return Archivo;
    }
}
