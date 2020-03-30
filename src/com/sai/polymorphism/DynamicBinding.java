package com.sai.polymorphism;

public class DynamicBinding {
}
class Animal2{
    void eat(){System.out.println("animal is eating...");}
}

class Dog2 extends Animal2{
    void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Animal2 a=new Dog2();
        a.eat();
    }
}