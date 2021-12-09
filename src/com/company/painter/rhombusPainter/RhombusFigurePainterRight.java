package com.company.painter.rhombusPainter;

import com.company.enums.Color;
import com.company.model.rhombus.Rhombus;
import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

public class RhombusFigurePainterRight extends RhombusFigurePainter {

    public RhombusFigurePainterRight() {
    }

    public RhombusFigurePainterRight(String image) {
        super(image);
    }

    @Override
    public FigurePainter paint(Rhombus rhombus) {

        StringBuilder stringBuilder = new StringBuilder();

        int coordinateX = rhombus.getPoint().getCoordinateX();
        int coordinateY = rhombus.getPoint().getCoordinateY();
        int side = rhombus.getSide();
        Color color = rhombus.getColor();

        for (int j = 0; j < coordinateY; j++) {
            stringBuilder.append("\n");
        }

        for (int i = 0; i < side; i++) {

            for (int j = 1; j < side - i + coordinateX; j++) {
                stringBuilder.append(" ");
            }

            for (int j = 1; j <= side; j++) {
                stringBuilder.append(color.getColor()).append("* ");
            }
            stringBuilder.append("\n");

        }

        return new RhombusFigurePainterRight(stringBuilder.toString());

    }

}
