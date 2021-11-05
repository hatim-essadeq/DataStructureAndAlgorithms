package com.essadeq.datastructure.arrays;

import java.util.Arrays;

public class DynamicArray<T> {
    Object[] data;

    public DynamicArray() {
        data = new Object[0];
    }

    public int getSize() {
        return data.length;
    }

    public Object[] getData() {
        return data;
    }

    public Object get(int index) {
        return data[index];
    }

    public void set(Object element) {
        data = Arrays.copyOf(data, data.length + 1); // add 1 to data size
        int index = data.length - 1; // get index of element
        data[index] = element; // store element
    }

    public void delete(int index) {
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data = Arrays.copyOf(data, data.length - 1); // remove 1 from data size
    }

    public void print() {
        for (Object datum : data) {
            System.out.print(datum + " \t ");
        }
    }
}
