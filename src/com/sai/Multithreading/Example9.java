package com.sai.Multithreading;

public class Example9 extends Thread {
    public void run(){
        System.out.println("Thread Name " + Thread.currentThread().getName());
        System.out.println("Thread Priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Example9 thread1 = new Example9();
        Example9 thread2 = new Example9();
        thread1.setPriority(MIN_PRIORITY); // Setting Priority
        thread2.setPriority(MAX_PRIORITY); // Setting Priority
        thread1.start();
        thread2.start();
    }
}
