package sk.stuba.fei.uim.oop.listeners;

import sk.stuba.fei.uim.oop.components.Config;
import sk.stuba.fei.uim.oop.components.MyPaintJPanel;
import sk.stuba.fei.uim.oop.components.Tree;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MyMouseListener implements MouseListener, MouseMotionListener {
    private MyPaintJPanel malovanie;
    private Tree tree;
    private ArrayList<Tree> mojeObjekty;
    private Config config;
    private Tree newTree;
    private int dragX;
    private int dragY;

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
        if (config.getMod() == 1) {
            int xpos = e.getX();
            int ypos = e.getY();
            tree = new Tree(xpos, ypos, 1, 1, config.getColor());
            mojeObjekty.add(tree);
        }
        if (config.getMod() == 2) {
            newTree = checkObject(e.getX(),e.getY(),mojeObjekty);
            if (newTree != null){
                dragX = e.getX()- newTree.getX();
                dragY = e.getY()- newTree.getY();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (config.getMod() == 1) {
            malovanie.repaint();
            int x1 = tree.getX(), y1 = tree.getY(), x2 = tree.getWidth(), y2 = tree.getHeight();

            if (tree.getWidth() < 0) {
                tree.setX(x1 + x2);
                tree.setWidth(-tree.getWidth());
            }
            if (tree.getHeight() < 0) {
                tree.setY(y1 + y2);
                tree.setHeight(-tree.getHeight());
            }
            tree = null;
        }
        if (config.getMod() == 2){
            malovanie.repaint();
            newTree = null;
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (config.getMod() == 1) {
            if (tree != null) {
                tree.setWidth(e.getX() - tree.getX());
                tree.setHeight(e.getY() - tree.getY());
            }
            malovanie.repaint();
            if (tree != null) tree.kresliTvar(malovanie.getGraphics());
        }
        if (config.getMod() == 2){
            if (newTree != null) {
                newTree.setX(e.getX() - dragX);
                newTree.setY(e.getY() - dragY);
                malovanie.repaint();
            }
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    private Tree checkObject(int x, int y, ArrayList<Tree> mojeObjekty){
        for (Tree tree:mojeObjekty) {
            if (x >= tree.getX() && y >= tree.getY() && x <= (tree.getX()+tree.getWidth()) && y <= (tree.getY() + tree.getHeight()))
                return tree;
        }
        return null;
    }

}
