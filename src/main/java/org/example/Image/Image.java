package org.example.Image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;

public class Image implements Closeable {

    private final BufferedImage image;
    private final Graphics2D graphics2D;

    public Image (int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        graphics2D = image.createGraphics();
    }

    public void plotPixel (int x, int y, ImageColor color) {
        graphics2D.setPaint(new Color(color.getR(), color.getG(), color.getB()));
        graphics2D.fillRect(x, y, 1, 1);
    }

    public void savefile (Path filepath) throws IOException {
        ImageIO.write(image, "PNG", filepath.toFile());
    }

    @Override
    public void close() throws IOException {
        graphics2D.dispose();
    }
}
