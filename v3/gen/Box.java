package ru.ivt5.v3.gen;

import ru.ivt5.v3.Figure;
import ru.ivt5.v3.iface.HasArea;

public class Box<T extends Figure> implements HasArea {
    private T obj;

    public Box(T obj) {
        super();
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public double getArea(){
        return obj.getArea();
    }

    public boolean isAreaEqual (Box<?> other){
        return this.obj.getArea() == other.getArea();
    }

    public static boolean isAreaEqual(Box<?> box1,Box<?> box2){
        return box1.getArea() == box2.getArea();
    }
}
