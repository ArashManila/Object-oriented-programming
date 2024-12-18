package ru.ivt5.v2;

import ru.ivt5.v2.iface.Colored;

public class ColoredCircle extends Circle implements Colored {
    private int color;

    public ColoredCircle(Point center, int radius, int color) {
        super(center,radius);
        this.color = color;
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, int color) {
        super(xCenter,yCenter, radius);
        this.color = color;
    }

    public ColoredCircle(int radius, int color) {
        super(radius);
        this.color = color;
    }

    public ColoredCircle(int color) {
        this.color = color;
    }

    public int getColor(){
        return this.color;
    }
    public void setColor(int color){
        this.color = color;
    }
}
