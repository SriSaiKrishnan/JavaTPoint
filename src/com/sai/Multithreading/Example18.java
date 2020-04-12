package com.sai.Multithreading;

import sun.jvm.hotspot.runtime.Threads;

public class Example18 {
    public synchronized static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tables of: " + number + " " + number * i);
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    class Thread5 extends Thread{
        public void run(){
           Example18.printTable(5);
        }
    }
    class Thread6 extends Thread{
        public void run(){
            Example18.printTable(10);
        }
    }

    class TestSynchronization3{
        public static void main(String[] args) {
            Thread5 thread5 = new Thread5();
            Thread6 thread6 = new Thread6();
            thread5.start();
            thread6.start();
        }
    }
