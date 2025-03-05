package com.arya;

class A{

    public void start(){
        System.out.println("Arya had started");
    }
}

class B extends A{

    public void end(){
        System.out.println("Arya had ended");
    }
}

public class Inherita {
    public static void main(String[] args) {
        B b = new B();
        b.start();
        b.end();
    }
}
