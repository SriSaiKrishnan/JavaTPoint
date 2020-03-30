package com.sai.arrayexample;

//Anonymous Array
public class Example3 {
    public static void main(String[] args) {
    printArray(new int[]{3,4,5});
    }
    public static void printArray(int a[]){
        for (int i:
             a) {
            System.out.println(i);
        }
    }
}
