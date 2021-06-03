package sk.stuba.fei.uim.oop.components;

import java.awt.*;

public class Config {
    private int mod;
    private Color color;


    public Config() {
        this.mod = 1;
        this.color = Color.BLUE;
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
}
