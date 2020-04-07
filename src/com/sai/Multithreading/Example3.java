package com.sai.Multithreading;

public class Example3 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Example3 thread1 = new Example3();
        Example3 thread2 = new Example3();
        thread1.start();
        thread2.start();
    }
}
