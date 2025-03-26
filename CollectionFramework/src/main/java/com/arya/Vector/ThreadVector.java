package com.arya.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadVector {
    public static void main(String[] args) {

        Vector<Integer> list = new Vector<>();

        Thread t1 = new Thread(()->{
            for (int i=0;i<1000;i++){
               list.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i=0;i<1000;i++){
                list.add(i);
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Size of list is " + list.size());
    }
}