package com.soaint.conf.bean.configuracion;

public class OSBConf {
    private String host;
    private String port;
    private String protocol;
    
    public OSBConf() {
        super();
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getProtocol() {
        return protocol;
    }
}
