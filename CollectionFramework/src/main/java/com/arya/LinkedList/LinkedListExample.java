package com.arya.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        list.addFirst(2);
        System.out.println(list);
        list.addLast(10);
        System.out.println(list);
        list.add(3,19);
        System.out.println(list);
        list.add(3,20);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
       int b = list.getFirst();
        System.out.println(b);
        int c= list.getLast();
        System.out.println(c);

//        list.removeIf(x->x%2!=0);
        System.out.println(list);

    }
}
