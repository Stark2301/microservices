package com.arya.lifeCycle;

public class StatesInThread extends Thread{

    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        StatesInThread thread = new StatesInThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(100);
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());

    }
}
