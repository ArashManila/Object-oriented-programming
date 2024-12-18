package ru.ivt5.v1;

public class Ellipse {
    private Point center;
    private int xAxis;
    private int yAxis;


    public Ellipse(Point center, int xAxis, int yAxis) {
        this.center = center;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }


    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this.center = new Point(xCenter, yCenter);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }


    public Ellipse(int xAxis, int yAxis) {
        this.center = new Point(0, 0);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public Ellipse() {
        this.center = new Point(0, 0);
        this.xAxis = 1;
        this.yAxis = 1;
    }

    public Point getCenter() {
        return center;
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void moveTo(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public void moveTo(Point point) {
        this.center = point;
    }

    public void moveRel(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    public void resize(double ratio) {
        this.xAxis = (int) (this.xAxis * ratio);
        this.yAxis = (int) (this.yAxis * ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        this.xAxis = (int) (this.xAxis * xRatio);
        this.yAxis = (int) (this.yAxis * yRatio);
    }

    public double getArea() {
        return Math.PI * (this.xAxis / 2.0) * (this.yAxis / 2.0);
    }

    public double getPerimeter() {

        return Math.PI * 2 * Math.sqrt((Math.pow(this.xAxis / 2.0, 2) + Math.pow(this.yAxis / 2.0, 2)) / 2);
    }
}
