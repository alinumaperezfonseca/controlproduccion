package com.soaint.util;

import java.util.HashMap;
import java.util.Map;

public class ExtensionUtil {
    public static final String PDF_FILE = "pdf";
    public static final String PNG_FILE = "png";
    public static final String JPEG_FILE = "jpeg";
    public static final String GIF_FILE = "gif";
    public static final String TIFF_FILE = "tiff";
    public static final String TIF_FILE = "tif";

    public static final String PDF_MINE_TYPE = "application/pdf";
    public static final String PNG_MINE_TYPE = "image/png";
    public static final String JPEG_MINE_TYPE = "image/jpeg";
    public static final String GIF_MINE_TYPE = "image/gif";
    public static final String BMP_MINE_TYPE = "image/bmp";
    public static final String TIFF_MINE_TYPE = "image/tiff";
    public static final String TIF_MINE_TYPE = "image/bmp";
    public static final String BINARIO_MINE_TYPE = "application/octet-stream";

    public static final Map<String, String> tipos =
        new HashMap<String, String>();
    static {
        ExtensionUtil.tipos.put(ExtensionUtil.JPEG_MINE_TYPE, ".jpeg");
        ExtensionUtil.tipos.put(ExtensionUtil.PNG_MINE_TYPE, ".png");
        ExtensionUtil.tipos.put(ExtensionUtil.BMP_MINE_TYPE, ".png");
        ExtensionUtil.tipos.put(ExtensionUtil.GIF_MINE_TYPE, ".gif");
        ExtensionUtil.tipos.put(ExtensionUtil.PDF_MINE_TYPE, ".pdf");
        ExtensionUtil.tipos.put(ExtensionUtil.TIFF_MINE_TYPE, ".tiff");
        ExtensionUtil.tipos.put(ExtensionUtil.TIF_MINE_TYPE, ".tiff");
    }

    public static String getFileTypeByName(String path) {
        String ext = path.substring(path.indexOf("."));
        return ext;
    }

    public static String getFileExtensionByMineType(String mineType) {
        String typeVal = ExtensionUtil.tipos.get(mineType);
        return typeVal;
    }
}
