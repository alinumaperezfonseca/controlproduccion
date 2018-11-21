package com.soaint.conf;

import com.soaint.conf.bean.configuracion.ClaveSeguridadWeb;
import com.soaint.conf.bean.configuracion.LogConf;
import com.soaint.conf.bean.configuracion.OSBConf;

public class Configuracion {
    private OSBConf osb;
    private LogConf log;
    private Boolean desarrollo;
    private ClaveSeguridadWeb clave;
    public Configuracion() {
        super();
        this.osb = new OSBConf();
        this.clave= new ClaveSeguridadWeb();
        this.log= new LogConf();
    }


    public void setOsb(OSBConf osb) {
        this.osb = osb;
    }

    public OSBConf getOsb() {
        return osb;
    }

    public void setClave(ClaveSeguridadWeb clave) {
        this.clave = clave;
    }

    public ClaveSeguridadWeb getClave() {
        return clave;
    }

    public void setLog(LogConf log) {
        this.log = log;
    }

    public LogConf getLog() {
        return log;
    }

    public void setDesarrollo(Boolean desarrollo) {
        this.desarrollo = desarrollo;
    }

    public Boolean getDesarrollo() {
        return desarrollo;
    }
}
