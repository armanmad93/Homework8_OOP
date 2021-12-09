package com.company.model.triangle;

import com.company.enums.Color;
import com.company.painter.FigurePainter;
import com.company.painter.trianglePainter.TriangleFigurePainterMiddle;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public class TriangleMiddle extends Triangle {

    public TriangleMiddle() {
    }

    public TriangleMiddle(int side) {
        super(side);
    }

    public TriangleMiddle(Point point, int side) {
        super(point, side);
    }

    public TriangleMiddle(Point point, Color color, int side) {
        super(point, color, side);
    }

    @Override
    public FigurePainter doPicture() {
        return new TriangleFigurePainterMiddle().paint(this);
    }

}
