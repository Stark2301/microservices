package com.arya.SingletonDesignPattern.Cloneable;

public class ClonableSingleton implements Cloneable{

    private static final ClonableSingleton instance=new ClonableSingleton();

    private ClonableSingleton(){}

    public static ClonableSingleton clonableSingleton(){
        return instance;
    }

    @Override
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
//        throw  new CloneNotSupportedException("Singleton cannot be clonned");
    }
}
