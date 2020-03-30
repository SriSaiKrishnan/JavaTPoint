package com.sai.abstraction;

interface Drawablee{

    public void draw();

    default void mgs(){
        System.out.println("Hello"); //Since Java 8, we can have method body in interface. But we need to make it default method
    }
}

class Rectanglee implements Drawablee{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}


public class InterfaceWithDefaultMethod {
    public static void main(String[] args) {
        Rectanglee rectanglee = new Rectanglee();
        rectanglee.mgs();
        rectanglee.draw();
    }


}
