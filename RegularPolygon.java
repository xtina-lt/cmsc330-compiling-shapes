// UPDATED BY: Christina Torres
// CMSC 330 Advanced Programming Languages
// Project 1
// Spring 2023
// CREATED CLASS*
import java.awt.*;

class RegularPolygon extends SolidPolygon {

    public RegularPolygon(Color color, int sides, Point center, int radius) {
        super(color, sides);
        int[] x_points = new int[sides];
        int[] y_points = new int[sides];
        double angle = 2 * Math.PI / sides;
        for (int vertex = 0; vertex < sides; vertex++) {
            x_points[vertex] = (int) (center.x + radius * Math.cos(angle * vertex));
            y_points[vertex] = (int) (center.y + radius * Math.sin(angle * vertex));
        }
        createPolygon(x_points, y_points);
    }
}