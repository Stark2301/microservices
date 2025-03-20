package com.arya.designPattern.FactoryDesignPattern;

import java.util.concurrent.locks.ReentrantLock;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("This is Push Notification");
    }
}