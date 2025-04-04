package Flyweight;

import java.awt.*;

public class Marker {
    private int x;
    private int y;
    private MarkerType markerType;

    public Marker(int x, int y, MarkerType markerType) {
        this.x = x;
        this.y = y;
        this.markerType = markerType;
    }
    public void draw(Graphics g) {
        markerType.draw(g,x,y);
    }
}
