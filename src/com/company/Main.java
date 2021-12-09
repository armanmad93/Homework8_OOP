package com.company;

import com.company.enums.Color;
import com.company.image.ImageGallery;
import com.company.model.rhombus.RhombusLeft;
import com.company.model.rhombus.RhombusMiddle;
import com.company.model.rhombus.RhombusRight;
import com.company.model.triangle.TriangleLeft;
import com.company.model.triangle.TriangleMiddle;
import com.company.model.triangle.TriangleRight;
import com.company.painter.FigurePainter;
import com.company.point.Point;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arman Karapetyan
 */

public class Main {

    public static void main(String[] args) {

        Point point = new Point(5, 5);

        List<FigurePainter> list = new ArrayList<>();
        list.add(new TriangleLeft(point, Color.GREEN, 12).doPicture());
        list.add(new TriangleMiddle(point, Color.BLUE, 7).doPicture());
        list.add(new TriangleRight(point, Color.RED, 15).doPicture());
        list.add(new RhombusLeft(point, Color.GREEN, 15).doPicture());
        list.add(new RhombusMiddle(point, Color.WHITE, 10).doPicture());
        list.add(new RhombusRight(point, Color.BLUE, 15).doPicture());

        new ImageGallery(list).show();

    }

}
