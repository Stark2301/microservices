package com.arya.creationThread;

public class RunnableExample implements Runnable{
    @Override
    public void run() {
        for ( ; ;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}