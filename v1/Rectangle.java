package ru.ivt5.v1;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(){
        this.topLeft=new Point(0,0);
        this.bottomRight = new Point(1,1);
    }

    public Rectangle(Point leftTop,Point rightBottom){
        this.topLeft=leftTop;
        this.bottomRight = rightBottom;
    }

    public Rectangle(int xLeft,int yTop,int xRight,int yBottom){
        this.topLeft = new Point(xLeft,yTop);
        this.bottomRight = new Point(xRight,yBottom);
    }

    public Rectangle(int length,int width){
        this.topLeft = new Point(0,width);
        this.bottomRight = new Point(length,0);
    }

    public int getLength(){
        return bottomRight.getX() - topLeft.getX()  ;
    }

    public int getWidth(){
        return topLeft.getY() - bottomRight.getY() ;
    }

    public double getAria(){
        return getLength() * getWidth();
    }

    public double getPerimetr(){
        return 2*getLength()+2*getWidth();
    }


    public void moveTo(int x,int y){
        this.topLeft=new Point(x,y);
        this.bottomRight = new Point(x+getLength(),y+getWidth());
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        moveTo(topLeft.getX() + dx, topLeft.getY() + dy);
    }

    public boolean isInside(int x, int y) {
        return x >= topLeft.getX() && x <= bottomRight.getX() &&
                y >= topLeft.getY() && y <= bottomRight.getY();
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Rectangle square) {
        Point thisBottomRight = getBottomRight();
        Point otherBottomRight = square.getBottomRight();

        return !(this.topLeft.getX() > otherBottomRight.getX() ||
                thisBottomRight.getX() < square.topLeft.getX() ||
                this.topLeft.getY() > otherBottomRight.getY() ||
                thisBottomRight.getY() < square.topLeft.getY());
    }

    public boolean isInside(Rectangle rectangle) {
        Point thisBottomRight = getBottomRight();
        Point otherBottomRight = rectangle.getBottomRight();

        return this.topLeft.getX() >= rectangle.topLeft.getX() &&
                thisBottomRight.getX() <= otherBottomRight.getX() &&
                this.topLeft.getY() >= rectangle.topLeft.getY() &&
                thisBottomRight.getY() <= otherBottomRight.getY();
    }




    public void setTopLeft(Point leftTop){
        this.topLeft = leftTop;
    }

    public void setBottomRight(Point rightBottom){
        this.bottomRight = rightBottom;
    }

    public Point getTopLeft(){
        return topLeft;
    }

    public Point getBottomRight(){
        return bottomRight;
    }

}
