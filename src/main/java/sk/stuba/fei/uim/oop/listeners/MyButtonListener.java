package sk.stuba.fei.uim.oop.listeners;



import sk.stuba.fei.uim.oop.components.MyJLabel;
import sk.stuba.fei.uim.oop.components.Config;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyButtonListener implements ActionListener {

    private Config config;
    private MyJLabel myJLabel;
    private ArrayList<Color> farby;
    private int pocitadlo;

    public MyButtonListener(Config config,MyJLabel myJLabel) {
        super();
        this.config = config;
        this.myJLabel = myJLabel;
        this.farby = config.getFarby();
        this.pocitadlo = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "PAINT":
                myJLabel.setOpaque(true);
                myJLabel.setText("PAINT");
                myJLabel.setBackground(config.getColor());
                config.setMod(1);
                break;
            case "DRAG":
                myJLabel.setOpaque(false);
                myJLabel.setText("DRAG");
                config.setMod(2);
                break;
            case "COLOR":
                if (config.getMod() == 1) {
                    config.setColor(farby.get(pocitadlo % 3));
                    myJLabel.setBackground(farby.get(pocitadlo % 3));
                    pocitadlo++;
                }
                break;
        }


    }
}
