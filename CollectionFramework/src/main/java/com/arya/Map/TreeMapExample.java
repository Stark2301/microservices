package com.arya.Map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {


        TreeMap<Integer,String> map = new TreeMap<>((o1, o2) -> -o1.compareTo(o2));
        map.put(1,"Arya");
        map.put(3,"Chandan");
        map.put(2,"Prince");

        System.out.println(map);
//        NavigableMap<Integer, String> integerStringNavigableMap = map.descendingMap();
//        System.out.println(integerStringNavigableMap);
    }
}
