package com.arya.methodInThread;

public class DaemonThread extends Thread{

    @Override
    public void run(){
           while(true){
               System.out.println("Hello World");
           }
    }

    public static void main(String[] args) {

        DaemonThread d1 = new DaemonThread();
        d1.setDaemon(true);
        d1.start();
        System.out.println("Main Done..........................................................");
    }
}
