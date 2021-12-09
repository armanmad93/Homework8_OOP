package com.company.model.rhombus;

import com.company.enums.Color;
import com.company.painter.FigurePainter;
import com.company.painter.rhombusPainter.RhombusFigurePainterLeft;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public class RhombusLeft extends Rhombus {

    public RhombusLeft() {
    }

    public RhombusLeft(int side) {
        super(side);
    }

    public RhombusLeft(Point point, int side) {
        super(point, side);
    }

    public RhombusLeft(Point point, Color color, int side) {
        super(point, color, side);
    }

    @Override
    public FigurePainter doPicture() {
        return new RhombusFigurePainterLeft().paint(this);
    }

}
