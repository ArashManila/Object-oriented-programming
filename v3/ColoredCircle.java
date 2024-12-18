package ru.ivt5.v3;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.iface.Colored;

public class ColoredCircle extends Circle implements Colored {
    private Color color;

    public ColoredCircle(Point center, int radius, Color color) {
        super(center,radius);
        this.color = color;
    }

    public ColoredCircle(int xCenter, int yCenter, int radius, Color color) {
        super(xCenter,yCenter, radius);
        this.color = color;
    }

    public ColoredCircle(int radius, Color color) {
        super(radius);
        this.color = color;
    }

    public ColoredCircle(Color color) {
        this.color = color;
    }

    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){this.color = color;}

}
