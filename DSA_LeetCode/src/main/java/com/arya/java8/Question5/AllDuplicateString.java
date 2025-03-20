package com.arya.java8.Question5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllDuplicateString {
    public static void main(String[] args) {

        String s = "ilovejavatechie";
        String [] ch = s.split("");

      List<String> collect = Arrays.stream(ch)
              .collect(Collectors.groupingBy(
                      Function.identity(),
                      Collectors.counting()))
              .entrySet().stream().filter(n->n.getValue()>1)
              .map(Map.Entry::getKey).toList();
        System.out.println(collect);
    }
}
