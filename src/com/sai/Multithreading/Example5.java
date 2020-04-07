package com.sai.Multithreading;
/*
Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.
 */
public class Example5 extends Thread {
    public void run(){
       for(int i=1;i<=5;i++){
           System.out.println(i);
       }
    }

    public static void main(String[] args) {
        Example5 thread1 = new Example5();
        Example5 thread2 = new Example5();
        thread1.run(); // Calling run method directly
        thread2.run();
    }
}

/*
o/p
1
2
3
4
5
1
2
3
4
5
 */