package sk.stuba.fei.uim.oop.components;

import java.awt.*;

public class Tree {
    private Color color;
    private int x;
    private int y;
    private int height;
    private int width;

    public Tree( int x, int y, int height, int width,Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void kresliTvar(Graphics g) {
        g.setColor(color);
        int x1=x,y1=y,x2=width,y2=height;
        if (width < 0){
            x1=x+width;
            x2=x1-width;
        }
        /*if (height < 0){
            y1=y+height;
            y2=y1-height;
        }*/
        /*g.fillOval(this.x,this.y,width,(height*2)/3);
        g.fillRect(this.x+ width/3,this.y + height/3, width/3,2*height/3);*/

        g.fillOval(x1,y1,x2,(y2*2)/3);
        g.fillRect(x1 + x2/3,y1 + y2/3, x2/3,2*y2/3);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
