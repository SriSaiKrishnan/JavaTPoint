package com.sai.Multithreading;

public class Example19 {

    public static void main(String[] args) {
        final String resource1 = "Hello";
        final String resource2 = "Hi All";
        Thread t1 = new Thread(){
            public void run(){
                synchronized (resource1){
                    System.out.println("Locking Resource 1");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                synchronized (resource2){
                    System.out.println("Locking Resource 2");
                    try{
                        Thread.sleep(100);
                    }catch (Exception  e){
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("Locking Resource 2");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                synchronized (resource1){
                    System.out.println("Locking Resource 1");
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
