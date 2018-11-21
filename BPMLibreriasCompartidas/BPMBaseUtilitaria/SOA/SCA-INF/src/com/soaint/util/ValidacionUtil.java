package com.soaint.util;

public class ValidacionUtil {
    private String TipoIdentificacion;
    private String humanTask;

    public ValidacionUtil() {
        super();
    }

    /**
     * @param TipoIdentificacion = El Tipo de Identificacion del R. I. F. o Cedula
     * @return Boolean true si es un Tipo de identificador Juridico
     */
    public static boolean esJuridico(String TipoIdentificacion) {

        boolean valido = false;
        TipoIdentificacion = TipoIdentificacion.toUpperCase();
        TipoIdentificacion = TipoIdentificacion.trim();
        if (TipoIdentificacion.equals("J") || // Juridicos
            TipoIdentificacion.equals("G") || // Jurídicos Gobierno
            TipoIdentificacion.equals("R")) // Firmas personales
        {
            valido = true;
        }
        return valido;
    }

    /**
     * @param TipoIdentificacion = El Tipo de Identificacion del R. I. F. o Cedula
     * @return Boolean true si es un Tipo de identificador Natural
     */
    public static boolean esNatural(String TipoIdentificacion) {
        boolean valido = false;
        TipoIdentificacion = TipoIdentificacion.trim();
        TipoIdentificacion = TipoIdentificacion.toUpperCase();
        if (TipoIdentificacion.equals("V") || // Venezolano
            TipoIdentificacion.equals("E") || // Extranjero
            TipoIdentificacion.equals("P")) // Pasaporte
        {
            valido = true;
        }
        return valido;
    }

    /**
     * @param humanTask = El Tipo de Identificacion del R. I. F. o Cedula
     * @return Boolean true si es un Tipo de identificador Natural
     */
    public static boolean esPreliminar(String humanTask) {
        boolean valido = false;
        humanTask = humanTask.trim();
        humanTask = humanTask.toUpperCase();
        if (humanTask.equals("PRELIMINAR")) // Preliminar
        {
            valido = true;
        }
        return valido;
    }

    public static boolean esVerificacionInformacion(String humanTask) {
        boolean valido = false;
        humanTask = humanTask.trim();
        humanTask = humanTask.toUpperCase();
        if (humanTask.equals("VERIFICACION") ||
            humanTask.equals("VERIFICACION INFORMACION") ||
            humanTask.equals("VERIFICACION DE INFORMACION") ||
            humanTask.equals("VERIFICACIONINFORMACION")) // Verificacion
        {
            valido = true;
        }
        return valido;
    }

    public static boolean esGarantia(String humanTask) {
        boolean valido = false;
        humanTask = humanTask.trim();
        humanTask = humanTask.toUpperCase();
        if (humanTask.equals("GARANTIA") ||
            humanTask.equals("GARANTIA AFILIACION") ||
            humanTask.equals("GARANTIA MODIFICACION") ||
            humanTask.equals("GARANTIA CREACION") ||
            humanTask.equals("GARANTIAAFILIACION") ||
            humanTask.equals("GARANTIAMODIFICACION") ||
            humanTask.equals("GARANTIACREACION")) // Garantia
        {
            valido = true;
        }
        return valido;
    }

    public static boolean esRegistrarEstadosFinancieros(String humanTask) {
        boolean valido = false;
        humanTask = humanTask.trim();
        humanTask = humanTask.toUpperCase();
        if (humanTask.equals("REGISTRARESTADOSFINANCIEROS") ||
            humanTask.equals("REGISTRAR ESTADOS FINANCIEROS") ||
            humanTask.equals("RESTADOSFINANCIEROS") ||
            humanTask.equals("RESTADOS FINANCIEROS") ||
            humanTask.equals("VACIADO ESTADOS FINANCIEROS") ||
            humanTask.equals("VACIADOESTADOSFINANCIEROS") ||
            humanTask.equals("VACIADO")) // Vaciado de Estados Financieros
        {
            valido = true;
        }
        return valido;
    }

    public static boolean esResumenEstadosFinancieros(String humanTask) {
        boolean valido = false;
        humanTask = humanTask.trim();
        humanTask = humanTask.toUpperCase();
        if (humanTask.equals("RESUMENESTADOSFINANCIEROS") ||
            humanTask.equals("RESUMEN ESTADOS FINANCIEROS") ||
            humanTask.equals("RESUMEN DE ESTADOS FINANCIEROS") ||
            humanTask.equals("RESUMEN")) // Resumen de Estados Financieros
        {
            valido = true;
        }
        return valido;
    }

    public static boolean esProyeccionCapacidadPago(String humanTask) {
        boolean valido = false;
        humanTask = humanTask.trim();
        humanTask = humanTask.toUpperCase();
        if (humanTask.equals("PROYECCION DE CAPACIDAD DE PAGO") ||
            humanTask.equals("PROYECCION CAPACIDAD DE PAGO") ||
            humanTask.equals("PROYECCION CAPACIDAD PAGO") ||
            humanTask.equals("PROYECCION DE LA CAPACIDAD DE PAGO") ||
            humanTask.equals("CAPACIDAD DE PAGO") ||
            humanTask.equals("CAPACIDAD PAGO") ||
            humanTask.equals("PROYECCIONDECAPACIDADDEPAGO") ||
            humanTask.equals("PROYECCIONCAPACIDADDEPAGO") ||
            humanTask.equals("PROYECCIONCAPACIDADPAGO") ||
            humanTask.equals("PROYECCIONDELACAPACIDADDEPAGO") ||
            humanTask.equals("CAPACIDADDEPAGO") ||
            humanTask.equals("CAPACIDADPAGO") ||
            humanTask.equals("PROYECCION")) // Resumen de Estados Financieros
        {
            valido = true;
        }
        return valido;
    }


    public void setTipoIdentificacion(String TipoIdentificacion) {
        this.TipoIdentificacion = TipoIdentificacion;
    }

    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setHumanTask(String humanTask) {
        this.humanTask = humanTask;
    }

    public String getHumanTask() {
        return humanTask;
    }
}
