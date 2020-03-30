package com.sai.javabasic;

public class LogicalOperatorExample {

    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b && a<c);
        System.out.println( a<b && a++<c);
        System.out.println(a);
        System.out.println(a<b & a++<c);
        System.out.println(a);

        System.out.println(a<c || a>c);
        System.out.println(a<c || a++<b);
        System.out.println(a);
    }
}
