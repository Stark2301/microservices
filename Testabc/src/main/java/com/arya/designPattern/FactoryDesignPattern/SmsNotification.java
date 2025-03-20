package com.arya.designPattern.FactoryDesignPattern;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("This is SMS Notification");
    }
}