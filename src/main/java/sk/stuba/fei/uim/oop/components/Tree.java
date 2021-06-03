package sk.stuba.fei.uim.oop.components;

import java.awt.*;

public class Tree {
    private Color color;
    private int x;
    private int y;
    private int height;
    private int width;

    public void kresliTvar(Graphics g) {
        g.setColor(color);
        g.fillOval(this.x,this.y,width,(height*2)/3);
        g.fillRect(this.x+ width/3,this.y + height/3, width/3,2*height/3);
    }
}
