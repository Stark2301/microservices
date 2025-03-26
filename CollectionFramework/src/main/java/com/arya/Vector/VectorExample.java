package com.arya.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
        System.out.println(vector.capacity());

        vector.add(4);
        System.out.println(vector);
        System.out.println(vector.capacity());

        //it is used to insert in between and shifts the element
        vector.add(2,7);
        System.out.println(vector);

        // it is used to replace the element at the given index.
        vector.set(2,9);
        System.out.println(vector);

        vector.remove(1);
        System.out.println(vector);
        //Clears all the inputs
//        vector.clear();
//        System.out.println(vector);



    }
}