package ru.ivt5.v3.gen;

import ru.ivt5.v2.iface.HasArea;
import ru.ivt5.v3.Figure;

public class PairBox<T extends Figure> implements HasArea {
    private T obj1;
    private T obj2;

    public PairBox(T obj1, T obj2) {
        super();
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getContentFirst() {
        return obj1;
    }

    public void setContentFirst(T obj1) {
        this.obj1 = obj1;
    }

    public T getContentSecond() {
        return obj2;
    }

    public void getContentSecond(T obj2) {
        this.obj2 = obj2;
    }

    @Override
    public double getArea(){
        return this.obj1.getArea()+this.obj2.getArea();
    }

    public boolean isAreaEqual(PairBox<?> other){
        return this.getArea() == other.getArea();
    }

    public static boolean isAreaEqual(PairBox<?> b1,PairBox<?> b2){
        return b1.getArea() == b2.getArea();
    }
}
