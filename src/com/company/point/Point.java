package com.company.point;

/**
 * @author Arman Karapetyan
 */

import com.company.exeption.IncorrectValueException;

public class Point {

    private static final int POSITION_X = 0;
    private static final int POSITION_Y = 0;

    private int coordinateX;
    private int coordinateY;

    public Point() {
        coordinateX = POSITION_X;
        coordinateY = POSITION_Y;
    }

    public Point(int coordinateX, int coordinateY) {
        chack(coordinateX, coordinateY);
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    private void chack(int coordinateX, int coordinateY) {
        if (coordinateX < 1 || coordinateY < 1) {
            throw new IncorrectValueException(String.format("coordinates must be positive x: %d , y: %d", coordinateX, coordinateY));
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        chack(coordinateX, this.coordinateY);
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        chack(this.coordinateX, coordinateY);
        this.coordinateY = coordinateY;
    }

}
