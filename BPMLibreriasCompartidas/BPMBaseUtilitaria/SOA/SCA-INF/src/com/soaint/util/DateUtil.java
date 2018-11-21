package com.soaint.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {
    public static final String FORMATO_FECHA = "dd/MM/yyyy";
    public static final String FORMATO_FECHA_MES_DIA = "MM/dd/yyyy";
    public static final String FORMATO_FECHA_SOA =
        "yyyy-MM-dd'T'HH:mm:ss"; // formato que se planea usar: "yyyy-MM-dd";
    public static final String FORMATO_FECHA_SOA_MERNCANTIL = "yyyy-MM-dd";
    public static final String FORMATO_TIMESTAMP_SOA = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String FORMATO_TIMESTAMP_TIMEZONE_SOA =
        "yyyy-MM-ddHH:mm:ss-SS:SS";
    public static final String FORMATO_FECHA_LARGA = "dd/MM/yyyy HH:mm:ss";
    public static final String FORMATO_FECHA_GARANTIA = "yyyyMMdd";

    public DateUtil() {
        super();
    }
    
    /*
     * @autor Saul Valecillos
    */
    public static String cambiarFormatoFecha(String fecha) throws ParseException {
        
        SimpleDateFormat parseador = new SimpleDateFormat(FORMATO_FECHA);
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA_MES_DIA);
        Date date = parseador.parse(fecha);
        return formateador.format(date);
    }
    
    public static Boolean isFechaMayor(String fecha1,
                                       String fecha2) throws ParseException {
        DateFormat format = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        if (!fecha1.equals(fecha2)) {
            Date fechaF1 = format.parse(fecha1);
            Date fechaF2 = format.parse(fecha2);
            return fechaF2.before(fechaF1);
        }
        return true;
    }
    
    //TODO jeam20170510-i 
    // Se incluye metodo para manejo de fechas
    public static String converFormatToDateStringSOA(String fecha) throws ParseException {
            DateFormat fechaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
            Date valorfecha = fechaFormat.parse(fecha);
            DateFormat fechaSalidaFormat =
                new SimpleDateFormat(DateUtil.FORMATO_FECHA_GARANTIA);
            return fechaSalidaFormat.format(valorfecha);
        }
    //TODO jeam20170510-f 

    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }
    
    public static String getHoraActualGarantia() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hhmmss");
        return formateador.format(ahora);
    }

    public static Boolean isFechaMayorAldia(String fecha1) throws ParseException {
        DateFormat format = new SimpleDateFormat(DateUtil.FORMATO_FECHA);

        if (!fecha1.trim().equals(DateUtil.hoyFechaToString().trim())) {
            Date fechaF1 = format.parse(fecha1);
            Date hoy = new Date();
            return hoy.before(fechaF1);
        }
        return false;
    }

    public static String hoyFechaToSOA() {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        return soaFormat.format(new Date());
    }
    
    public static String hoyFechaToSOAMercantil() {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA_MERNCANTIL);
        return soaFormat.format(new Date());
    }
    
    public static String hoyFechaToSOAGarantia() {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_GARANTIA);
        return soaFormat.format(new Date());
    }
    

    public static String xmlGregorianCalendarToString(XMLGregorianCalendar fecha) {
        Date temp = fecha.toGregorianCalendar().getTime();
        DateFormat soaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        return soaFormat.format(temp);
    }

    public static String hoyFechaToString() {
        DateFormat soaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        return soaFormat.format(new Date());
    }

    public static String hoyFechaToStringLarga() {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_LARGA);
        return soaFormat.format(new Date());
    }

    public static String converFormatDateToSOA(Date fecha) throws ParseException {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        return soaFormat.format(fecha);
    }

    public static String converFormatDateModifiedToSOA(Date fecha) throws ParseException {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        return soaFormat.format(fecha);
    }

    public static Date converFormatTraditionaltoDate(String fecha) throws ParseException {
        DateFormat soaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        return soaFormat.parse(fecha);
    }

    public static Date converFormatSOAtoDate(String fecha) throws ParseException {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        return soaFormat.parse(fecha);
    }

    public static Date converFormatSOAtoDateGarantia(String fecha) throws ParseException {
        DateFormat garantiaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_GARANTIA);
        return garantiaFormat.parse(fecha);
    }
    
    public static String converFormatDateToSOA(String fecha,
                                               String formato) throws ParseException {
        DateFormat format;
        if (formato == null)
            format = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        else
            format = new SimpleDateFormat(formato);

        Date fechaF = format.parse(fecha);

        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        return soaFormat.format(fechaF);
    }
    
    public static String converFormatDateToSOAMercantil(String fecha,
                                               String formato) throws ParseException {
        DateFormat format;
        if (formato == null)
            format = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        else
            format = new SimpleDateFormat(formato);

        Date fechaF = format.parse(fecha);

        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA_MERNCANTIL );
        return soaFormat.format(fechaF);
    }

    public static String converFormatSOAtoDateString(String fecha) throws ParseException {
        DateFormat fechaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA_GARANTIA);
        Date valorfecha = fechaFormat.parse(fecha);
        DateFormat fechaSalidaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        return fechaSalidaFormat.format(valorfecha);
    }
    //Funci�n para quitar los slash de las fechas y convertirlos a yyyymmdd - Yelitza Repillosa
    public static String converFormatToSOAString(String fecha) throws ParseException {
        DateFormat fechaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        Date valorfecha = fechaFormat.parse(fecha);
        DateFormat fechaSalidaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA_GARANTIA);
        return fechaSalidaFormat.format(valorfecha);
    }

    public static String converFormatSOAToNormal(String fecha) throws ParseException {
        if (fecha == null)
            return "";
        DateFormat format = new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        Date fechaF = format.parse(fecha);
        DateFormat soaFormat = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        return soaFormat.format(fechaF);
    }

    public static String converFormaToSOA(String fecha) throws ParseException {
        if (fecha == null)
            return "";
        DateFormat format = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        Date fechaF = format.parse(fecha);


        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        return soaFormat.format(fechaF);
    }

    public static String converFormaModifiedToSOA(String fecha) throws ParseException {
        if (fecha == null)
            return "";
        DateFormat format = new SimpleDateFormat(DateUtil.FORMATO_FECHA);
        Date fechaF = format.parse(fecha);

        GregorianCalendar gc = new GregorianCalendar();

        gc.setTime(fechaF);
        gc.add(Calendar.YEAR, -1);
        Date result = gc.getTime();

        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA);
        return soaFormat.format(result);
    }

    public static GregorianCalendar stringToGregorianCalendar(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date date = sdf.parse(dateString);
        GregorianCalendar calender = new GregorianCalendar();
        calender.setTime(date);
        return calender;
    }

    public static String converTimeStampToSOA(Date fecha) throws ParseException {
        DateFormat soaFormat =
            new SimpleDateFormat(DateUtil.FORMATO_TIMESTAMP_SOA);
        return soaFormat.format(fecha);
    }

    public static XMLGregorianCalendar stringToXMLGregorianCalendar(String valor) throws ParseException,
                                                                                         DatatypeConfigurationException {
        SimpleDateFormat sdf =
            new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA_MERNCANTIL) /*DateUtil.FORMATO_FECHA*/; //comentando el formato original, colocando formato usado para la EPD 12/4/2016
        Date date = sdf.parse(valor);
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(date);
        XMLGregorianCalendar calendar =
            DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        return calendar;
    }

    public static XMLGregorianCalendar dateToXMLGregorianCalendar(Date fecha) throws ParseException,
                                                                                     DatatypeConfigurationException {
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(fecha);
        XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        return calendar;
    }

    public static String getFormatoFechaLargo(Date fecha) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(fecha);
        String res =
            DateUtil.getDiaCalendar(cal.get(GregorianCalendar.DAY_OF_WEEK)) +
            " " + cal.get(GregorianCalendar.DAY_OF_MONTH) + " de " +
            DateUtil.getMesCalendar(cal.get(GregorianCalendar.MONTH)) +
            " del " + cal.get(GregorianCalendar.YEAR);
        return res;
    }

    public static String getFormatoHora(Date fecha) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(fecha);

        String min = cal.get(GregorianCalendar.MINUTE) + "";
        if (!(min.length() > 1)) {
            min = "0" + min;
        }
        String hour = cal.get(GregorianCalendar.HOUR) + "";
        if (!(hour.length() > 1)) {
            hour = "0" + hour;
        }
        String am_pm =
            cal.get(GregorianCalendar.HOUR_OF_DAY) >= 12 ? "PM" : "AM";
        String res = hour + ":" + min + " " + am_pm;
        return res;
    }

    public static String getMesCalendar(int mes) {
        Map<Integer, String> meses = new HashMap<Integer, String>();
        meses.put(GregorianCalendar.JANUARY, "Enero");
        meses.put(GregorianCalendar.FEBRUARY, "Febrero");
        meses.put(GregorianCalendar.MARCH, "Marzo");
        meses.put(GregorianCalendar.APRIL, "Abril");
        meses.put(GregorianCalendar.MAY, "Mayo");
        meses.put(GregorianCalendar.JUNE, "Junio");
        meses.put(GregorianCalendar.JULY, "Julio");
        meses.put(GregorianCalendar.AUGUST, "Agosto");
        meses.put(GregorianCalendar.SEPTEMBER, "Septiembre");
        meses.put(GregorianCalendar.OCTOBER, "Octubre");
        meses.put(GregorianCalendar.NOVEMBER, "Noviembre");
        meses.put(GregorianCalendar.DECEMBER, "Diciembre");
        return meses.get(mes);
    }

    public static String getDiaCalendar(int dia) {
        Map<Integer, String> dias = new HashMap<Integer, String>();
        dias.put(GregorianCalendar.MONDAY, "Lunes");
        dias.put(GregorianCalendar.TUESDAY, "Martes");
        dias.put(GregorianCalendar.WEDNESDAY, "Miercoles");
        dias.put(GregorianCalendar.THURSDAY, "Jueves");
        dias.put(GregorianCalendar.FRIDAY, "Viernes");
        dias.put(GregorianCalendar.SATURDAY, "Sabado");
        dias.put(GregorianCalendar.SUNDAY, "Domingo");
        return dias.get(dia);
    }
    public static XMLGregorianCalendar stringToXMLGregorianCalendarDate(String valor) throws ParseException,
                                                                                            DatatypeConfigurationException {
           SimpleDateFormat sdf =
               new SimpleDateFormat(DateUtil.FORMATO_FECHA_SOA_MERNCANTIL) /*DateUtil.FORMATO_FECHA*/; //comentando el formato original, colocando formato usado para la EPD 12/4/2016
           Date date = sdf.parse(valor);
           GregorianCalendar c = new GregorianCalendar();
           c.setTime(date);
           XMLGregorianCalendar calendar =
               DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED);
           
           return calendar;
       }

}
