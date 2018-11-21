package co.gov.anm.model;

import java.io.Serializable;

public class AlertaBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private String estado;
    private String tipoAlerta;
    private String textoAlerta;

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setTipoAlerta(String tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public String getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTextoAlerta(String textoAlerta) {
        this.textoAlerta = textoAlerta;
    }

    public String getTextoAlerta() {
        return textoAlerta;
    }


}
