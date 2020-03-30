package com.sai.javabasic;

public class Overflow {
    public static void main(String[] args) {
        //Overflow
        int a=130;
        byte b=(byte)a;
        System.out.println(a);
        System.out.println(b);
    }
}
/*
Output:

130
-126
 */