package com.soaint.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Valida si es correcta la dirección de correo electrónica dada.
 *@param email
 *@return true si es correcta o false si no lo es.
 */

public class CorreoUtil {
    public CorreoUtil() {
        super();
    }

    public static boolean esEmailCorrecto(String email) {

        boolean valido = false;

        Pattern patronEmail =
            Pattern.compile("[a-zA-Z0-9]+[.[a-zA-Z0-9_-]+]*@[a-z0-9][\\w\\.-]*[a-z0-9]\\.[a-z][a-z\\.]*[a-z]$");

        Matcher mEmail = patronEmail.matcher(email.toLowerCase());
        if (mEmail.matches()) {
            valido = true;
        }
        return valido;
    }
}

