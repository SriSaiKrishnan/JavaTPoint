package com.sai.Multithreading;
/*
Synchronization in java is the capability to control the access of multiple threads to any shared resource.
Java Synchronization is better option where we want to allow only one thread to access the shared resource.
 */
public class Example17 {
     void printTable(int n) {
         synchronized(this) { //synchronized Block
             /*
             Synchronized block can be used to perform synchronization on any specific resource of the method.
             Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use synchronized block.
              */
         for (int i = 1; i <= 5; i++) {
             System.out.println(n * i);
             try {
                 Thread.sleep(400);
             } catch (Exception e) {
                 System.out.println(e);
             }
         }
     }
    }
}
class MyThread3 extends Thread{
    Example17 t;
    MyThread3(Example17 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread4 extends Thread{
    Example17 t;
    MyThread4(Example17 t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
class TestSynchronization2{
    public static void main(String args[]){
        Example17 obj = new Example17();//only one object
        MyThread3 t1=new MyThread3(obj);
        MyThread4 t2=new MyThread4(obj);
        t1.start();
        t2.start();
    }
}