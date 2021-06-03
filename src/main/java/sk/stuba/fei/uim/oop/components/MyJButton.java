package sk.stuba.fei.uim.oop.components;


import sk.stuba.fei.uim.oop.listeners.*;

import javax.swing.*;

public class MyJButton extends JButton {

    public MyJButton(String label, Config config, MyJLabel myJLabel) {
        super(label);
        setFocusable(false);
        addActionListener(new MyButtonListener(config,myJLabel));
    }
}