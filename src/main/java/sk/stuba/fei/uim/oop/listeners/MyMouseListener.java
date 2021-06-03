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

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
