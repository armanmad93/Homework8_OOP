package com.company.painter.rhombusPainter;

import com.company.model.rhombus.Rhombus;
import com.company.painter.FigurePainter;

/**
 * @author Arman Karapetyan
 */

public abstract class RhombusFigurePainter extends FigurePainter {

    public RhombusFigurePainter() {
    }

    public RhombusFigurePainter(String image) {
        super(image);
    }

    public abstract FigurePainter paint(Rhombus rhombus);

}
