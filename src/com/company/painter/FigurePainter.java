package com.company.painter;

/**
 * @author Arman Karapetyan
 */

public abstract class FigurePainter {

    protected String image;

    public FigurePainter() {
    }

    public FigurePainter(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

}
