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
        SimpleArray array = new SimpleArray();
    }

    void dynamicArray() {
        DynamicArray<String> array1 = new DynamicArray<String>();
        array1.set("Hatim");
        System.out.println(array1.getSize());
        array1.set("Rhita");
        System.out.println(array1.getSize());
        array1.set("true");
        System.out.println(array1.getSize());
    }

}
