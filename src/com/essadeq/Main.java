package com.essadeq;

import com.essadeq.datastructure.arrays.DynamicArray;
import com.essadeq.datastructure.arrays.SimpleArray;

public class Main {
    public Main() {
        simpleArray();
        dynamicArray();
    }

    public static void main(String[] args) {
        new Main();
    }

    void simpleArray() {
        System.out.println("SimpleArray 1D: ");
        SimpleArray array1D = new SimpleArray(5);
        array1D.add(0, 1);
        array1D.add(1, "Hatim");
        array1D.add(2, 3.14);
        array1D.add(3, 'R');
        array1D.add(4, true);
        array1D.print();

        System.out.println("SimpleArray 2D: ");
        SimpleArray array2D = new SimpleArray(2, 2);
        array2D.add(0, 0, 1);
        array2D.add(0, 1, "Hatim");
        array2D.add(1, 0, 3.14);
        array2D.add(1, 1, 'R');
        array2D.print();
    }

    void dynamicArray() {
        DynamicArray<Object> array1 = new DynamicArray<Object>();
        array1.set("Hatim");
        array1.set(1997);
        array1.set(true);
        array1.print();

        System.out.println();
        array1.delete(1);
        array1.print();
    }

}
