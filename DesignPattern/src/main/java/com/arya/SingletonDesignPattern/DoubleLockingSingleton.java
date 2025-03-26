package com.arya.SingletonDesignPattern;

public class DoubleLockingSingleton {

    private static DoubleLockingSingleton instance;

    private DoubleLockingSingleton() {

    }

    public static DoubleLockingSingleton doubleLockingSingleton() {
        if (instance == null) {
            synchronized (DoubleLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }
}
