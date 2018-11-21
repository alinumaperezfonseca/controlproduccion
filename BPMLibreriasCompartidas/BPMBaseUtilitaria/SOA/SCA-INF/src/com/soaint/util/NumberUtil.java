package com.soaint.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import java.text.NumberFormat;

import java.util.Locale;
import java.util.Random;

public class NumberUtil {
    
   // public static final String regexNumeroConDecimales="^[+-]?[0-9]{1,9}(?:\\.[0-9]{1,2})?$"; --- > prueba
    public static final String regexNumeroConDecimales="^[+-]?(\\d{1}\\.)?(\\d+\\.?)+(,\\d{1,2})?$";  
    //public static final String regexNumeroConDecimales="^(\\d{1}\\.)?(\\d+\\.?)+(,\\d{1,2})?$";  ---> original
    
    public NumberUtil() {
        super();
    }
    
    public static Integer randomNumber(Integer max) {
        Random rnd = new Random();
        return rnd.nextInt(max);
    }

    public static String decimalFormatbs1(String number) {
        if (number != null && !number.toString().trim().equals("")) {
            try {               
                 /*
                 Double num = Double.parseDouble(number);
                  String pattern = "###,###,##0.00";
                  NumberFormat nf = NumberFormat.getNumberInstance();
                  DecimalFormat df = (DecimalFormat)nf;
                  df.applyPattern(pattern);
                  number = df.format(num);*/
                  
                DecimalFormatSymbols simbolo=new DecimalFormatSymbols();
                simbolo.setDecimalSeparator(',');
                simbolo.setGroupingSeparator('.');
                DecimalFormat df = new DecimalFormat("###,###,##0.00",simbolo);
                number = df.format(Double.valueOf(number));
                  
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
        return number;
    }


    public static String decimalFormatbs(Object number) {
        if (number != null && !number.toString().trim().equals("")) {
            try {
                Double num = Double.parseDouble(number.toString());
                DecimalFormatSymbols formatSymbols =
                    new DecimalFormatSymbols();
                formatSymbols.setDecimalSeparator('.');
                formatSymbols.setCurrencySymbol(",");
                DecimalFormat df =
                    new DecimalFormat("###.##0,00", formatSymbols);
                return df.format(num);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return number.toString();
    }

    public static String decimalFormat(Object number) {
        if (number != null && !number.toString().trim().equals("")) {
            try {
                Double num = Double.parseDouble(number.toString());
                DecimalFormatSymbols formatSymbols =
                    new DecimalFormatSymbols();
                formatSymbols.setDecimalSeparator(',');
                //formatSymbols.setGroupingSeparator('.');
                formatSymbols.setCurrencySymbol(".");
                DecimalFormat df =
                    new DecimalFormat("###.##0,00", formatSymbols);
                // DecimalFormat df = new DecimalFormat("###.###,##",formatSymbols);


                return df.format(num);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return number.toString();
    }

    public static String intFormat(Object number) {
        if (number != null && !number.toString().trim().equals("")) {
            try {
                Double num = Double.parseDouble(number.toString());
                DecimalFormatSymbols formatSymbols =
                    new DecimalFormatSymbols();
                //formatSymbols.setDecimalSeparator(',');
                formatSymbols.setCurrencySymbol(".");
                DecimalFormat df =
                    new DecimalFormat("###.##0,##", formatSymbols);
                return df.format(num);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return number.toString();
    }
    
    

    /*funci�n para validar que una cadena de car�cter es n�merica */
    /* public static boolean isNumeric(String cadena){
            try {
                    Integer.parseInt(cadena);
                    return true;
            } catch (NumberFormatException nfe){
                    return false;
            }
    }*/

    public static String formatNumber(Object moneyInCents) {
        Double num = Double.parseDouble(moneyInCents.toString());
        String format;
        Number value;
        if (num % 100 == 0) {
            format = "%d";
            value = num / 100;
        } else {
            format = "%.2f";
            value = num / 100.0;
        }
        return String.format(Locale.US, format, value);
    }

    public static boolean isNumeric(String str) {
        return (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("") == false);
    }

    public static String getRegexNumeroConDecimales() {
        return regexNumeroConDecimales;
    }
}
