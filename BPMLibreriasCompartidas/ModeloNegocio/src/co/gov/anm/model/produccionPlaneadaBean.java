package co.gov.anm.model;

import java.io.Serializable;

public class produccionPlaneadaBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private int cantidadPlaneadoCP;
    private int cantidadPlaneadoMP;
    private int cantidadPlaneadoLP;


    public void setCantidadPlaneadoCP(int cantidadPlaneadoCP) {
        this.cantidadPlaneadoCP = cantidadPlaneadoCP;
    }

    public int getCantidadPlaneadoCP() {
        return cantidadPlaneadoCP;
    }

    public void setCantidadPlaneadoMP(int cantidadPlaneadoMP) {
        this.cantidadPlaneadoMP = cantidadPlaneadoMP;
    }

    public int getCantidadPlaneadoMP() {
        return cantidadPlaneadoMP;
    }

    public void setCantidadPlaneadoLP(int cantidadPlaneadoLP) {
        this.cantidadPlaneadoLP = cantidadPlaneadoLP;
    }

    public int getCantidadPlaneadoLP() {
        return cantidadPlaneadoLP;
    }


}
