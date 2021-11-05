package com.essadeq.datastructure.stack;

import java.util.Arrays;

public class DynamicStackArray<T> {

    Object[] data;
    int top;

    public DynamicStackArray() {
        this.data = new Object[0];
        this.top = -1;
    }

    public void push(Object element) {
        data = Arrays.copyOf(data, data.length + 1);
        top++;
        data[top] = element;
    }

    public Object pop() {
        if (isEmty()) {
            System.out.println("StackArray is Empty");
            return null;
        }
        Object element = data[top];
        data = Arrays.copyOf(data, data.length - 1);
        top--;
        return element;
    }

    public int getTop() {
        return top;
    }

    private boolean isEmty() {
        return top == -1;
    }

    public void print() {
        for (Object datum : data) {
            System.out.println(datum + " \t ");
        }
    }
}
