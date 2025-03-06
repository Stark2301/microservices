package com.arya.java8.Question2;

import java.util.List;

public class FilterOutString {
    public static void main(String[] args) {

        List<String> coursestemp= List.of("Kubernetes", "Docker", "Cloud", "Microservices");

        List<String> list = coursestemp.stream().filter(n -> n.length() > 5).toList();

        System.out.println(list);
    }
}