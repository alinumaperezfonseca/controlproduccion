package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;

public class TituloContratoBean implements Serializable {
    @SuppressWarnings("compatibility:3883960584013564555")
    private static final long serialVersionUID = 1L;

    private String proyectoPin;
    private String idTitularMinero;
    private String contratoNumero;
    private String periodoExplotacion;
    private String tituloAnio;
    private String nombreTitularMinero;
    private String tituloMinero;
    private String idUbicacion;
    private Date Fecha;
    private String nombreUbicacion;
    private String codigoConcepto;
    private String localizacion;

    public TituloContratoBean() {
        super();
    }

    public void setProyectoPin(String proyectoPin) {
        this.proyectoPin = proyectoPin;
    }

    public String getProyectoPin() {
        return proyectoPin;
    }

    public void setIdTitularMinero(String idTitularMinero) {
        this.idTitularMinero = idTitularMinero;
    }

    public String getIdTitularMinero() {
        return idTitularMinero;
    }

    public void setContratoNumero(String contratoNumero) {
        this.contratoNumero = contratoNumero;
    }

    public String getContratoNumero() {
        return contratoNumero;
    }

    public void setPeriodoExplotacion(String periodoExplotacion) {
        this.periodoExplotacion = periodoExplotacion;
    }

    public String getPeriodoExplotacion() {
        return periodoExplotacion;
    }

    public void setTituloAnio(String tituloAnio) {
        this.tituloAnio = tituloAnio;
    }

    public String getTituloAnio() {
        return tituloAnio;
    }

    public void setNombreTitularMinero(String nombreTitularMinero) {
        this.nombreTitularMinero = nombreTitularMinero;
    }

    public String getNombreTitularMinero() {
        return nombreTitularMinero;
    }

    public void setTituloMinero(String tituloMinero) {
        this.tituloMinero = tituloMinero;
    }

    public String getTituloMinero() {
        return tituloMinero;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setCodigoConcepto(String codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public String getCodigoConcepto() {
        return codigoConcepto;
    }


    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }
}
