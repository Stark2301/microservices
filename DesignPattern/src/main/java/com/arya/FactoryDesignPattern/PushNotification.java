package com.arya.FactoryDesignPattern;

public class PushNotification implements Notication{
    @Override
    public void notifyUser() {
        System.out.println("This is Push Notification");
    }
}
