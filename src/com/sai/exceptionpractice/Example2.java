package com.sai.exceptionpractice;
/*
If we dint handle the exception with try catch block the rest of the code will not execute. It terminates the program
 */
public class Example2 {
    public static void main(String[] args) {
        try {
            int i = 50 / 0;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide the number by Zero");
        }
        System.out.println("Rest of the code");
    }
}
