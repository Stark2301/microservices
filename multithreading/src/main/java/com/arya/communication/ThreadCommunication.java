package com.arya.communication;

class SharedResource{

    private int data;
    private boolean hashData;

    public synchronized void produce(int value){
        while (hashData){
            try{
                wait();
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
            }
        }
        data=value;
        hashData=true;
        System.out.println("Produced Value  " + value);
        notify();
    }

    public synchronized int consume(){

        while (!hashData){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hashData=false;
        notify();
        System.out.println("Consumed Value " + data);

        return data;
    }
}

class Producer implements Runnable{
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }


    @Override
    public void run() {
         for (int i=0;i<10;i++){
             sharedResource.produce(i);
         }
    }
}

class Consumer implements Runnable{

    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        for (int j=0;j<10;j++){
           sharedResource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));
        producerThread.start();
        consumerThread.start();
    }
}
