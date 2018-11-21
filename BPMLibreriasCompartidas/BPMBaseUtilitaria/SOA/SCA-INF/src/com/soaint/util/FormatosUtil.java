package com.soaint.util;

public class FormatosUtil {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;

    public FormatosUtil() {
        super();
    }

    /**
     *
     * @param primerNombre = Primer Nombre
     * @param segundoNombre = Segundo Nombre
     * @param primerApellido = Primer Apellido
     * @param segundoApellido = Segundo Apellido
     * @return Nombre Concatenado segundo los datos o informacion recibida.
     */
    public static String armarNombre(String primerNombre, String segundoNombre,
                                     String primerApellido,
                                     String segundoApellido) {

        return (StringUtil.existe(primerNombre) ? primerNombre : "") + " " +
            (StringUtil.existe(segundoNombre) ? segundoNombre : "") + " " +
            (StringUtil.existe(primerApellido) ? primerApellido : "") + " " +
            (StringUtil.existe(segundoApellido) ? segundoApellido : "").trim();
    }

    public static String armarNombre(String primerNombre,
                                     String primerApellido) {

        return (StringUtil.existe(primerNombre) ? primerNombre : "") + " " +
            (StringUtil.existe(primerApellido) ? primerApellido : "").trim();
    }


    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }
}
