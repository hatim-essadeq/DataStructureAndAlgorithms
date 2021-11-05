package com.essadeq.datastructure.arrays;

import java.util.Arrays;

public class DynamicArray<T> {
    T[] data;
    int size;

    public DynamicArray() {
        size = 0;
        data = (T[]) new Object[size];
    }

    public int getSize() {
        return size;
    }

    public Object[] getData() {
        return data;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(T element) {
        checkSizeCapacity(size + 1);
        data[size++] = element;
    }

    private void checkSizeCapacity(int minSize) {
        int currentSize = data.length;
        if (minSize > currentSize) {
            int newSize = currentSize + 1;
            if (newSize < minSize) {
                newSize = minSize;
            }
            data = Arrays.copyOf(data, newSize);
        }
    }
}
