package com.soaint.util;

public class RifUtil {
    public RifUtil() {
        super();
    }

    public static boolean esRifCorrecto(String rif) {

        boolean valido = false;

        rif = rif.toUpperCase();
        JSFUtil.addInfoMessage("rif " + rif);

        if (rif != "J" || rif != "V" || rif != "E" || rif != "P" ||
            rif != "G") {
            JSFUtil.addInfoMessage("dentro del si rif correcto");
            return false;
        }
        return true;
    }
}
