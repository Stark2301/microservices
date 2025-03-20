package com.arya.java8.Question5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int [] number = {5,9,11,2,8,21,1};

//            Arrays.stream(number).boxed().collect(Comparator.comparingInt(number).reversed())
       Integer sorted = Arrays.stream(number).boxed()
                .sorted(Comparator.reverseOrder())
               .skip(1)
               .findFirst().get();
        System.out.println(sorted);
    }
}
