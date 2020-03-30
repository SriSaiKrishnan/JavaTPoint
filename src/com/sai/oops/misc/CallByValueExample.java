package com.sai.oops.misc;

/*
There is only call by value in java, not call by reference. If we call a method passing a value, it is known as call by value. The changes being done in the called method, is not affected in the calling method.
 */

public class CallByValueExample {
    private static int a=50;

    public void setValue(int b){
        a = a + b; // Changing the value by calling the method
    }

    public static void main(String[] args) {
        CallByValueExample callByValueExample =new CallByValueExample();
        System.out.println("Value before change " + a);
        callByValueExample.setValue(100);
        System.out.println("Value after change " + a);
    }
}
