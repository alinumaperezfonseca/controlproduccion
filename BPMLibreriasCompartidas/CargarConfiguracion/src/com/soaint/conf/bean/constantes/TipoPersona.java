package com.soaint.conf.bean.constantes;

public class TipoPersona {
    private String solicitante;
    private String fiador;
    private String personaNueva;
    public TipoPersona() {
        super();
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setFiador(String fiador) {
        this.fiador = fiador;
    }

    public String getFiador() {
        return fiador;
    }

    public void setPersonaNueva(String personaNueva) {
        this.personaNueva = personaNueva;
    }

    public String getPersonaNueva() {
        return personaNueva;
    }
}
