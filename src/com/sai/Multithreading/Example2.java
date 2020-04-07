package com.sai.Multithreading;

public class Example2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Example by implementing the Runnable Interface");
    }
}
class TestExample2{
    public static void main(String[] args) {
        Example2 example2 = new Example2();
       Thread thread = new Thread(example2);
       thread.start();
    }
}