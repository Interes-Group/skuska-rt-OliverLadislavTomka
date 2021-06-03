package sk.stuba.fei.uim.oop.components;


import javax.swing.*;

public class MyJLabel extends JLabel {

    public MyJLabel(Config config) {
        setBackground(config.getColor());
        this.setText("Click BUTTON");
        setOpaque(true);
    }
}
