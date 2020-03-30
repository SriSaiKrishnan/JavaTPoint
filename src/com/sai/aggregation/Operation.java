package com.sai.aggregation;

//represents HAS-A relationship.

public class Operation {
    int square(int n){
        return  n*n;
    }
}
class Circle{
    final static double PI=3.14;
    Operation op;
    double area(int radius){
       op = new Operation();
       int square = op.square(radius);
       return PI*square;
    }

    public static void main(String[] args) {
        Circle circle =  new Circle();
        double result = circle.area(5);
        System.out.println(result);
    }
}