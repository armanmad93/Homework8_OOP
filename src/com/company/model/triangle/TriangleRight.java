package com.company.model.triangle;

import com.company.enums.Color;
import com.company.painter.FigurePainter;
import com.company.painter.trianglePainter.TriangleFigurePainterRight;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public class TriangleRight extends Triangle {

    public TriangleRight() {
    }

    public TriangleRight(int side) {
        super(side);
    }

    public TriangleRight(Point point, int side) {
        super(point, side);
    }

    public TriangleRight(Point point, Color color, int side) {
        super(point, color, side);
    }

    @Override
    public FigurePainter doPicture() {
        return new TriangleFigurePainterRight().paint(this);
    }

}
