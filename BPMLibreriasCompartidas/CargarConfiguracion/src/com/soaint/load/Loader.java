package com.soaint.load;

import com.soaint.conf.Configuracion;

import com.soaint.conf.ConfiguracionConstantes;

import java.io.File;

public class Loader {
    public static final String UNIDAD_WINDOWS_CONFIGURACION = "C:\\";
    private String basePath;
    protected static Configuracion conf;
    protected static ConfiguracionConstantes confConstantes;

    public Loader() {
        super();
    }
    static {
        final Loader load = new Loader(Loader.UNIDAD_WINDOWS_CONFIGURACION);
        load.getOSBUrl();
    }


    public Loader(final String path) {
        super();
        this.basePath = path;
    }

    public ConfiguracionConstantes cargarConfiguracionConstante() {
        if ("/".equals(File.separator)) {
            this.basePath = File.separator;
        }
        final String path =
            this.basePath + "u01" + File.separator + "bpmconf" +
            File.separator + "constantes.xml";
        System.out.println("Ruta del archivo constantes ." + path);
        final File inputFile = new File(path);
        final LeerXMLDom leer = new LeerXMLDom();
        Loader.confConstantes = leer.cargarConfiguracionContante(inputFile);
        return Loader.confConstantes;
    }

    public Configuracion cargarConfiguracion() {
        if ("/".equals(File.separator)) {
            this.basePath = File.separator;
        }
        final String path =
            this.basePath + "u01" + File.separator + "bpmconf" +
            File.separator + "configuracion.xml";
        System.out.println("Ruta del archivo ." + path);
        final File inputFile = new File(path);
        final LeerXMLDom leer = new LeerXMLDom();
        Loader.conf = leer.cargarConfiguracion(inputFile);

        return Loader.conf;
    }

    public String getOSBUrl() {
        final Configuracion conf = this.getConf();
        return conf.getOsb().getProtocol() + conf.getOsb().getHost() + ":" +
            conf.getOsb().getPort();
    }

    public void setBasePath(final String basePath) {
        this.basePath = basePath;
    }

    public String getBasePath() {
        return basePath;
    }

    public Configuracion getConf() {
        if (Loader.conf == null) {
            return this.cargarConfiguracion();
        }
        return Loader.conf;
    }

    public ConfiguracionConstantes getConfConstantes() {
        if (Loader.confConstantes == null) {
            return this.cargarConfiguracionConstante();
        }
        return confConstantes;
    }
}
