// UPDATED BY: Christina Torres
// CMSC 330 Advanced Programming Languages
// Project 1
// Spring 2023
// CREATED CLASS*

import java.awt.*;

class Text extends Image {
    private Point point;
    private String text;

    public Text(Color color, String text, Point point) {
        super(color);
        this.point = point;
        this.text = text;
    }

    @Override
    void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(text, point.x, point.y);
    }
}
