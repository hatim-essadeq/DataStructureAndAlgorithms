package com.essadeq.datastructure.arrays;

public class SimpleArray {
    Object[][] objects;

    public SimpleArray(int size) {
        objects = new Object[1][size];
    }

    public SimpleArray(int rows, int columns) {
        objects = new Object[rows][columns];
    }

    public void add(int index, Object data) {
        objects[0][index] = data;
    }

    public void add(int indexRow, int indexColumn, Object data) {
        objects[indexRow][indexColumn] = data;
    }

    public void print() {
        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < objects[i].length; j++) {
                System.out.print(objects[i][j] + " \t ");
            }
            System.out.println();
        }
    }
}
