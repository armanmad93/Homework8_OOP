package com.company.model.rhombus;

import com.company.enums.Color;
import com.company.painter.FigurePainter;
import com.company.painter.rhombusPainter.RhombusFigurePainterMiddle;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public class RhombusMiddle extends Rhombus {

    public RhombusMiddle() {
    }

    public RhombusMiddle(int side) {
        super(side);
    }

    public RhombusMiddle(Point point, int side) {
        super(point, side);
    }

    public RhombusMiddle(Point point, Color color, int side) {
        super(point, color, side);
    }

    @Override
    public FigurePainter doPicture() {
        return new RhombusFigurePainterMiddle().paint(this);
    }

}
