package com.arya.excecutorService;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class runnableJobs implements Callable{

    @Override
    public Object call() throws Exception {
        return null;
    }
}


class PrintJobs implements Runnable{

    String name;

    PrintJobs(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+"..Job Started By Thread: "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name+"..Job completed by Thread "+ Thread.currentThread().getName());
    }
}
public class ExcecutorExample {
    public static void main(String[] args) {

        PrintJobs[] jobs = {new PrintJobs("durga"),
                new PrintJobs("Ravi"),
                new PrintJobs("shiva"),
                new PrintJobs("manish"),
                new PrintJobs("kunal"),
                new PrintJobs("chandan"),
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (PrintJobs printJobs : jobs) {
            executorService.submit(printJobs);
        }
        executorService.shutdown();
    }
}