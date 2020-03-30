package com.sai.stringpractice;

/*
String Buffer is same as String except it is mutable i.e. it can be changed.
String Buffer are declared only using new keyword. No literal.
String  Builder is same as String buffer the only difference is StringBuffer are  synchronized and String Builder are non-Synchronized
 */

public class Example5 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");
        //append method
        s1.append("Welcome");
        System.out.println(s1);
        //Insert method
        s1.insert(2,"Java");
        System.out.println(s1);
        //replace method
        s1.replace(2,6,"Kava");
        System.out.println(s1);
        //delete method
        s1.delete(2,6);
        System.out.println(s1);
        //reverse a string
        s1.reverse();
        System.out.println(s1);
       //capacity
        System.out.println( s1.capacity());
        //ensureCapacity
        s1.append("Java Programming");
        s1.ensureCapacity(20); // old-capacity * 2 + 2
        System.out.println(s1.capacity());
    }
}
