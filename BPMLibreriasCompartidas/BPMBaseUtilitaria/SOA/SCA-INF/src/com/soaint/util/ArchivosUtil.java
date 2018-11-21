package com.soaint.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Iterator;
import java.util.List;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class ArchivosUtil {
    public ArchivosUtil() {
    }

    public static Boolean createDir(String path) {
        File dir = new File(path);
        boolean result = false;
        if (!dir.exists()) {
            result = dir.mkdirs();
        }
        return result;
    }

    public static void infoDir(String path) {
        File dir = new File(path);
        System.out.println("Nombre :" + dir.getName());
        System.out.println("Path :" + dir.getAbsolutePath());
    }

    public static Boolean deleteDirectorios(List<String> paths) {
        int cantErr = 0;
        Iterator<String> it = paths.iterator();
        while (it.hasNext()) {
            String path = it.next();
            Boolean res = ArchivosUtil.deleteDir(path);
            if (!res) {
                cantErr++;
            }

        }
        if (paths.size() <= cantErr) {
            return false;
        }
        return true;
    }

    public static Boolean deleteDir(String path) {
        File dir = new File(path);
        boolean result = false;
        if (dir.exists()) {
            if (dir.isDirectory() && dir.list().length > 0) {
                String files[] = dir.list();
                for (String temp : files) {
                    File fileDelete = new File(dir, temp);
                    result=ArchivosUtil.deleteDir(fileDelete.getAbsolutePath());
                    if(!result){
                        break;
                    }
                }
                if (dir.list().length == 0) {
                    result = dir.delete();
                }
            } else {
                result = dir.delete();
            }
        }
        return result;
    }
    public static Boolean deleteFile(String file){
        if(file!=null && !file.equals("")){
          return false;  
        }
        File archivo=new File(file);
        return ArchivosUtil.deleteFile(archivo);
    }
    public static Boolean deleteFile(File file){
        Boolean res=false;
        if(file.exists()){
            res=file.delete();
        }
        return res;
    }
    private static void validateFolder(String path){
        String folderPath=path.substring(0,path.lastIndexOf(File.separator));
        File dir= new File(folderPath);
        if(!dir.exists()){            
           dir.mkdirs();
        }
    }
    public static String getFileNameByPath(String path){
        String res= path.substring(path.lastIndexOf(File.separator=="\\"?"\\":File.separator)+1);
        return res;
    }

    public static Boolean moverArchivo(String pathAct, String newPath) {
        File fileOld = new File(pathAct);
        try {
            File res = ArchivosUtil.saveFile(fileOld, newPath);
            if (res != null) {
                if (ArchivosUtil.deleteFile(fileOld)) {
                    return true;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }

    public static File saveFile(File file, String path) {
        try {
            return ArchivosUtil.saveFile(new FileInputStream(file), path);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static File saveFile(UploadedFile file, String path) {
        try {
            return ArchivosUtil.saveFile(file.getInputStream(), path);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static File saveFile(InputStream in, String path) {
        FileOutputStream out = null;
        ArchivosUtil.validateFolder(path);
        try {
            out = new FileOutputStream(path);

            byte[] buffer = new byte[1024];
            int bytesRead;
            bytesRead = in.read(buffer);
            do {
                out.write(buffer, 0, bytesRead);
                bytesRead = in.read(buffer);
            } while (bytesRead != -1);

            out.flush();
            //out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return new File(path);
    }
}
