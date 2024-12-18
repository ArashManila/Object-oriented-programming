package ru.ivt5;

import ru.ivt5.v2.*;

public class Main {
    public static void main(String[] args) {
        ColoredCircle c1 = new ColoredCircle(1,2,4,6);
        Ellipse e1  = new Ellipse(new Point(1,1),2,2);
        e1.setCenter(new Point(8,9));

        Rectangle r1 = new Rectangle();



        System.out.println(c1.getCenter());
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());

        System.out.println(r1.getBottomRight());
        System.out.println(r1.getTopLeft());
    }
}