package com.sai.arrayexample;

public class Example6 {
    public static void main(String[] args) {
        int a [] = {2,54,7,23};
        int b[] = new  int[5];
        b=a.clone();
        for (int c : b){
            System.out.println(b);
        }
    }
}
