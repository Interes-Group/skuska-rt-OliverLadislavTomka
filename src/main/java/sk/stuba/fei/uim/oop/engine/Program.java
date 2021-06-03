package sk.stuba.fei.uim.oop.engine;

import sk.stuba.fei.uim.oop.components.*;

import java.awt.*;

public class Program {

    public Program() {
        var config = new Config();
        var myJLabel = new MyJLabel();
        var kreslenie = new MyPaintJPanel(config);
        var upperMenu = new TopJPanel(config,myJLabel);
        var frame = new MyJFrame();
        frame.add(upperMenu, BorderLayout.NORTH);
        frame.add(kreslenie,BorderLayout.CENTER);
    }
}
