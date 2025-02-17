package ru.ivt5.v3.gen;

import java.sql.Array;

public class ArrayBox<T>{
    private T[] arr;


    public ArrayBox(T[] arr) {
        super();
        this.arr = arr;
    }

    public T[] getContent() {
        return arr;
    }

    public void setContent(T[] arr) {
        this.arr = arr;
    }


    public T getElement(int i){
        if ((this.arr.length >i) || (this.arr.length > 0)){
            return arr[i];
        }
        else return arr[0];
    }

    public void setElement(int i,T elem){
        if((this.arr.length >i) || (this.arr.length > 0)) {
            this.arr[i] = elem;
        }
    }

    public boolean isSameSize(ArrayBox<?> other){
        return this.arr.length == other.arr.length;
    }
}
