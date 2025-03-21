package com.arya.SingletonDesignPattern.Enum;

public class EnumSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;

        singleton.show();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}