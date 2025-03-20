package com.arya.designPattern.FactoryDesignPattern;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("This is Email Notification");
    }
}

