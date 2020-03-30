package com.sai.stringpractice;

/*
String Concatenation
1. Using + operator
2. Using concat method
 */

public class Example4 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Welcome";
        //Concat using + operator
        System.out.println(s1+s2);
        //Concat using concat method
        System.out.println(s1.concat(s2));
    }
}
