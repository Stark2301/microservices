package com.arya.synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConcept {

    private int balance =100;

    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {

                        System.out.println(Thread.currentThread().getName() + " procceding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " Could Not Acquire Lock");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }

        if (Thread.currentThread().isInterrupted()){
            System.out.println("Thread is interruptedf");
        }
    }
}

