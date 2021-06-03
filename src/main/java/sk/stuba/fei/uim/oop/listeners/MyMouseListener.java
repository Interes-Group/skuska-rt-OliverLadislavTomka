package sk.stuba.fei.uim.oop.listeners;

import sk.stuba.fei.uim.oop.components.Config;
import sk.stuba.fei.uim.oop.components.MyPaintJPanel;
import sk.stuba.fei.uim.oop.components.Tree;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MyMouseListener implements MouseListener, MouseMotionListener {
    private int xpos;
    private int ypos;
    private MyPaintJPanel malovanie;
    private Tree tree;
    private ArrayList<Tree> mojeObjekty;
    private Config config;

    public MyMouseListener(MyPaintJPanel malovanie,ArrayList<Tree> mojeObjekty, Config config) {
        this.malovanie = malovanie;
        this.mojeObjekty = mojeObjekty;
        this.config = config;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xpos = e.getX();
        ypos = e.getY();
        tree = new Tree(xpos, ypos, 0, 0, config.getColor());
        mojeObjekty.add(tree);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        malovanie.repaint();
        tree = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int i;
        if (tree != null){
            if (e.getX() - xpos > 0){
                if (e.getY() - ypos > 0){
                    i = porovnavanie(e.getX() - xpos, e.getY() - ypos);
                    tree.setWidth(i);
                    tree.setHeight(i);
                }
                if (e.getY() - ypos < 0){
                    i = porovnavanie(e.getX() - xpos,  - e.getY() + ypos);
                    tree.setWidth(i);
                    tree.setHeight(-i);
                }
            }
            if (e.getX() - xpos < 0){
                if (e.getY() - ypos > 0){
                    i = porovnavanie(- e.getX() + xpos, e.getY() - ypos);
                    tree.setWidth(-i);
                    tree.setHeight(i);
                }
                if (e.getY() - ypos < 0){
                    i = porovnavanie(- e.getX() + xpos, - e.getY() + ypos);
                    tree.setWidth(-i);
                    tree.setHeight(-i);

                }
            }
        }





        /*if (tree != null){
            i = porovnavanie(e.getX() - xpos, e.getY() - ypos);
            tree.setWidth(i);
            tree.setHeight(i);
        }*/
        malovanie.repaint();
        if (tree != null) tree.kresliTvar(malovanie.getGraphics());

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    private int porovnavanie(int a, int b){
        if (a < b) return a;
        return b;
    }
}
