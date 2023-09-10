// UPDATED BY: Christina Torres
// CMSC 330 Advanced Programming Languages
// Project 1
// Spring 2023
// CREATED CLASS*

import java.awt.*;

class Parallelogram extends SolidPolygon {

    public Parallelogram(Color color, int offset, Point[] points) {
        super(color, 4);
        Point pointA = points[0];
        Point pointB = points[1];
        int[] pointsX = {pointA.x, pointB.x + offset, pointB.x, pointA.x - offset};
        int[] pointsY = {pointA.y, pointA.y, pointB.y, pointB.y};
        createPolygon(pointsX, pointsY);
    }
}
