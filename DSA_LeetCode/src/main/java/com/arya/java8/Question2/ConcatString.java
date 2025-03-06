package com.arya.java8.Question2;

import java.util.List;

public class ConcatString {
    public static void main(String[] args) {

        List<String> coursestemp= List.of("Kubernetes", "Docker", "Cloud", "Microservices");
        String s = coursestemp.stream().reduce(String::concat).get();
        System.out.println(s);
    }
}