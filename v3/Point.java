package ru.ivt5.v3;

public class Point {
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Point(){
        this.x=0;
        this.y=0;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y=y;
    }

    public int getY(){
        return this.y;
    }

    public void moveTo(int newX,int newY){
        this.x=newX;
        this.y=newY;
    }

    public void moveRel(int dx,int dy){
        this.x+=dx;
        this.y+=dy;
    }

    @Override
    public String toString(){
        return "Point{"+"x="+x+";y="+y+"}";
    }
}
