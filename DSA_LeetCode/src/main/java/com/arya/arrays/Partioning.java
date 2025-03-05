package com.arya.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partioning {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5,332,5412,12,4,56,4,3,7,8);

        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);
    }
}