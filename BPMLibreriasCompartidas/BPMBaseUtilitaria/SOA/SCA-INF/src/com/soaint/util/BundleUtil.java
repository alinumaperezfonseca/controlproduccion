package com.soaint.util;

import java.util.ResourceBundle;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

public class BundleUtil {
    public static final String BUNDLE_PATH = "bundle";
    public static final String BUNDLE_CONTANTES_PATH = "constantes";

    private BundleUtil() {
        super();
    }

    public static String getString(String varName, String key) {
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ResourceBundle bundle = app.getResourceBundle(context, varName);
        return bundle.getString(key);
    }
}
