package co.gov.anm.model;

import java.util.Date;

import java.io.Serializable;

public class ExportacionBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private Date fechaCorteExpor;
    private String idMunicipioPuertoOrigen;
    private String nombreMunicipioPuertoOrigen;
    private String cantidadExplotaciones;
    private String idCiudadDestino;
    private String nombreCiudadDestino;
    private String nombreBuque;
    private String nombrePuertoOrigen;
    private String flgDeclaradaDian;


    public void setFechaCorteExpor(Date fechaCorteExpor) {
        this.fechaCorteExpor = fechaCorteExpor;
    }

    public Date getFechaCorteExpor() {
        return fechaCorteExpor;
    }

    public void setIdMunicipioPuertoOrigen(String idMunicipioPuertoOrigen) {
        this.idMunicipioPuertoOrigen = idMunicipioPuertoOrigen;
    }

    public String getIdMunicipioPuertoOrigen() {
        return idMunicipioPuertoOrigen;
    }

    public void setNombreMunicipioPuertoOrigen(String nombreMunicipioPuertoOrigen) {
        this.nombreMunicipioPuertoOrigen = nombreMunicipioPuertoOrigen;
    }

    public String getNombreMunicipioPuertoOrigen() {
        return nombreMunicipioPuertoOrigen;
    }

    public void setCantidadExplotaciones(String cantidadExplotaciones) {
        this.cantidadExplotaciones = cantidadExplotaciones;
    }

    public String getCantidadExplotaciones() {
        return cantidadExplotaciones;
    }

    public void setIdCiudadDestino(String idCiudadDestino) {
        this.idCiudadDestino = idCiudadDestino;
    }

    public String getIdCiudadDestino() {
        return idCiudadDestino;
    }

    public void setNombreCiudadDestino(String nombreCiudadDestino) {
        this.nombreCiudadDestino = nombreCiudadDestino;
    }

    public String getNombreCiudadDestino() {
        return nombreCiudadDestino;
    }

    public void setNombreBuque(String nombreBuque) {
        this.nombreBuque = nombreBuque;
    }

    public String getNombreBuque() {
        return nombreBuque;
    }

    public void setNombrePuertoOrigen(String nombrePuertoOrigen) {
        this.nombrePuertoOrigen = nombrePuertoOrigen;
    }

    public String getNombrePuertoOrigen() {
        return nombrePuertoOrigen;
    }

    public void setFlgDeclaradaDian(String flgDeclaradaDian) {
        this.flgDeclaradaDian = flgDeclaradaDian;
    }

    public String getFlgDeclaradaDian() {
        return flgDeclaradaDian;
    }


}
