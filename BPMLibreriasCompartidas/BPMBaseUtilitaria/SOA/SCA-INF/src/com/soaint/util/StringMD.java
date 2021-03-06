package com.soaint.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Herman Alonso Barrates V�quez
 */
public class StringMD {
    private String prefijo;
    //algoritmos
    public static final String MD2 = "MD2";
    public static final String MD5 = "MD5";
    public static final String SHA1 = "SHA-1";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";

    /***
     * Convierte un arreglo de bytes a String usando valores hexadecimales
     * @param digest arreglo de bytes a convertir
     * @return String creado a partir de <code>digest</code>
     */
    private String toHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1)
                hash += "0";
            hash += Integer.toHexString(b);
        }
        return hash;
    }

    /***
     * Encripta un mensaje de texto mediante algoritmo de resumen de mensaje.
     * @param message texto a encriptar
     * @param algorithm algoritmo de encriptacion, puede ser: MD2, MD5, SHA-1, SHA-256, SHA-384, SHA-512
     * @return mensaje encriptado
     */
    public String getStringMessageDigest(String message, String algorithm) {
        byte[] digest = null;
        byte[] buffer = message.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.reset();
            messageDigest.update(buffer);
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error creando Digest");
        }
        return this.toHexadecimal(digest);
    }

    public Boolean validarAlgorith(String val) {
        String[] algs =
        { "MD2", "MD5", "SHA-1", "SHA-256", "SHA-384", "SHA-512" };
        for (int i = 0; i < algs.length; i++) {
            String temp = algs[i];
            if (temp.equals(val)) {
                return true;
            }
        }
        return false;
    }

    public String convertMsj(String msj) {
        String temp = this.prefijo + msj;
        Integer punto = temp.length() / 2;
        temp = temp.substring(punto, temp.length()) + temp.substring(0, punto);
        return temp;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getPrefijo() {
        return prefijo;
    }
}
