package com.sai.Multithreading;

/*
There are two ways to create a thread:

By extending Thread class
By implementing Runnable interface.
 */

public class Example1  extends Thread{
    public void run(){
        System.out.println("Thread Example by extending the Thread Class");
    }
}
class TestExample1{
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.start();
    }
}
