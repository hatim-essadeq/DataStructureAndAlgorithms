package com.essadeq.datastructure.stack;

public class StackArray<T> {

    Object[] data;
    int top;

    public StackArray(int size) {
        this.data = new Object[size];
        this.top = -1;
    }

    public void push(Object element) {
        if (isFull()) {
            System.out.println("StackArray is Full");
            return;
        }
        top++;
        data[top] = element;
    }

    public Object pop() {
        if (isEmty()) {
            System.out.println("StackArray is Empty");
            return null;
        }
        Object element = data[top];
        top--;
        return element;
    }

    public int getTop() {
        return top;
    }

    private boolean isFull() {
        return top == data.length - 1;
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
