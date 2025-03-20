package com.arya.java8.exception;

public class ExceptionExample {

    public void m1(){

        try{
            System.out.println("try block");
        }finally {
            System.out.println("Finally Block");
        }
    }

    @Override
    protected void finalize() throws Throwable{

        System.out.println("This is Finalize Method");
    }
    public static void main(String[] args) {

        ExceptionExample exceptionExample = new ExceptionExample();
        exceptionExample.m1();
        exceptionExample=null;
        System.gc();
    }
}
