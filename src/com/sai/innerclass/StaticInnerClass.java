package com.sai.innerclass;

/*
A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. It can be accessed by outer class name.

It can access static data members of outer class including private.
Static nested class cannot access non-static (instance) data member or method.
 */

public class StaticInnerClass {
    static int data = 50;
    static class Inner{
        void display(){
            System.out.println("Data: " + data);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.Inner staticInnerClass = new StaticInnerClass.Inner();
          staticInnerClass.display();
    }
}
