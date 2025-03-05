package com.arya.methodInThread;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){

            for (int i =0;i<5;i++){
                System.out.println(Thread.currentThread().getName() + " is running");
                Thread.yield();
            }
        }

    public static void main(String[] args) throws InterruptedException {

        MyThread l = new MyThread("Low");
       MyThread m = new MyThread("Medium");
  /*        MyThread h = new MyThread("High");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
*/
        l.start();
        m.start();;
//        m.start();
//        h.start();
//        myThread.start();
//        myThread.join();




    }
}
