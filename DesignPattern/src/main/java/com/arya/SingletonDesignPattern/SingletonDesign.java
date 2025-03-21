package com.arya.SingletonDesignPattern;

public class SingletonDesign {

    private static  SingletonDesign singletonDesign;

    private SingletonDesign(){
    }

    public synchronized static SingletonDesign getSingletonDesign(){
        if (singletonDesign==null) {
                singletonDesign = new SingletonDesign();
            }

        return singletonDesign;
    }
}