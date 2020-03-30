package com.sai.stringpractice;

/*
In Java String object are immutable

Once string object is created its data or state can't be changed but a new string object is created.
 */

public class Example2 {

    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat("All");
        System.out.println(s1); //Prints Hello

        String s2 = "Hello";
        s2 = s2.concat("Welcome");
        System.out.println(s2); //Prints HelloWelcome
    }

}
