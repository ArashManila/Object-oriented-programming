package ru.ivt5.v3;

import processing.core.PApplet;

public class ColoredRomb extends Figure {
    private int color;
    protected float x, y, width, height, xSpeed, ySpeed;
    protected PApplet sketch;

    public ColoredRomb(PApplet sketch, float x, float y, float dx, float dy) {
        this.sketch = sketch;
        this.x = x;
        this.y = y;
        this.width = sketch.random(30, 80);  // Ширина ромба
        this.height = sketch.random(30, 80); // Высота ромба
        this.xSpeed = sketch.random(-4, 4) + dx;
        this.ySpeed = sketch.random(-4, 4) + dy;
        this.color = sketch.color(sketch.random(255), sketch.random(255), sketch.random(255));
        life = 500; // Время "жизни" объекта
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

        // Отскок от границ экрана
        if (x < width / 2) {
            xSpeed = Math.abs(xSpeed);
            x = width / 2;
        }
        if (x > sketch.width - width / 2) {
            xSpeed = -Math.abs(xSpeed);
            x = sketch.width - width / 2;
        }

        if (y < height / 2) {
            ySpeed = Math.abs(ySpeed);
            y = height / 2;
        }
        if (y > sketch.height - height / 2) {
            ySpeed = -Math.abs(ySpeed);
            y = sketch.height - height / 2;
        }

        life -= 1; // Уменьшаем "жизнь"
    }

    public void render() {
        sketch.fill(color);
        sketch.noStroke();

        // Отрисовка ромба (4 вершины)
        sketch.beginShape();
        sketch.vertex(x, y - height / 2);    // Верхняя вершина
        sketch.vertex(x + width / 2, y);     // Правая вершина
        sketch.vertex(x, y + height / 2);    // Нижняя вершина
        sketch.vertex(x - width / 2, y);     // Левая вершина
        sketch.endShape(PApplet.CLOSE);
    }

    @Override
    public boolean isInside(int x, int y) {
        // Простая проверка: находится ли точка внутри ромба (алгоритм "ромбического" пересечения)
        float dx = Math.abs(x - this.x);
        float dy = Math.abs(y - this.y);
        return (dx / (width / 2) + dy / (height / 2)) <= 1;
    }
}