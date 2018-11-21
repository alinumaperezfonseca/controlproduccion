package co.gov.anm.model;

import java.io.Serializable;

public class AdjuntarBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private String Archivo;


    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public String getArchivo() {
        return Archivo;
    }

}
