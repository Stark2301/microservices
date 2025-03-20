package com.arya.designPattern.SingletonDesignPattern;

public class SingletonExample {

    private static SingletonExample singletonExample;

    private SingletonExample() {

    }

    public synchronized static SingletonExample getSingletonExample() {

        if (singletonExample == null) {

            synchronized (SingletonExample.class) {
                if (singletonExample == null) {
                    singletonExample = new SingletonExample();
                }
            }
        }
            return singletonExample;
    }
}
