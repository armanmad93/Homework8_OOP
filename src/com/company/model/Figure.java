package com.company.model;

import com.company.enums.Color;
import com.company.painter.FigurePainter;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public abstract class Figure {

    protected Point point;
    protected Color color;

    public abstract FigurePainter doPicture();

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
