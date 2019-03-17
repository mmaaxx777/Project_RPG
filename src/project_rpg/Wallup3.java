package project_rpg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Wallup3 {

    int x = 0;
    int y = 0;
    int w = 1000;
    int h = 40;

    static void paint(Graphics dr) {
        int x = 0;
        int y = 0;
        int w = 40;
        int h = 700;
        dr.setColor(Color.black);
        dr.fillRect(x, y, w, h);
    }

    public Rectangle getbounds() {
        return new Rectangle(x, y, w, h);

    }
}
