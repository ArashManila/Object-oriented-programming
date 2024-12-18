package ru.ivt5.misc;

public class Test {
    public static void main(String[] args) {

        int[] example = {1,2,3,4,5,6};
        ArrayWrapper arr = new ArrayWrapper(example);
        System.out.printf("elem [%s]: %s",4,arr.getItem(4));//elem [4]: %5
        System.out.println();
        ArrayWrapper arr1 = new ArrayWrapper(6);
        arr1.printArray();// 0 0 0 0 0 0
        System.out.println();
        int[] example1 = {6,5,4,3,2,1};
        ArrayWrapper arr2 = new ArrayWrapper(example1);
        arr.add(arr2);
        arr.printArray();
        System.out.println();
        arr.subtract(arr2);
        arr.printArray();
        System.out.println();
        arr.Multiplication(2);
        arr.printArray();
        System.out.println();
        arr.Division(2);
        arr.printArray();
        System.out.println();
        arr.printItem(3);
        System.out.println();
        arr.printItem(8);

    }
}
