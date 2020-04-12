package com.sai.Multithreading;

/*
Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects.

There are many ways:
By nulling the reference
By assigning a reference to another
By anonymous object etc.
 */
public class Example14 {
    public void finalize(){
        System.out.println("Object is Garbage Collected");
    }

    public static void main(String[] args) {
        Example14 example1 = new Example14();
        Example14 example2 = new Example14();
        example1 = null;
        example2 = null;
        System.gc();
    }
}
