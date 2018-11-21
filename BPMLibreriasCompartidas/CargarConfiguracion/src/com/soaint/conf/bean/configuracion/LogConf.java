package com.soaint.conf.bean.configuracion;

public class LogConf {
    public static final String TYPE_SESSION="SESSION";
    public static final String TYPE_SYSTEM="SYSTEM";
    private String type;
    private String basePath;
    private Boolean logPayload;
    private String timePattern;
    public LogConf() {
        super();
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setLogPayload(Boolean logPayload) {
        this.logPayload = logPayload;
    }

    public Boolean getLogPayload() {
        return logPayload;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setTimePattern(String timePattern) {
        this.timePattern = timePattern;
    }

    public String getTimePattern() {
        return timePattern;
    }
}
