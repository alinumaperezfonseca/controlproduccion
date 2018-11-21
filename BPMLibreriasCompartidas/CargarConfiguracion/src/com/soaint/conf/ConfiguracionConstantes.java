package com.soaint.conf;

import com.soaint.conf.bean.constantes.Bitacora;
import com.soaint.conf.bean.constantes.Cabecera;
import com.soaint.conf.bean.constantes.CodigosUtilitarios;
import com.soaint.conf.bean.constantes.Services;
import com.soaint.conf.bean.constantes.TipoPersona;


public class ConfiguracionConstantes {
    private Services servicio;
    private TipoPersona tipoPersona;
    private CodigosUtilitarios codigos;
    private Cabecera cabecera;
    private Bitacora bitacora;
    
    public ConfiguracionConstantes() {
        this.servicio= new Services();
        this.codigos = new CodigosUtilitarios();
        this.tipoPersona = new TipoPersona();
        this.cabecera = new Cabecera();
        this.bitacora = new Bitacora();
    }
    public void setServicio(Services servicio) {
        this.servicio = servicio;
    }

    public Services getServicio() {
        return servicio;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setCodigos(CodigosUtilitarios codigos) {
        this.codigos = codigos;
    }

    public CodigosUtilitarios getCodigos() {
        return codigos;
    }

    public void setCabecera(Cabecera cabecera) {
        this.cabecera = cabecera;
    }

    public Cabecera getCabecera() {
        return cabecera;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

}
