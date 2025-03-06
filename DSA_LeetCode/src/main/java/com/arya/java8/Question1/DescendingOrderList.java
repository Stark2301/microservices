package com.arya.java8.Question1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrderList {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,33,22,52,56,21,90,3,4,4,5);

        List<Integer> descendingOrder = list.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(descendingOrder);
    }
}
