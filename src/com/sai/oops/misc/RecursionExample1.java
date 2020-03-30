package com.sai.oops.misc;

public class RecursionExample1 {
    static void test(){
        System.out.println("Hello");
        test();
    }

    public static void main(String[] args) {
        test();
    }
}
