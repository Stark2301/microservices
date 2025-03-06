package com.arya.java8.Question4;

import java.util.Arrays;
import java.util.List;

public class NumberStartWith1 {
    public static void main(String[] args) {

        int [] arr = {111, 234, 567, 127, 324, 198};

        List<Integer> list = Arrays.stream(arr).filter(n->String.valueOf(n).startsWith("1")).boxed().toList();
        System.out.println(list);


    }
}