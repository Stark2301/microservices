package com.arya.List;

import java.util.Arrays;
import java.util.List;

public class CopyList {
    public static void main(String[] args) {

        List<Integer> originalList = Arrays.asList(1,2,3,4,5);
        List<Integer> copyList = List.copyOf(originalList);

        System.out.println(copyList);

        originalList.add(22);
        System.out.println(originalList);





    }
}
