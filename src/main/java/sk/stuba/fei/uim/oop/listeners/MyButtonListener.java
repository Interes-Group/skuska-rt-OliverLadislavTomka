package sk.stuba.fei.uim.oop.listeners;



import sk.stuba.fei.uim.oop.components.MyJLabel;
import sk.stuba.fei.uim.oop.components.Config;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {

    private Config config;
    private MyJLabel myJLabel;

    public MyButtonListener(Config config,MyJLabel myJLabel) {
        super();
        this.config = config;
        this.myJLabel = myJLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "PAINT":
                myJLabel.setText("PAINT");
                config.setMod(1);
                break;
            case "DRAG":
                myJLabel.setText("DRAG");
                config.setMod(2);
                break;
            case "COLOR":
                break;
        }


    }
}
