package com.company.painter.trianglePainter;

import com.company.enums.Color;
import com.company.model.triangle.Triangle;
import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

public class TriangleFigurePainterRight extends TriangleFigurePainter {

    public TriangleFigurePainterRight() {
    }

    public TriangleFigurePainterRight(String image) {
        super(image);
    }

    @Override
    public FigurePainter paint(Triangle triangle) {

        StringBuilder stringBuilder = new StringBuilder();

        int coordinateX = triangle.getPoint().getCoordinateX();
        int coordinateY = triangle.getPoint().getCoordinateY();
        int side = triangle.getSide();
        Color color = triangle.getColor();

        for (int j = 0; j < coordinateY; j++) {
            stringBuilder.append("\n");
        }

        for (int i = 0; i < side; i++) {

            for (int j = 2 * (side - i) + coordinateX - 3; j >= 0; j--) {
                stringBuilder.append(" ");
            }

            for (int j = 0; j <= i; j++) {
                stringBuilder.append(color.getColor()).append("* ");
            }
            stringBuilder.append("\n");

        }

        return new TriangleFigurePainterRight(stringBuilder.toString());

    }

}
