package co.gov.anm.model;

import java.util.Date;

import java.io.Serializable;

public class declaracionRegaliasBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private Date fechaDeclaracionDeclarada;
    private int cantidadDeclarada;


    public void setFechaDeclaracionDeclarada(Date fechaDeclaracionDeclarada) {
        this.fechaDeclaracionDeclarada = fechaDeclaracionDeclarada;
    }

    public Date getFechaDeclaracionDeclarada() {
        return fechaDeclaracionDeclarada;
    }

    public void setCantidadDeclarada(int cantidadDeclarada) {
        this.cantidadDeclarada = cantidadDeclarada;
    }

    public int getCantidadDeclarada() {
        return cantidadDeclarada;
    }


}
