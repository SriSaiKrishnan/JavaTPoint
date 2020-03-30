package com.sai.objectclass;

public class StaticExample {
    int rollno;
    String name;
    static String college = "ITS";

    StaticExample(int r, String n){
        this.rollno=r;
        this.name=n;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
class TestExample1{
    public static void main(String[] args) {
        StaticExample staticExample1 = new StaticExample(1, "Abc");
        StaticExample staticExample2 = new StaticExample(2, "Xyz");
        staticExample1.display();
        staticExample2.display();
    }
}