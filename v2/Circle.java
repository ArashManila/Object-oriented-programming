package ru.ivt5.v2;



public class Circle extends Figure  {
    private int radius;

    public Circle(Point center,int radius){
        super(center);
        this.radius=radius;
    }

    public Circle(int xCenter, int yCenter, int radius) {
        super(new Point(xCenter, yCenter));
        this.radius = radius;
    }


    public Circle(int radius) {
        this(0, 0, radius);
    }


    public Circle() {
        this(1);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public Point getCenter() {
        return getPoint();
    }

    public void setCenter(Point newCenter) {
        setPoint(newCenter);
    }

    public void moveTo(int x, int y) {
        setCenter(new Point(x, y));
    }

    public void moveRel(int dx, int dy) {
        Point currentCenter = getCenter();
        moveTo(currentCenter.getX() + dx, currentCenter.getY() + dy);
    }

    public boolean isInside(Point point) {
        int centerX = getCenter().getX();
        int centerY = getCenter().getY();
        return (Math.pow((point.getX() - centerX), 2) + Math.pow((point.getY() - centerY), 2)) <= Math.pow(radius, 2);
    }


    public boolean isInside(int x, int y) {
        return isInside(new Point(x, y));
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}