package com.company.model.triangle;

import com.company.enums.Color;
import com.company.painter.FigurePainter;
import com.company.painter.trianglePainter.TriangleFigurePainter;
import com.company.painter.trianglePainter.TriangleFigurePainterLeft;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public class TriangleLeft extends Triangle {

    public TriangleLeft() {
    }

    public TriangleLeft(int side) {
        super(side);
    }

    public TriangleLeft(Point point, int side) {
        super(point, side);
    }

    public TriangleLeft(Point point, Color color, int side) {
        super(point, color, side);
    }

    @Override
    public FigurePainter doPicture() {
        return new TriangleFigurePainterLeft().paint(this);
    }

}
