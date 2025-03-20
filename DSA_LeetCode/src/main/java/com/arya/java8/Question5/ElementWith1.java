package com.arya.java8.Question5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ElementWith1 {
    public static void main(String[] args) {
        int [] num = {5,9,11,2,8,21,1};

        List<String> intStream = Arrays.stream(num)
                .boxed()
                .map(n->n + "")
                .filter(n -> n.startsWith("1")).toList();
        System.out.println(intStream);

    }
}
