package com.arya.designPattern.FactoryDesignPattern;

public class NotificationFactoryMethod {
    public static Notification getNotification(String type){

        if (type==null){
            return null;
        }

        switch (type.toLowerCase()){
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            case "sms":
                return new SmsNotification();
            default:
                throw new RuntimeException("Wrong Notification");
        }
    }
}
