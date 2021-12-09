package com.company.painter.rhombusPainter;

import com.company.enums.Color;
import com.company.model.rhombus.Rhombus;
import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

public class RhombusFigurePainterMiddle extends RhombusFigurePainter {

    public RhombusFigurePainterMiddle() {
    }

    public RhombusFigurePainterMiddle(String image) {
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

        //copy , dont understand :(
        int space = side - 1;

        for (int j = 1; j <= side; j++) {

            for (int i = 1; i <= space + coordinateX + 1; i++) {
                stringBuilder.append(" ");
            }

            space--;

            for (int i = 1; i <= 2 * j - 1; i++) {
                stringBuilder.append(color.getColor()).append("*");
            }

            stringBuilder.append("\n");

        }

        space = 1;

        for (int j = 1; j <= side - 1; j++) {

            for (int i = 1; i <= space + coordinateX + 1; i++) {
                stringBuilder.append(" ");
            }

            space++;

            for (int i = 1; i <= 2 * (side - j) - 1; i++) {
                stringBuilder.append(color.getColor()).append("*");
            }

            stringBuilder.append("\n");

        }

        return new RhombusFigurePainterMiddle(stringBuilder.toString());

    }

}
