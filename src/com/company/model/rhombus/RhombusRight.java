package com.company.model.rhombus;

import com.company.enums.Color;
import com.company.painter.FigurePainter;
import com.company.painter.rhombusPainter.RhombusFigurePainterRight;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public class RhombusRight extends Rhombus {

    public RhombusRight() {
    }

    public RhombusRight(int side) {
        super(side);
    }

    public RhombusRight(Point point, int side) {
        super(point, side);
    }

    public RhombusRight(Point point, Color color, int side) {
        super(point, color, side);
    }

    @Override
    public FigurePainter doPicture() {
        return new RhombusFigurePainterRight().paint(this);
    }

}
