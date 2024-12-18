package ru.ivt5.misc;


public class ArrayWrapper {
    private int[] array;


    public ArrayWrapper(int[] array) {
        this.array = array;
    }


    public ArrayWrapper(int size){
        this.array = new int[size];
    }

    public int[] Multiplication(int koeff){
        for(int i=0;i<this.array.length;i++){
            array[i]*=koeff;
        }

        return this.array;
    }

    public int[] Division(int koeff){
        for(int i=0;i<this.array.length;i++){
            this.array[i] = (int)Math.round(this.array[i]/ koeff);
        }

        return this.array;
    }


    public int getItem(int i){
        if ((this.array.length >i) || (this.array.length < 0)){
            return array[i];
        }
        else {
            return -1;
        }

    }
    public void printItem(int ind){

        if(getItem(ind) == -1){
            System.out.println("There is no element with that index");
        }
        else{
            System.out.printf("Element with index %s have value = %s ",ind,getItem(ind));
        }

    }
    public void printArray(){
        for(int i=0;i<this.array.length;i++){
            System.out.printf("%s: %s \n",i,this.array[i]);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] add(ArrayWrapper other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины для сложения");
        }

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] + other.array[i];
        }
        return this.array;
    }


    public int[] subtract(ArrayWrapper other) {
        if (this.array.length != other.array.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины для вычитания");
        }

        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = this.array[i] - other.array[i];
        }
        return this.array;
    }


}