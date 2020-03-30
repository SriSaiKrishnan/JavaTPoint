package com.sai.abstraction;

interface AreaCalculation{
    public void draw();
    static int rectangleArea(int l, int b){
        return l*b;
    }
}

class  AreaOfRectangle implements AreaCalculation{

    @Override
    public void draw() {
    System.out.println("Drawing Rectangle");
    }
}

public class StaticMethodInterface {

    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle  = new AreaOfRectangle();
        areaOfRectangle.draw();
        System.out.println("Area of Recatangle is "+ AreaCalculation.rectangleArea(4,45));
    }
}
