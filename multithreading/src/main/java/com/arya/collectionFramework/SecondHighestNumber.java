package com.arya.collectionFramework;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int [] arr ={1,2,3,5,7,77,85,69,521,14,52};

        Integer i = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(i);
    }
}