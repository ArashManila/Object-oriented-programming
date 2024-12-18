package ru.ivt5.v3;

import ru.ivt5.v3.colors.Color;
import ru.ivt5.v3.iface.Colored;

public class ColoredRectangle extends Rectangle implements Colored {
    private Color color;

    public ColoredRectangle(Point leftTop, Point rightBottom, Color color){
        super(leftTop,rightBottom);
        this.color=color;
    }
    public ColoredRectangle(int xLeft,int yTop,int xRight,int yBottom,Color color){
        super(xLeft,yTop,xRight,yBottom);
        this.color = color;
    }
    public ColoredRectangle(int length,int width,Color color){
        super(length,width);
        this.color=color;
    }
    public ColoredRectangle(Color color){
        super(new Point(0,1),new Point(1,0));
        this.color=color;
    }
    public ColoredRectangle(){
        super(new Point(0,1),new Point(1,0));
        this.color=Color.BLUE;
    }

    public Color getColor(){
        return this.color;
    }
    public void setColor(Color color){
        this.color = color;
    }


}
