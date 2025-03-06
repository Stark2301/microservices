package com.arya.java8.Question2;

import java.util.Collections;
import java.util.List;

public class SortedOrder {
    public static void main(String[] args) {
        List<String> coursestemp= List.of("Kubernetes", "Docker", "Cloud", "Microservices");

        List<String> list = coursestemp.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(list);
    }
}