package sk.stuba.fei.uim.oop.components;

import javax.swing.*;
import java.awt.*;

public class TopJPanel extends JPanel {

    public TopJPanel(Config config, MyJLabel myJLabel) {
        setLayout(new GridLayout(1,0));
        add(new MyJButton("PAINT",config,myJLabel));
        add(new MyJButton("DRAG",config,myJLabel));
        add(new MyJButton("COLOR",config,myJLabel));
        add(myJLabel);
    }
}
