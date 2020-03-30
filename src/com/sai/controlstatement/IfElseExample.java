package com.sai.controlstatement;

public class IfElseExample {
    public static void main(String[] args) {
        int age=20;
        //If Example
        if(age>18){
            System.out.println("Age greater than 18");
        }
        //If Else Example
        int number=13;
        if(number%2==0){
            System.out.println(number + " is Even Number");
        }else{
            System.out.println(number +" is Odd Number");
        }
        int year=2020;
        if(year%4==0 && year%100==0 || year%400==0){
            System.out.println("Its Leap Year");
        }else{
            System.out.println("2020 is not a Leap Year");
        }
        //Ternary Example
        String output =number%2==0? number+" is Even Number": number+" is Odd Number";
        System.out.println(output);

        //If else ladder
        int mark=70;
        if(mark<50){
            System.out.println("Fail");
        }else if(mark>=60 && mark<70){
            System.out.println("D Grade");
        }else if (mark>=70 && mark<80){
            System.out.println("C Grade");
        }

        //nested if else
        int weight=80;
        if(age>18){
            if(weight>70){
                System.out.println("Not Eligibe to Donate Blood");
            }
        }
    }
}
