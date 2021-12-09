package com.company.image;

import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

import java.util.List;

public class ImageGallery {

    public List<FigurePainter> images;

    public ImageGallery(List<FigurePainter> images) {
        this.images = images;
    }

    public void show() {
        for (FigurePainter image : images) {
            System.out.println(image.getImage());
        }
    }

}
