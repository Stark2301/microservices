package com.arya.java8.Question2;

import java.util.List;

public class UppercaseString {
    public static void main(String[] args) {
        List<String> coursestemp=List.of("Kubernetes", "Docker", "Cloud", "Microservices");

        List<String> s = coursestemp.stream().map(n->new String(n).toUpperCase()).toList();
        System.out.println(s);
    }
}
