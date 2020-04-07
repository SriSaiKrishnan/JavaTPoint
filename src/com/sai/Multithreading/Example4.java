package com.sai.Multithreading;

/*
Cannot start the same thread twice
 */

public class Example4 extends Thread{
    public void run() {
        System.out.println("Running");
        }

    public static void main(String[] args) {
        Example4 thread1 = new Example4();
        thread1.start();
        thread1.start();
    }
}
