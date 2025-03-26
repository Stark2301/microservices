package com.arya.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Notication notication = FactoryMethod.getNotification("email");
        notication.notifyUser();
    }
}
