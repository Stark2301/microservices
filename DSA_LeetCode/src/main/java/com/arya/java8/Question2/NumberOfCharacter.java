package com.arya.java8.Question2;

import java.util.List;

public class NumberOfCharacter {
    public static void main(String[] args) {
        List<String> coursestemp= List.of("Kubernetes", "Docker", "Cloud", "Microservices");

        List<Integer> list = coursestemp.stream().map(n -> new String(n).length()).toList();
        System.out.println(list);
    }
}