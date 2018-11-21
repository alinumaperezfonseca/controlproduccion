package co.gov.anm.model;

import java.io.Serializable;

public class ResultadoConsultaBean implements Serializable {
    @SuppressWarnings("compatibility:-6419383492630797123")
    private static final long serialVersionUID = 2L;

    private String idTitulo;
    private String nombreTitulo;
    private String ubicacion;
    private String mineral;
    private String titular;
    private String fecha;

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setCodigoConcepto(String codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

    public String getCodigoConcepto() {
        return codigoConcepto;
    }
    private String codigoConcepto;


    public void setIdTitulo(String idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getIdTitulo() {
        return idTitulo;
    }

    public void setMineral(String mineral) {
        this.mineral = mineral;
    }

    public String getMineral() {
        return mineral;
    }

    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
