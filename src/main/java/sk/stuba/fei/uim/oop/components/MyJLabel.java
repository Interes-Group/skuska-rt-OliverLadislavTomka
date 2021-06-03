package sk.stuba.fei.uim.oop.components;

import sk.stuba.fei.uim.oop.components.Config;

import javax.swing.*;

public class MyJLabel extends JLabel {

    public MyJLabel(Config config) {
        this.setBackground(config.getColor());
        this.setText("PAINT");
        setOpaque(true);
    }
}
