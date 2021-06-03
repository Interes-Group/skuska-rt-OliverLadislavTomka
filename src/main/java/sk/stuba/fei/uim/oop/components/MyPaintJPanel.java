package sk.stuba.fei.uim.oop.components;

import sk.stuba.fei.uim.oop.listeners.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyPaintJPanel extends JPanel {
    private ArrayList<Tree> objectList;

    public MyPaintJPanel(Config config) {
        super();
        this.objectList = new ArrayList<>();
        MyMouseListener myMouseListener = new MyMouseListener(this,objectList,config);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Tree tree:objectList){

            tree.kresliTvar(g);
        }
    }
}
