package com.sai.javabasic;

public class Widening {
    public static void main(String[] args) {
        int a=10;
        float f=a; //widening
        System.out.println(a);
        System.out.println(f);
    }
}

/*
Output:

10
10.0
 */