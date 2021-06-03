package sk.stuba.fei.uim.oop.components;

import java.awt.*;
import java.util.ArrayList;

public class Config {
    private int mod;
    private Color color;
    private ArrayList<Color> farby;

    public Config() {
        this.mod = 0;
        this.color = Color.BLUE;
        this.farby = new ArrayList<>();
        initFarby(this.farby);
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Color> getFarby() {
        return farby;
    }

    public void setFarby(ArrayList<Color> farby) {
        this.farby = farby;
    }

    private void initFarby(ArrayList<Color> farby){
        farby.add(Color.RED);
        farby.add(Color.GREEN);
        farby.add(Color.BLUE);
    }
}
