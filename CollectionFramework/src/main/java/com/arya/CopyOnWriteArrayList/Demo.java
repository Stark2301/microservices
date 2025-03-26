package com.arya.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Litchi");

        System.out.println(list);

        Iterator<String> l = list.iterator();

        while (l.hasNext()){
            String item = l.next();
            if (item.equals("Banana")){
                l.remove();
            }
        }

        System.out.println(list);

    }
}