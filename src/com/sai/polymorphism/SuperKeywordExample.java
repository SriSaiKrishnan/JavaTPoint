package com.sai.polymorphism;

/*
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.
 */

public class SuperKeywordExample {
}
//We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
class Animal {
    String color = "white";

    Animal(){System.out.println("animal is created");}

    void eat() {
        System.out.println("eating...");
    }
}
    class Dog extends Animal {
        String color = "black";

        Dog(){
            super();
            System.out.println("dog is created");
        }

        void printColor() {
            System.out.println(color);//prints color of Dog class
            System.out.println(super.color);//prints color of Animal class
        }

        void eat() {
            System.out.println("eating bread...");
        }

        void bark() {
            System.out.println("barking...");
        }

        void work() {
            super.eat();
            bark();
        }
    }
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
        d.work();
    }}