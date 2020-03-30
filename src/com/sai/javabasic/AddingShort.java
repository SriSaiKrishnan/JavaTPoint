package com.sai.javabasic;

public class AddingShort {

    public static void main(String[] args) {
        short a=10;
        short b=5;
        // a = a+b; //Compile time error because 10+10=20 now int
        a = (short) (a+b);
        System.out.println(a);
    }
}
