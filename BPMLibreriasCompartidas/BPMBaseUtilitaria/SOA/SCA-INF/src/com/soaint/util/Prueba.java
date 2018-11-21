package com.soaint.util;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import java.util.Locale;

import org.python.modules.thread;

import com.soaint.load.Loader;
import com.soaint.load.LeerXMLDom;
import com.soaint.extend.base.Base;


public class Prueba {

    public Prueba() {
        super();
    }

    public static String getGermanCurrencyFormat(double value) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        nf.setGroupingUsed(true);
        return nf.format(value);
    }

    public static void main(String[] args) throws ParseException {
        String cuenta = "1234567895";
        System.out.println(StringUtil.aplicarMaskaraCuenta(cuenta));
        Base.getLoad().cargarConfiguracionConstante();
        System.out.println(" >>>" +
                           Base.getLoad().getConfConstantes().getCodigos().getCodigoTipoJuridico());
        System.out.println(" >>>" +
                           Base.getLoad().getConfConstantes().getCodigos().getListaTipoJuridico());
    }

}
