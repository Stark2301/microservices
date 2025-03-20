package com.arya.excecutorService;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;
import java.util.concurrent.*;

class DependentService implements Runnable {

    private final CountDownLatch countDownLatch;

    public DependentService(CountDownLatch countDownLatch) {
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Thread Service Started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            countDownLatch.countDown();
        }
    }
}

public class CountDownLash {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       int noOfServices =3;
        ExecutorService executorService = Executors.newFixedThreadPool(noOfServices);
       CountDownLatch countDownLatch = new CountDownLatch(noOfServices);

       countDownLatch.await(5,TimeUnit.SECONDS);
        System.out.println("Main");
        executorService.shutdown();

    }
}