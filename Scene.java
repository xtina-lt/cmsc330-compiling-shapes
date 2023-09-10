// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;

// Class that defines a scene

class Scene {

    private JFrame window;
    private DrawingPanel drawing;

    // Constructor that must be supplied the height and width of the drawing window for the scene

    public Scene(String name, int height, int width) {
        window = new JFrame(name);
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawing = new DrawingPanel();
        window.add(drawing);
        // added icons
        ImageIcon icon = new ImageIcon("./assets/unicorn.png");
        window.setIconImage(icon.getImage());
        drawing.setBackground(Color.decode("#4d004d"));
    }

    // Adds a graphic object to the scene's drawing panel

    public void addImage(Image image) {
        drawing.addImage(image);
    }

    // Causes the drawing panel to be repainted

    public void draw() {
        window.setVisible(true);
        drawing.repaint();
    }
}