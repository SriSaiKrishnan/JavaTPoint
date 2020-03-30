package com.sai.inheritance;

class Animal{
    void eat(){System.out.println("eating...");}
}

//Single Inheritance

class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }}

//Multilevel Inheritance : Dog acquire base class property and Baby dog acquire Dog class property

class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}
class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}

//Hierarchical Inheritance: Dog acquire base class property animal and cat acquire base class property  animal

class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
//c.bark();//C.T.Error
    }}  