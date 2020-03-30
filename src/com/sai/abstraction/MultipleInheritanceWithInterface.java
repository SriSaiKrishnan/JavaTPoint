package com.sai.abstraction;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

public class MultipleInheritanceWithInterface implements Printable, Showable {
    @Override
    public void print() {
    System.out.println("Hello");
    }
    @Override
    public void show() {
    System.out.println("Welcome");
    }

    public static void main(String[] args) {
        MultipleInheritanceWithInterface multipleInheritanceWithInterface = new MultipleInheritanceWithInterface();
        multipleInheritanceWithInterface.print();
        multipleInheritanceWithInterface.show();
    }
}
