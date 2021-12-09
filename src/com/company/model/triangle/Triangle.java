package com.company.model.triangle;

import com.company.enums.Color;
import com.company.exeption.IncorrectValueException;
import com.company.model.Figure;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public abstract class Triangle extends Figure {

    private static final int TRIANGLE_SIDE = 2;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    protected int side;

    public Triangle() {
        side = TRIANGLE_SIDE;
        color = DEFAULT_COLOR;
    }

    public Triangle(int side) {
        chack(side);
        color = DEFAULT_COLOR;
        this.side = side;
    }

    public Triangle(Point point, int side) {
        chack(side);
        color = DEFAULT_COLOR;
        this.point = point;
        this.side = side;
    }

    public Triangle(Point point, Color color, int side) {
        chack(side);
        this.point = point;
        this.color = color;
        this.side = side;
    }

    private void chack(int side) {
        if (side < 2) {
            throw new IncorrectValueException(String.format("side should be large 2 SIDE: %d", side));
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        chack(side);
        this.side = side;
    }

}
