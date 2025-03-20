package com.arya.java8.Question3;

import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(111, "Arya", 23, "Female", "HR", 2020, 20201.50),
                new Student(112, "Kunal", 21, "Male", "Java", 2019, 236.23),
                new Student(113, "John", 22, "Male", "HR", 2019, 23658.23));

        Student student = students.stream().sorted(Comparator.comparingDouble(Student::getSalary).reversed()).skip(1).findFirst().get();
        System.out.println(student.toString());
    }
}
