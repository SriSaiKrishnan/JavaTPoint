package com.sai.abstraction;

interface A{
     void A();
     void B();
     void C();
     void D();
}
//No Rule that Abstarct class should Override/implement all methods of interface
abstract class B implements  A{
    public void C(){
        System.out.println("Inside C");
    }
}

//Normal class should Override/implement all methods of interface
public class Example1 extends B{
    @Override
    public void A() {
    System.out.println("Inside A");
    }

    @Override
    public void B() {
    System.out.println("Inside B");
    }

    @Override
    public void D() {
    System.out.println("Inside D");
    }
}
