package com.arya.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"ABC");
        linkedHashMap.put(2,"XYZ");
        linkedHashMap.put(3,"sweat");

        System.out.println(linkedHashMap);
    }
}
