package com.arya.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        //UnModifiable List
        List<Integer> list = List.of(1,2,3,4,5,6);
        System.out.println(list);

        //Exception will be thrown
        list.add(9);
        System.out.println(list);

        List<Integer> list1 = List.copyOf(list);
        System.out.println(list1);


    }
}