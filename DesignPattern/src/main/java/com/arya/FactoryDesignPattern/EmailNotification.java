package com.arya.FactoryDesignPattern;

public class EmailNotification implements Notication{
    @Override
    public void notifyUser() {
        System.out.println("This is Email Notification");
    }
}
