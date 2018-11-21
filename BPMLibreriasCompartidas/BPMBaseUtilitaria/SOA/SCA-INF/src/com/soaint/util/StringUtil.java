package com.soaint.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;

public class StringUtil {
    public StringUtil() {
        super();
    }

    public static Map<String, String> processURIParams(String uri) {
        Map<String, String> params = new HashMap<String, String>();
        if (uri.contains("&")) {
            StringTokenizer tk = new StringTokenizer(uri, "&");
            while (tk.hasMoreElements()) {
                String item = tk.nextToken();
                String[] temp = item.split("=");
                params.put(temp[0], temp[1]);
            }
        } else if (uri.contains("=")) {
            String[] temp = uri.split("=");
            params.put(temp[0], temp[1]);
        }
        return params;
    }

    public static String remplaceParametros(String cadena,
                                            Map<String, String> parametros) {
        List<String> keys = new ArrayList<String>(parametros.keySet());
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            cadena.replaceAll(key, parametros.get(key));
        }
        return cadena;
    }

    public static boolean isValidEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat =
Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean existe(String valor) {
        return (valor != null && !valor.equals("")) ? true : false;
    }

    public static Boolean existe(Object valor) {
        return (valor != null && !valor.toString().equals("")) ? true : false;
    }

    public static Boolean existeBoolean(Object valor) {
        return (valor != null && valor.toString().equalsIgnoreCase("true")) ?
               true : false;
    }

    public static Boolean existeServicio(String valor) {
        return (valor != null && valor.equals("S")) ? true : false;
    }

    public static String capturaHoraNotificacion(String hora) {

        String fecha =
            hora.substring(hora.indexOf('T') + 1, hora.indexOf('T') + 6);
        return fecha;
    }

    public static String convertirAsteriscosCuenta(String valor,
                                                   int valorDesde,
                                                   int valorHasta) {
        int longitudValor = valor.length();
        String resultado = "";
        for (int i = valorDesde; i < valorHasta; i++) {
            resultado = "*" + resultado;
        }
        return (valor.substring(0, valorDesde)) + resultado +
            (valor.substring(valorHasta, longitudValor));

    }

    public static String aplicarMaskaraCuenta(String cuenta) {
        String res = "";
        String[] indices = new String[] { "4", "5", "1" };
        List<String> listaindice = new ArrayList<String>();
        listaindice.addAll(Arrays.asList(indices));
        char[] fuente = cuenta.toCharArray();
        int n = 0;
        for (int i = 0; i < fuente.length; i++) {
            res += fuente[i];
            String item = listaindice.get(0);
            n++;
            if (item.equals(n + "") && (i + 1) < fuente.length) {
                res += "-";
                n = 0;
                listaindice.remove(item);
            }
        }
        return res;
    }

    public static String completarCeros(String valor, Integer cantDigit) {
        if (valor.length() < cantDigit) {
            while (true) {
                valor = "0" + valor;
                if (valor.length() >= cantDigit) {
                    break;
                }
            }
        }
        return valor;
    }

    public static Boolean validarDato(String dato) { //metodo de prueba. intento para simplicar validacion de campos a los que se les aplica un metodo de conversion (ejm. fecha, numero, etc)  DB.
        if (dato != null && !dato.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean validateIsEmpty(Object object) {
        if (object != null) {
            if (object instanceof java.lang.String) {
                String var = (String)object;
                if (var.trim().isEmpty())
                    return true;
            } else if (object instanceof java.util.Date) {
                Date var = (Date)object;
                if (!(var != null && !var.toString().trim().isEmpty()))
                    return true;
            }

        } else
            return true;

        return false;
    }
}
