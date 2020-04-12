package com.sai.Multithreading;
/*
Synchronization in java is the capability to control the access of multiple threads to any shared resource.
Java Synchronization is better option where we want to allow only one thread to access the shared resource.
 */
public class Example16 {
    synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}
class MyThread1 extends Thread{
    Example16 t;
    MyThread1(Example16 t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    Example16 t;
    MyThread2(Example16 t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}
class TestSynchronization1{
    public static void main(String args[]){
        Example16 obj = new Example16();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}