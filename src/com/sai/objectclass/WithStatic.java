package com.sai.objectclass;

public class WithStatic {
    static int count;
    WithStatic(){
        count++;
        System.out.println(count);
    }
}
class TestExample2{
    //Static Block executed before main method
    static{System.out.println("static block is invoked");}
    public static void main(String[] args) {
        WithStatic withStatic1 = new WithStatic();
        WithStatic withStatic2 = new WithStatic();
        WithStatic withStatic3 = new WithStatic();
    }
}