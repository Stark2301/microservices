package com.arya.FactoryDesignPattern;

public class SmsNotification implements Notication{
    @Override
    public void notifyUser() {
        System.out.println("This is Sms Notification");
    }
}
