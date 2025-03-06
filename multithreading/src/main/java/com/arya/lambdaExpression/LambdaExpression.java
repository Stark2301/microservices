package com.arya.lambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable = ()->System.out.println("Hello Run");

        Thread thread = new Thread(runnable);
        thread.start();
    }
}