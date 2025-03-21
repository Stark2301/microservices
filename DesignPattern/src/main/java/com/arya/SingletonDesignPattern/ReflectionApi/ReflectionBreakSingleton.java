package com.arya.SingletonDesignPattern.ReflectionApi;

public class ReflectionBreakSingleton {
    private static ReflectionBreakSingleton instance;

    private  ReflectionBreakSingleton(){
        if(instance !=null){
            throw  new RuntimeException("Singleton Cannot be break");
        }
    }

    public static ReflectionBreakSingleton reflectionBreakSingleton(){
        if (instance==null){
            instance=new ReflectionBreakSingleton();
        }
        return instance;
    }
}