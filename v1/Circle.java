package ru.ivt5.v1;

public class Circle {
    private int Rad;
    private Point Center;

    public Circle(Point center,int radius){
        this.Center = center;
        this.Rad = radius;
    }

    public Circle(int xCenter,int yCenter,int radius){
        this.Center = new Point(xCenter,yCenter);
        this.Rad = radius;
    }

    public Circle(int radius){
        this.Center = new Point(0,0);
        this.Rad = radius;
    }

    public Circle(){
        this.Center = new Point(0,0);
        this.Rad = 1;
    }

    public Point getCenter(){
        return Center;
    }

    public int getRadius(){
        return Rad;
    }

    public void setCenter(Point center){
        this.Center = center;
    }

    public void setRadius(int radius){
        this.Rad = radius;
    }

    public void moveTo(int x,int y){
        this.Center = new Point(Center.getX()+x, Center.getY()+y );
    }

    public void moveTo(Point point){
        this.Center= new Point(point.getX(),point.getY());
    }

    public void moveRel(int dx,int dy){
        this.Center = new Point(Center.getX()+dx, Center.getY()+dy );
    }

    public double getArea(){
        return Math.PI*(getRadius()*getRadius());
    }

    public double  getPerimetr(){
        return 2*Math.PI*getRadius();
    }

    public boolean isInside(int x,int y){
        if(x<=Center.getX() && y<=Center.getY()) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isInside(Point point){
        if(point.getX()<=Center.getX() && point.getY()<=Center.getY()) {
            return true;
        }
        else{
            return false;
        }
    }
}
