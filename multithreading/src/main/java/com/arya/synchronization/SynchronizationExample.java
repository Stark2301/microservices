package com.arya.synchronization;

public class SynchronizationExample{
    public static void main(String[] args) {

        Counter c = new Counter();
        MainThread t1= new MainThread(c);
        MainThread t2 = new MainThread(c);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(c.getCount());
    }
}