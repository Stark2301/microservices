package com.arya.java8.Question3;

import java.util.Comparator;
import java.util.List;

public class SecondHighestScore {
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


        Courses courses1 = courses.stream().sorted(Comparator.comparing(Courses::getNoOfStudents).reversed()).skip(1).findFirst().get();
        System.out.println(courses1);
    }
}
