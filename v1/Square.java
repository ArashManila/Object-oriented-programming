package ru.ivt5.v1;

public class Square {
    private Point topLeft;
    private int length;

    // Конструктор по умолчанию
    public Square() {
        this.topLeft = new Point(0, 0);
        this.length = 1; // По умолчанию сторона квадрата равна 1
    }

    // Конструктор с двумя точками
    public Square(Point leftTop, Point rightBottom) {
        this.topLeft = leftTop;
        this.length = rightBottom.getX() - leftTop.getX();
    }

    // Конструктор с координатами
    public Square(int xLeft, int yTop, int length) {
        this.topLeft = new Point(xLeft, yTop);
        this.length = length;
    }

    // Конструктор с одной точки и длиной стороны
    public Square(Point topLeft, int length) {
        this.topLeft = topLeft;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public double getArea() {
        return length * length; // Площадь квадрата
    }

    public double getPerimeter() {
        return 4 * length; // Периметр квадрата
    }

    public void moveTo(int x, int y) {
        this.topLeft = new Point(x, y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        moveTo(topLeft.getX() + dx, topLeft.getY() + dy);
    }

    public boolean isInside(int x, int y) {
        return x >= topLeft.getX() && x <= topLeft.getX() + length
                && y >= topLeft.getY() && y <= topLeft.getY() + length;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return new Point(topLeft.getX() + length, topLeft.getY() + length);
    }
}