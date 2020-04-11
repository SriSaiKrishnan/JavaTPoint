package com.sai.Multithreading;

public class Example10 extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("The Thread is Daemon Thread: " + Thread.currentThread().getName());
        }else{
            System.out.println("User Thread");
        }
    }

    public static void main(String[] args) {
        Example10 thread1 = new Example10();
        Example10 thread2 = new Example10();
        Example10 thread3 = new Example10();
        thread1.setDaemon(true); //Setting the Thread as Daemon
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
/*
 Note: If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.
 */