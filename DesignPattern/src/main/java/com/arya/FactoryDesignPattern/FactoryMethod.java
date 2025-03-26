package com.arya.FactoryDesignPattern;

public class FactoryMethod {

      public static Notication getNotification(String type){

          if(type == null || type.isEmpty()){
              return null;
          }

          switch (type.toLowerCase()) {
              case "email":
                  return new EmailNotification();
              case "sms":
                  return new SmsNotification();
              case "push":
                  return new SmsNotification();
              default:
                  throw new RuntimeException("No Notification found");
          }
      }
}
