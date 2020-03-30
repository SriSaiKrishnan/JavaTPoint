package com.sai.abstraction;

import java.sql.SQLOutput;

interface Printablee{
    public default void print(){
        System.out.println("Printing in Printablee");
    }
}

interface Showablee{
    public default void print(){
        System.out.println("Printing in Showablee");
    }
}

public class AmbiguityExample implements Printablee,Showablee {

    @Override
    public void print() {  //No Ambiguity
        System.out.println("Printing");
    }

    public static void main(String[] args) {
        AmbiguityExample ambiguityExample = new AmbiguityExample();
        ambiguityExample.print();
    }
}
