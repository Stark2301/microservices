package com.arya.collectionFramework;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(5);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector);
        System.out.println(vector.capacity());

        vector.add(6);
        vector.add(7);
        vector.add(8);

        System.out.println(vector);
        System.out.println(vector.capacity());

    }
}
