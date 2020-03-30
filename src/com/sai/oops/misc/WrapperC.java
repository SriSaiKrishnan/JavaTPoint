package com.sai.oops.misc;

/*
The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.

Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.
 */

public class WrapperC {

    //Autoboxing

    public static void autobox(){
        int a = 10;
        Integer b = Integer.valueOf(a); //Converting to Integer Object
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }

    public static void unbox(){
        Integer a = new Integer(2);
        int b = a.intValue(); // Converting Integer object to primitive data type
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }

    public static void main(String[] args) {
        autobox();
        unbox();
    }
}
