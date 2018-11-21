package com.soaint.extend.base;

import com.soaint.conf.bean.configuracion.LogConf;
import com.soaint.load.Loader;
import com.soaint.util.JSFUtil;

import java.io.IOException;

import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Base {
    private static Loader load;
    private static PatternLayout layout;
    private static Logger looger;
    private static Logger userLooguer;

    public Base() {
        super();
    }

    public static Logger getUsertLogguer(String user) {
        if (Base.userLooguer == null) {
            try {
                FileAppender appender =
                    new DailyRollingFileAppender(Base.getLayout(),
                                                 Base.getLoad().getConf().getLog().getBasePath() +
                                                 user, ".yyyy-MM-dd");
                appender.setFile(Base.getLoad().getConf().getLog().getBasePath() +
                                 user);
                appender.setName("user");
                appender.activateOptions();
                Base.userLooguer = Logger.getRootLogger();
                Base.userLooguer.addAppender(appender);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileAppender appender =
            (FileAppender)Base.userLooguer.getAppender("user");
        appender.setFile(Base.getLoad().getConf().getLog().getBasePath() +
                         user);
        return Base.userLooguer;
    }

    private static PatternLayout getLayout() {
        if (Base.layout == null) {
            Base.layout = new PatternLayout();
            Base.layout.setConversionPattern(Base.getLoad().getConf().getLog().getTimePattern());
            Base.layout.activateOptions();
        }
        return Base.layout;
    }

    public static Logger getLogguer() {
        if (Base.looger == null) {
            try {
                FileAppender appender =
                    new DailyRollingFileAppender(Base.getLayout(),
                                                 "bpm_preliminar",
                                                 ".yyyy-MM-dd");
                appender.setFile(Base.getLoad().getConf().getLog().getBasePath() +
                                 "bpm_preliminar");
                appender.setName("general");
                appender.activateOptions();
                Base.looger = Logger.getRootLogger();
                Base.looger.addAppender(appender);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Base.looger;
    }

    public static void log(String user, String msj) {
        if (user != null) {
            Base.getUsertLogguer(user).debug(msj);
            return;
        }
        if (user == null) {
            log(msj);
        }
    }

    public static void log(String user, Throwable msj) {
        if (user != null) {
            Base.getUsertLogguer(user).debug(msj);
            return;
        }
        if (user == null) {
            log(msj);
        }
    }

    public static void logError(String user, String ms, Throwable error) {
        if (user != null) {
            Base.getUsertLogguer(user).error("Usuario " + user + " :: " + ms +
                                             ": ", error);
            return;
        }
        if (user == null) {
            logError(ms, error);
        }
    }

    public static void log(String msj) {
        if (Base.getLoad().getConf().getLog().getType().equals(LogConf.TYPE_SYSTEM)) {
            return;
        }
        Base.getLogguer().debug(msj);
    }

    public static void log(Throwable msj) {
        if (Base.getLoad().getConf().getLog().getType().equals(LogConf.TYPE_SYSTEM)) {
            return;
        }
        Base.getLogguer().debug(msj);
    }

    public static void logError(String msj, Throwable error) {
        Base.getLogguer().error(msj, error);
    }

    public void mostrarError(String error) {
        RichOutputText text =
            (RichOutputText)JSFUtil.findComponentInRoot("detalleError");
        text.setValue(error);
        RichPanelGroupLayout panel =
            (RichPanelGroupLayout)JSFUtil.findComponentInRoot("panelErrorMostrar");
        JSFUtil.refreshComponent(panel);
    }

    public static Loader getLoad() {
        if (Base.load == null) {
            Base.load = new Loader(Loader.UNIDAD_WINDOWS_CONFIGURACION);
        }
        return load;
    }
}
