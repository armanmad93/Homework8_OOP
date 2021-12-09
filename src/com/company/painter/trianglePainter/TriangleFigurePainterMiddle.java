package com.company.painter.trianglePainter;

import com.company.enums.Color;
import com.company.model.triangle.Triangle;
import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

public class TriangleFigurePainterMiddle extends TriangleFigurePainter {

    public TriangleFigurePainterMiddle() {
    }

    public TriangleFigurePainterMiddle(String image) {
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
            for (int j = side - i + coordinateX; j > 1; j--) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(color.getColor()).append("* ");
            }
            stringBuilder.append("\n");
        }

        return new TriangleFigurePainterMiddle(stringBuilder.toString());

    }

}
