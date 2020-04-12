package com.sai.Multithreading;

public class Example20  {
    int amount = 10000;
    synchronized void withdraw(int amt){
        if(amount<amt) {
            System.out.println("Less Balance Waiting for Deposit");
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        amount  = amount - amt;
        System.out.println("Withdraw Completed");
    }
    synchronized void deposit(int amt){
        System.out.println("Going to deposit");
        amount = amount + amt;
        try {
            notify();
            System.out.println("Deposit Completed");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Example20 example20 = new Example20();
        Thread t1 = new Thread(){
          public void run(){
             example20.withdraw(20000);
          }
        };
        Thread t2 = new Thread(){
            public void run(){
                example20.deposit(20000);
            }
        };
        t1.start();
        t2.start();
    }
}
