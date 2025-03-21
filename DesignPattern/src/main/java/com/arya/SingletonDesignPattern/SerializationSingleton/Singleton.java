package com.arya.SingletonDesignPattern.SerializationSingleton;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }
}