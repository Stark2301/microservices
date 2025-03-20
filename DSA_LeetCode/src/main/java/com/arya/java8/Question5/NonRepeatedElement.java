package com.arya.java8.Question5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatedElement {
    public static void main(String[] args) {

        String s="ilovejavatechie";
        String [] ch = s.split("");

        String collect = Arrays.stream(ch)
                .collect(Collectors.groupingBy(Function.identity()
                        , LinkedHashMap::new
                        ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n->n.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(collect);

    }
}