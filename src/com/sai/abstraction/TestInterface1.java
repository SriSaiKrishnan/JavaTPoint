package com.sai.abstraction;

interface Drawable{
    void draw();
}

class Circle implements Drawable{

    @Override
    public void draw() {
    System.out.println("Drawing Circle");
    }
}

class Rectangle implements Drawable{

    @Override
    public void draw() {
    System.out.println("Drawing Rectangle");
    }
}

public class TestInterface1 {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}
