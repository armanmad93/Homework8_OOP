package com.company.painter.trianglePainter;

import com.company.enums.Color;
import com.company.model.triangle.Triangle;
import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

public class TriangleFigurePainterLeft extends TriangleFigurePainter {

    public TriangleFigurePainterLeft() {
    }

    public TriangleFigurePainterLeft(String image) {
        super(image);
    }

    @Override
    public FigurePainter paint(Triangle triangle) {

        StringBuilder stringBuilder = new StringBuilder();

        int coordinateX = triangle.getPoint().getCoordinateX();
        int coordinateY = triangle.getPoint().getCoordinateY();
        int side = triangle.getSide();
        Color color = triangle.getColor();

        int count = coordinateX;
        boolean term = false;

        for (int i = 0; i < side + coordinateY; i++) {

            for (int j = 0; j < side + coordinateX; j++) {

                if (j >= coordinateX && i >= coordinateY && count >= j) {
                    stringBuilder.append(color.getColor()).append("* ");
                    term = true;
                } else {
                    stringBuilder.append(" ");
                }

            }

            if (term) {
                count++;
            }

            stringBuilder.append("\n");

        }

        return new TriangleFigurePainterLeft(stringBuilder.toString());

    }

}
