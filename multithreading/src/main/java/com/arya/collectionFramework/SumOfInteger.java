package com.arya.collectionFramework;

import java.util.Arrays;
import java.util.List;

public class SumOfInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,5,3,2,1);

        Integer i = list.stream().reduce(Integer::max).get();
        System.out.println(i);

    }
}