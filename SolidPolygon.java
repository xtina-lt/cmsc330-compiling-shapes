// CMSC 330 Advanced Programming Languages
// Project 1
// Spring 2023
// added class *

// UPDATED BY: Christina Torres
// CMSC 330 Advanced Programming Languages
// Project 1
// Spring 2023
// CREATED CLASS*

import java.awt.*;

class SolidPolygon extends Polygon_ {

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
        graphics.fillPolygon(polygon);
    }
}
