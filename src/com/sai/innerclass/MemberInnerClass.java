package com.sai.innerclass;

/*
There are basically three advantages of inner classes in java. They are as follows:

1) Nested classes represent a special type of relationship that is it can access all the members (data members and methods) of outer class including private.

2) Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.

3) Code Optimization: It requires less code to write.
 */

public class MemberInnerClass {

    private int a = 50;

    class Example1{
        public void msg(){
            System.out.println("Value of a is " + a);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.Example1  example1 = memberInnerClass.new Example1();
    }
}