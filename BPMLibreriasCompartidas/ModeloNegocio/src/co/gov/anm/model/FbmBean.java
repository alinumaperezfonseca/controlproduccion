package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;


public class FbmBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private Date fecDeclaracionFBM;
    private int cantidadDeclaradaFBM;

    public void setFecDeclaracionFBM(Date fecDeclaracionFBM) {
        this.fecDeclaracionFBM = fecDeclaracionFBM;
    }

    public Date getFecDeclaracionFBM() {
        return fecDeclaracionFBM;
    }

    public void setCantidadDeclaradaFBM(int cantidadDeclaradaFBM) {
        this.cantidadDeclaradaFBM = cantidadDeclaradaFBM;
    }

    public int getCantidadDeclaradaFBM() {
        return cantidadDeclaradaFBM;
    }


}
