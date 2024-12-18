package ru.ivt5.v3;

import ru.ivt5.v3.iface.HasArea;
import ru.ivt5.v3.iface.Movable;


abstract class Figure implements HasArea, Movable {
    private Point point;

    public Figure(Point abspoint){ point=abspoint; }

    public Point getPoint(){return point;}

    public void setPoint(Point newPoint){point=newPoint;}

    public void moveTo(Point newPoint){
        point = newPoint;
    }

    public abstract double getPerimeter();
    public abstract boolean isInside(int x,int y);

}
