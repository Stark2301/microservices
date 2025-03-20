package com.arya.collectionFramework;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {
        String s = "ilovemyindia";

        String [] p=s.split("");

        Map.Entry<String, Long> stringLongEntry = Arrays.stream(p).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(n -> n.getValue() == 1).findFirst().get();

        System.out.println(stringLongEntry);
    }
}
