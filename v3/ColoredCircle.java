//package ru.ivt5.v3;
//
//import ru.ivt5.v3.colors.Color;
//import ru.ivt5.v3.iface.Colored;
//
//import processing.core.PApplet;
//
//public class ColoredCircle extends Circle implements Colored {
//    private Color color;
//    protected PApplet sketch;
//
//    public ColoredCircle(Point center, int radius, Color color) {
//        super(center,radius);
//        this.color = color;
//    }
//
//    public ColoredCircle(int xCenter, int yCenter, int radius, Color color) {
//        super(xCenter,yCenter, radius);
//        this.color = color;
//    }
//
//    public ColoredCircle(int radius, Color color) {
//        super(radius);
//        this.color = color;
//    }
//
//    public ColoredCircle(Color color) {
//        this.color = color;
//    }
//
//    public Color getColor(){
//        return this.color;
//    }
//
//    public void setColor(Color color){this.color = color;}
//
//}

package ru.ivt5.v3;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.colors.ColorErrorCode;
import ru.ivt5.v3.colors.ColorException;
import ru.ivt5.v3.iface.Colored;

import java.util.Objects;

import processing.core.PApplet;

public class ColoredCircle extends Figure {
    private int color;
    protected float x, y, Diameter, xSpeed, ySpeed;
    protected PApplet sketch;

    public ColoredCircle(PApplet sketch, float x, float y, float dx, float dy) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.Diameter = sketch.random(10, 100);
        this.xSpeed = sketch.random(-5, 5) + dx;
        this.ySpeed = sketch.random(-5, 5) + dy;
        this.color = sketch.color(sketch.random(255), sketch.random(255), sketch.random(255));
        life = 500;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveRel(float dx, float dy) {
        x += dx;
        y += dy;
    }


    public void step() {
        moveRel(xSpeed, ySpeed);
        if (x < Diameter / 2) {
            xSpeed = Math.abs(xSpeed);
            x = Diameter / 2;
        }
        if (x > sketch.width - Diameter / 2) {
            xSpeed = -Math.abs(xSpeed);
            x = sketch.width - Diameter / 2;
        }

        if (y < Diameter / 2) ySpeed = Math.abs(ySpeed);
        if (y > sketch.height - Diameter / 2) ySpeed = -Math.abs(ySpeed);
        life -= 1;
    }

    public void render() {
        sketch.fill(color);
        sketch.ellipse(x, y, Diameter, Diameter);
    }

    @Override
    public boolean isInside(int x, int y) {
        return false;
    }
}