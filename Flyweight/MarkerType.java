package Flyweight;

import java.awt.*;

public class MarkerType {
    private String iconType;
    private String color;
    private String labelStyle;

    public MarkerType(String iconType, String color, String labelStyle) {
        this.iconType = iconType;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.drawString(iconType, 10, 20);
    }
}
