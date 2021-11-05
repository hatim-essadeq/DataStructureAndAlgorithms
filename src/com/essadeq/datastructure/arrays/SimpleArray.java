package com.essadeq.datastructure.arrays;

public class SimpleArray {
    public SimpleArray(){
        Object[] objects = new Object[5];
        objects[0] = 1;
        objects[1] = "Hatim";
        objects[2] = 3.14;
        objects[3] = 'R';
        objects[4] = true;
        for (Object object : objects) {
            System.out.print(object + "\t");
        }
    }
}
