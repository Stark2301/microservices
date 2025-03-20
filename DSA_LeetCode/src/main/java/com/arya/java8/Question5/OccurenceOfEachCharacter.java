package com.arya.java8.Question5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String s ="ilovejavatechie";

        String [] result = s.split("");
        Map<String, Long> collect = Arrays.stream(result)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

   /*     String p = new String("Arya");
        String t = new String("Arya").intern();
        System.out.println(p==t);
        System.out.println(p.equals(t));*/

    }
}
