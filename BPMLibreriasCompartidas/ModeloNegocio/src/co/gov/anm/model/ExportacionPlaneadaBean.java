package co.gov.anm.model;

import java.io.Serializable;

public class ExportacionPlaneadaBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private int cantidadExpoPlaneadoCP;
    private int cantidadExpoPlaneadoMP;
    private int cantidadExpoPlaneadoLP;


    public void setCantidadExpoPlaneadoCP(int cantidadExpoPlaneadoCP) {
        this.cantidadExpoPlaneadoCP = cantidadExpoPlaneadoCP;
    }

    public int getCantidadExpoPlaneadoCP() {
        return cantidadExpoPlaneadoCP;
    }

    public void setCantidadExpoPlaneadoMP(int cantidadExpoPlaneadoMP) {
        this.cantidadExpoPlaneadoMP = cantidadExpoPlaneadoMP;
    }

    public int getCantidadExpoPlaneadoMP() {
        return cantidadExpoPlaneadoMP;
    }

    public void setCantidadExpoPlaneadoLP(int cantidadExpoPlaneadoLP) {
        this.cantidadExpoPlaneadoLP = cantidadExpoPlaneadoLP;
    }

    public int getCantidadExpoPlaneadoLP() {
        return cantidadExpoPlaneadoLP;

    }

}
