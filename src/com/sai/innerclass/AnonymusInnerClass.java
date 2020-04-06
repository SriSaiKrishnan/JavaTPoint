package com.sai.innerclass;
/*
A class that have no name is known as anonymous inner class in java. It should be used if you have to override method of class or interface. Java Anonymous inner class can be created by two ways:

Class (may be abstract or concrete).
Interface
 */
abstract class Person{
    abstract void print();
}

public class AnonymusInnerClass  {
    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            void print() {
                System.out.println("Hello i am inside anonymous Inner class");
            }
        };
        person.print();
    }
}
