package com.sai.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
 */

public class Example11 implements Runnable  {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Starting");
        processMessage();
        System.out.println(Thread.currentThread().getName() + "End");
    }

    private void processMessage()  {
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=1;i<=10;i++){
            Runnable worker = new Example11();
            executorService.execute(worker);
        }
        executorService.shutdown();
    }
}
