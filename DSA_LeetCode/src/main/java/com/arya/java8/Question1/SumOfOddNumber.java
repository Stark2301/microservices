package com.arya.java8.Question1;

import java.util.List;

public class SumOfOddNumber {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,33,22,52,56,21,90,3,4,4,5);

        Integer i = list.stream().filter(n -> n % 2 != 0).reduce(Integer::sum).get();
        System.out.println(i);

    }
}