package com.soaint.util;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.util.logging.Logger;

import sun.misc.IOUtils;


public class ConversorArchivos {

    private static java.util.logging.Logger logger = Logger.getAnonymousLogger();

    public ConversorArchivos() {
        super();
    }

    /**
     * Convierte un InputStream en un archivo que sera guardado en la ruta dada del File System.
     * @param inputStream.
     * @param rutaSalida.
     */
    public static File inputStreamAFile(InputStream inputStream,
                                        String rutaSalida) {
        File archivo = null;
        try {
            archivo = new File(rutaSalida);
            OutputStream outputStream = new FileOutputStream(archivo);
            outputStream.write(IOUtils.readFully(inputStream, -1, true));
            outputStream.close();
        } catch (IOException e) {
            logger.info("--------------------------------------------------------------------------------------------------");
            logger.info("No se ha ejecutar correctamente el metodo inputStreamAFile:");
            logger.info("*********************");
            e.printStackTrace();
            logger.info("*********************");
        }
        return archivo;
    }
    
    /**
     * Convierte un OutputStream en un archivo que sera guardado en la ruta dada del File System.
     * @param outputStream
     * @param rutaSalida .
     */
    public static File outputStreamAFile(OutputStream outputStream,
                                        String rutaSalida) {
        File archivo = null;
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(((ByteArrayOutputStream)outputStream).toByteArray());
            archivo = new File(rutaSalida);
            OutputStream outputStreamAux = new FileOutputStream(archivo);
            outputStreamAux.write(IOUtils.readFully(bais, -1, true));
            outputStreamAux.close();
        } catch (IOException e) {
            logger.info("--------------------------------------------------------------------------------------------------");
            logger.info("No se ha ejecutar correctamente el metodo outputStreamAFile:");
            logger.info("*********************");
            e.printStackTrace();
            logger.info("*********************");
        }
        return archivo;
    }

    /**
     * Borra un archivo del Filesystem si este existe.
     * @param fileName : Nombre del Archivo a borrar.
     */
    public static void deleteFile(String fileName) {
        try{
            File file = new File(fileName);
            if (file.exists())
                file.delete();
        }catch(Exception e){
            e.printStackTrace();  
        }
    }
    
    /**
     * Borra un archivo del Filesystem si este existe.
     * @param file : Archivo a borrar.
     */
    public static void deleteFile(File file) {
        try{
            if (file.exists())
                file.delete();
        }catch(Exception e){
            e.printStackTrace();  
        }
    }
}
