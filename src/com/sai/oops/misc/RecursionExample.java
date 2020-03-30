package com.sai.oops.misc;

/*
Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.

It makes the code compact but complex to understand.

Syntax:

returntype methodname(){
//code to be executed
methodname();//calling same method
}
 */

public class RecursionExample {

    public static int  recursion(int n) {
        int fact = 1;
        if(n==1){
            return n;
        }else{
            fact = n * recursion(n - 1);
            System.out.println(""+ fact);
           }
            return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + recursion(5));

    }

}