package co.gov.anm.model;

import java.io.Serializable;

import java.util.Date;

public class TipoAlertaConceptoBean implements Serializable {
    @SuppressWarnings("compatibility:-1772868138021261573")
    private static final long serialVersionUID = 1L;

    private String tipoAlerta;
    private String concepto;


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


}
