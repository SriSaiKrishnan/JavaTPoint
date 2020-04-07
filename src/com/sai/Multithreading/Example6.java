package com.sai.Multithreading;
/*
The join() method waits for a thread to die. In other words, it causes the currently running threads to stop executing until the thread it joins with completes its task.
 */
public class Example6 extends  Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Example6 thread1 = new Example6();
        Example6 thread2 = new Example6();
        Example6 thread3 = new Example6();
        thread1.start();
        try{
            thread1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();
    }
}