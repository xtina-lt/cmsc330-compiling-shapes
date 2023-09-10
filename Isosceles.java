// UPDATED BY: Christina Torres
// CMSC 330 Advanced Programming Languages
// Project 1
// Spring 2023
// CREATED CLASS*

import java.awt.*;

class Isosceles extends SolidPolygon {

    public Isosceles(Color color, int height, int width, Point vertex) {
        super(color, 3);
        int[] x_points = {vertex.x, vertex.x - (width / 2), vertex.x + (width / 2)};
        int[] y_points = {vertex.y, vertex.y + height, vertex.y + height};
        createPolygon(x_points, y_points);
    }
}
