package com.arya.java8.Question1;

import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEvenNumber {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,33,22,52,56,21,90,3,4,4,5);

        List<Integer> list1 = list.stream().map(n -> n * 2).toList();
        System.out.println(list1);

    }
}