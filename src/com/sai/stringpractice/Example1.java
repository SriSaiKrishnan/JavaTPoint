package com.sai.stringpractice;

/*
String  is a sequence of character
String can be created using
1.String Literal
2.With help of new keyword
 */

public class Example1 {
    public static void main(String[] args) {
        String s1 = "Java"; //Using String Literal
        char[] ch = {'S','t','r','i','n','g'};
        String s2 = new String(ch); // Using new keyword
        String s3 = new String("Example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
