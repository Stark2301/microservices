package com.arya.synchronization;

public class MainThread extends Thread{

    private Counter counter;

    public MainThread(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
