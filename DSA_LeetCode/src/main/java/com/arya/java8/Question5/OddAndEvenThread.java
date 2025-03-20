package com.arya.java8.Question5;


class PrintNumbers {
    private int num = 1;
    private final int MAX = 10;

    public synchronized void printNumber(int remainder) {
        while (num <= MAX) {
            if (num % 2 != remainder) { // Check if it's the correct thread's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + num);
            num++;
            notify(); // Wake up the other thread
        }
    }
}

public class OddAndEvenThread {
    public static void main(String[] args) {
      PrintNumbers printNumbers = new PrintNumbers();
      Thread oddThread = new Thread(()->printNumbers.printNumber(1),"Odd Thread");
      Thread evenThread = new Thread(()->printNumbers.printNumber(0),"Even Thread");

      oddThread.start();
      evenThread.start();
    }
}
