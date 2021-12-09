package com.company.painter.trianglePainter;

import com.company.model.triangle.Triangle;
import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

public abstract class TriangleFigurePainter extends FigurePainter {

    public TriangleFigurePainter() {
    }

    public TriangleFigurePainter(String image) {
        super(image);
    }

    public abstract FigurePainter paint(Triangle triangle);

}
