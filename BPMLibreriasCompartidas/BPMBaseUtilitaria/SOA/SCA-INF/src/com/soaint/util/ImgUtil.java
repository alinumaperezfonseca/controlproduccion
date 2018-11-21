package com.soaint.util;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgUtil {
    public ImgUtil() {
        super();
    }

    public static Boolean salvarFileToImage(File file, String extension,
                                            String path) {
        BufferedImage image;
        Boolean res = false;
        try {
            image = ImageIO.read(file);
            res = ImageIO.write(image, extension, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return res;
    }

    public static Boolean saveImage(BufferedImage image, String extension,
                                    String path) {
        Boolean res = false;
        try {
            res = ImageIO.write(image, extension, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return res;
    }

    public static BufferedImage fileToImage(File fila) {
        BufferedImage img;
        try {
            img = ImageIO.read(fila);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return img;
    }

    public static BufferedImage resizeImage(String path, String ext,
                                            int maxWidth) {
        BufferedImage resizedImage = null;
        try {
            File srcfile = new File(path);
            BufferedImage src = ImageIO.read(srcfile);
            Float escala;
            Integer newWith;
            Integer newHeigth;

            escala = (new Float(maxWidth)).floatValue() / src.getWidth();
            newWith =
                    new Double(Math.ceil(escala * src.getWidth())).intValue();
            newHeigth =
                    new Double(Math.ceil(escala * src.getHeight())).intValue();

            resizedImage =
                    new BufferedImage(newWith, newHeigth, BufferedImage.TYPE_INT_RGB);

            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(src, 0, 0, newWith, newHeigth, null);
            g.dispose();
            g.setComposite(AlphaComposite.Src);

            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                               RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setRenderingHint(RenderingHints.KEY_RENDERING,
                               RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                               RenderingHints.VALUE_ANTIALIAS_ON);

            FileOutputStream out = new FileOutputStream(path);
            ImageIO.write(resizedImage, ext.replace(".", ""), out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return resizedImage;
    }

}
