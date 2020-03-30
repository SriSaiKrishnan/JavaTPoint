package com.sai.objectclass;

public class Bike {
    String name;
    int id;

    Bike(){
        System.out.println("Bike is Created");
    }
    //Constructor Overloading

    Bike(int i){
        this.id=i;
    }

    Bike(String n){
        this.name=n;
    }

    Bike(int i, String n){
        this.id=i;
        this.name=n;
    }

    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike bike1 = new Bike(1);
        Bike bike2 = new Bike(("Yamaha"));
        Bike bike3 = new Bike(2,"KTM");
        bike.display();
        bike1.display();
        bike2.display();
        bike3.display();

        //Copying values of constructor to other
        Bike bike4 = new Bike();
        bike4.id = bike3.id;
        bike4.name = bike3.name;
        bike4.display();
    }
}
