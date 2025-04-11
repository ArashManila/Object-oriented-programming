package ru.ivt5.v3;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Iterator;

public class Configurator {
    private ArrayList<Figure> figures;
    private PApplet sketch;

    public Configurator(PApplet sketch) {
        this.sketch = sketch;
        this.figures = new ArrayList<>();
    }

    public void addCircle(float x, float y, float dx, float dy) {
        figures.add(new ColoredCircle(sketch, x, y, dx, dy));
    }

    public void addRectangle(float x, float y, float dx, float dy) {
        figures.add(new ColoredRectangle(sketch, x, y, dx, dy));
    }

    public void addRomb(float x, float y, float dx, float dy) {
        figures.add(new ColoredRomb(sketch, x, y, dx, dy));
    }

    public void updateAndRender() {
        Iterator<Figure> it = figures.iterator();
        while (it.hasNext()) {
            Figure f = it.next();
            f.step();
            f.render();
            if (f.life == 0) {
                it.remove();
            }
        }
    }
}