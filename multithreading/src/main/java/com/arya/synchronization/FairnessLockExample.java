package com.arya.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    private final Lock unfairLocks = new ReentrantLock(true);

    public void accessResource(){
        unfairLocks.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock. ");
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " released the locks");
            unfairLocks.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        FairnessLockExample fairnessLockExample = new FairnessLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairnessLockExample.accessResource();
            }
        };

        Thread t1 = new Thread(task,"Thread-1");
        Thread.sleep(50);
        Thread t2 = new Thread(task,"Thread-2");
        Thread.sleep(50);
        Thread t3 = new Thread(task,"Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }

}
