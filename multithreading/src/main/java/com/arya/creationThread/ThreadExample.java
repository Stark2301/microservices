package com.arya.creationThread;

public class ThreadExample extends Thread{

        @Override
        public void run() {
            for ( ; ;){
                System.out.println(Thread.currentThread().getName());
            }
        }
    }