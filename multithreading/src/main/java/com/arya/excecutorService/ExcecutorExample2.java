package com.arya.excecutorService;

import java.util.concurrent.*;

class MyCallable implements Callable{

    int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() +" is responsible to find sum of first " + num + "numbers");
        int sum=0;
        for (int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
}

public class ExcecutorExample2 {
    public static void main(String[] args) throws Exception {
           MyCallable [] jobs = {new MyCallable(10),
           new MyCallable(20),
           new MyCallable(30),
           new MyCallable(40),
           new MyCallable(50)};

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (MyCallable c : jobs){
            Future f = service.submit(c);
            System.out.println(f.get());
        }
        service.shutdown();
    }
}
