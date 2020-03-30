package com.sai.exceptionpractice;

public class Example1  {
    public static void test(){
        try{
            String s1 = null;
            System.out.println(s1.length());
        }catch (NullPointerException ex){
            ex.printStackTrace();
            System.out.println("String is Null");
        }
    }
    public static void print(){
        System.out.println("Welcome to Exception Handling");
    }
    public static void main(String[] args) {
        test();
        print();
    }
}
