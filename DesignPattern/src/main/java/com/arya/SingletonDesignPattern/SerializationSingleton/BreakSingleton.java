package com.arya.SingletonDesignPattern.SerializationSingleton;

import java.io.*;

public class BreakSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Singleton singleton = Singleton.getInstance();

        //Serialize
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        objectOutputStream.writeObject(singleton);
        objectOutputStream.close();

        //DeSerialize
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton singleton1 = (Singleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
