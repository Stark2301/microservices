package com.arya.SingletonDesignPattern.Cloneable;

public class CloneableBreakingSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {


        ClonableSingleton c1 = ClonableSingleton.clonableSingleton();
        ClonableSingleton c2 = (ClonableSingleton) c1.clone();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());



    }

}
