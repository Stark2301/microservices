package com.arya.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('c', 1);
        map.put('a', 2);
        map.put('d', 3);

        System.out.println(map);
        System.out.println(map.get('c'));

        System.out.println(map.containsKey('a'));
    }
}