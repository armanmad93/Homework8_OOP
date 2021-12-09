package com.company.model.rhombus;

import com.company.enums.Color;
import com.company.exeption.IncorrectValueException;
import com.company.model.Figure;
import com.company.point.Point;

/**
 * @author Arman Karapetyan
 */

public abstract class Rhombus extends Figure {

    private static final int TRIANGLE_SIDE = 3;
    private static final Color DEFAULT_COLOR = Color.BLACK;

    protected int side;

    public Rhombus() {
        side = TRIANGLE_SIDE;
        color = DEFAULT_COLOR;
    }

    public Rhombus(int side) {
        chack(side);
        color = DEFAULT_COLOR;
        this.side = side;
    }

    public Rhombus(Point point, int side) {
        chack(side);
        color = DEFAULT_COLOR;
        this.point = point;
        this.side = side;
    }

    public Rhombus(Point point, Color color, int side) {
        chack(side);
        this.point = point;
        this.color = color;
        this.side = side;
    }

    private void chack(int side) {
        if (side < 3) {
            throw new IncorrectValueException(String.format("side should be large 3 SIDE: %d", side));
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
