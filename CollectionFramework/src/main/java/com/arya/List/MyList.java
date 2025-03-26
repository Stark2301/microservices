package com.arya.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //SIMPLY ADDS THE ELEMENT AT THE LAST
        list.add(23);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //ADD THE ELEMENT AT SPECIFIC INDEX
        list.add(2,6);
        System.out.println(list);

        // IT IS USED TO GET THE ELEMENT FROM THE LIST
        System.out.println(list.get(0));

        //THIS IS USED TO REPLACE THE GIVEN NUMBER AT THE SPECIFIED INDEX
        list.set(0,32);
        System.out.println(list);

        //THIS IS USED TO REMOVE THE ELEMENTS FROM THE LIST BY TAKING INDEX
        list.remove(0);
        System.out.println(list);

        list.addAll(Arrays.asList(23,3,2,1,3,31));
        System.out.println(list);

        list.sort(null);
        System.out.println(list);
    }
}