package com.sai.arrayexample;

public class Example1 {
    public static void main(String[] args) {
        int []a = new int[5];
        a[0] = 4;
        a[1] = 2;
        a[2] = 9;
        a[3] = 6;
        a[4] = 0;

        int b[]={33,3,4,5};//declaration, instantiation and initialization

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]); //traversing the array
        }

        for (int i  : b){
            System.out.println(i); //traversing through for each
        }
    }
}
