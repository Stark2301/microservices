package com.arya.Set;

import com.arya.Stack.StackExample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(67);
        set.add(12);
        set.add(121);

        System.out.println(set);

        Set<Integer> tree = new TreeSet<>();
        tree.add(1);
        tree.add(67);
        tree.add(12);
        tree.add(121);
        System.out.println(tree);

    }
}
