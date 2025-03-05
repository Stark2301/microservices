package com.arya;

import com.arya.creationThread.RunnableExample;

public class Main {
    public static void main(String[] args) {

      /* By Extending Thread Class

        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
      */

        /* By Implementing Runnable Interface



        */

        RunnableExample runnableExample = new RunnableExample();
        Thread threadExample = new Thread(runnableExample);
        threadExample.start();
        for (; ; ) {
            System.out.println("Hello ");
        }
    }
}