package com.sai.stringpractice;

/*
In String class the equals method are overridden. In String Buffer and String Builder the equals class are not overridden.
 */

public class Example3 {

    public static void main(String[] args) {

        //Compare using equals and equalsIgnoreCase Method

        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = new String("Java");
        String s4 = new String("java");
        System.out.println(s3.equalsIgnoreCase(s4));// true
        System.out.println(s3.equals(s4));

        //Compare using == operator
        String s5 = new String("Hello");
        String s6 = "Hello";
        String s7 = "Hello";
        System.out.println(s5==s6); //false
        System.out.println(s7==s6); //true

        //Compare using compareTo Method
        String s8 = "Hello";
        String s9 = "All";
        String s10 = "Hello";
        System.out.println(s8.compareTo(s10));
        System.out.println(s9.compareTo(s10));
        System.out.println(s10.compareTo(s9));
    }
}
