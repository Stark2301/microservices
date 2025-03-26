package com.arya.List;

import com.arya.Map.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 4 5 1 2 3

public class TestQuestion {
    public static void main(String[] args) {

        /*
        List<?> list = new ArrayList<>();
        list.add(1); //this will give compilation error
        */

        List<? super Object> list1 = new ArrayList<>();
        list1.add("Arya");





    }
}