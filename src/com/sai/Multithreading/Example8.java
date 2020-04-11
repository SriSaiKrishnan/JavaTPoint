package com.sai.Multithreading;

public class Example8 extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName()); // Getting the current Thread  Name
    }
    public static void main(String[] args) {
       Example8 thread1 = new Example8();
       Example8 thread2 = new Example8();
       System.out.println("Name of thread 1" + thread1.getName());
       System.out.println("Name of thread 2" + thread2.getName());
       thread1.start();
       thread2.start();
       thread1.setName("First Thread"); // Setting the Thread Name
       thread2.setName("Second Thread"); // Setting the Thread Name
       System.out.println(thread1.getName());
       System.out.println(thread2.getName());
    }
}
