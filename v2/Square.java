package ru.ivt5.v2;



public class Square extends Figure  {
    private int length;


    public Square() {
        super(new Point(0,0));
        this.length = 1;
    }


    public Square(Point leftTop, Point rightBottom) {
        super(leftTop);
        this.length = rightBottom.getX() - leftTop.getX();
    }


    public Square(int xLeft, int yTop, int length) {
        super(new Point(xLeft, yTop));
        this.length = length;
    }


    public Square(Point topLeft, int length) {
        super(topLeft);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public double getArea() {
        return length * length;
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public void moveTo(int x, int y) {
        setPoint(new Point(x, y));
    }


    public void moveRel(int dx, int dy) {
        moveTo(getPoint().getX() + dx, getPoint().getY() + dy);
    }

    public boolean isInside(int x, int y) {
        Point currentPoint = getPoint();
        return x >= currentPoint.getX() && x <= currentPoint.getX() + length
                && y >= currentPoint.getY() && y <= currentPoint.getY() + length;
    }

    public Point getTopLeft() {
        return getPoint();
    }

    public Point getBottomRight() {
        Point currentPoint = getPoint();
        return new Point(currentPoint.getX() + length, currentPoint.getY() + length);
    }
}