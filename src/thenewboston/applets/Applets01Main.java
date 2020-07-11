package thenewboston.applets;

import java.awt.*;
import javax.swing.*;

public class Applets01Main extends JApplet {

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawString("this is painting", 50, 150);
    }

}
