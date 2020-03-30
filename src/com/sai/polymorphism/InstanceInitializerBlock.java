package com.sai.polymorphism;

public class InstanceInitializerBlock {
}
//Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.

class Bike7{
    int speed;

    Bike7(){System.out.println("speed is "+speed);}

    {speed=100;}

    public static void main(String args[]){
        Bike7 b1=new Bike7();
        Bike7 b2=new Bike7();
    }
}
//What is invoked first, instance initializer block or constructor?
class Bike8{
    int speed;

    Bike8(){System.out.println("constructor is invoked");}

    {System.out.println("instance initializer block invoked");}

    public static void main(String args[]){
        Bike8 b1=new Bike8();
        Bike8 b2=new Bike8();
    }
}

/*
Rules for instance initializer block :
There are mainly three rules for the instance initializer block. They are as follows:
The instance initializer block is created when instance of the class is created.
The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
The instance initializer block comes in the order in which they appear.
 */

class A1{
    A1(){
        System.out.println("parent class constructor invoked");
    }
}

class B3 extends A1{
    B3(){
        super();
        System.out.println("child class constructor invoked");
    }

    B3(int a){
        super();
        System.out.println("child class constructor invoked "+a);
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]){
        B3 b1=new B3();
        B3 b2=new B3(10);
    }
}