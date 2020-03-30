package com.sai.polymorphism;

/*
When type of the object is determined at compiled time(by the compiler), it is known as static binding.

If there is any private, final or static method in a class, there is static binding.
 */

public class StaticBinding {
}
class Dog1{
    private void eat(){System.out.println("dog is eating...");}

    public static void main(String args[]){
        Dog1 d1=new Dog1();
        d1.eat();
    }
}