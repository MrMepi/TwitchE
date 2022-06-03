package com.twitche.twitche;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Utils {

    public static void cropImageAndSaveToFile(BufferedImage src, int w, int h, int x, int y, String name, int rX, int rY){
        try {
            BufferedImage dst = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            dst.getGraphics().drawImage(src, 0, 0, w, h, x, y, x + w, y + h, null);
            dst = resizeImage(dst, rX, rY);

            ImageIO.write(dst, "png", new File(name + rX + "x" + rY +".png"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Image cropImage(BufferedImage src, int w, int h, int x, int y, int rX, int rY) throws IOException {
        try {
            BufferedImage dst = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            dst.getGraphics().drawImage(src, 0, 0, w, h, x, y, x + w, y + h, null);
            dst = resizeImage(dst, rX,rY);

            return SwingFXUtils.toFXImage(dst, null);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight)  {
        java.awt.Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, java.awt.Image.SCALE_AREA_AVERAGING);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_4BYTE_ABGR_PRE);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        return outputImage;
    }
}
