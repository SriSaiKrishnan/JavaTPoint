package com.sai.objectclass;

public class ThisExample {
    int rollno;
    String name;
    float fee;

    ThisExample(){
        System.out.println("Inside Constructor");
    }

    ThisExample(int rollno, String name, float fee){
        this();
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }

    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
        //m();//same as this.m()
        this.m();
    }

    void display(){
        System.out.println(rollno + " " + name + " " + fee);
    }
}
class ThisExample1{
    public static void main(String[] args) {
        ThisExample thisExample = new ThisExample(1, "abc", 234);
        thisExample.display();
        thisExample.n();
    }
}