package com.arya.java8.Question3;

import java.util.List;

public class ReviewScore {
    public static void main(String[] args) {
        List<Courses> courses = List.of(new Courses("Spring", "Framework", 98, 20000),
                new Courses("Spring Boot", "Framework", 95, 18000),
                new Courses("API", "Microservices", 97, 22000),
                new Courses("Microservices", "Microservices", 96, 25000),
                new Courses("FullStack", "FullStack", 91, 14000),
                new Courses("AWS", "Cloud", 92, 21000),
                new Courses("Azure", "Cloud", 99, 21000),
                new Courses("Docker", "Cloud", 92, 20000),
                new Courses("Kubernetes", "Cloud", 91, 20000));


        List<Courses> list = courses.stream().filter(n -> n.getReviewScore() > 95).toList();

        System.out.println(list);
    }
}
