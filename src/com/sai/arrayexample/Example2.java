package com.sai.arrayexample;

public class Example2 {
    public static void main(String[] args) {
    int a[] = {33,3,65,2};
    System.out.println("Minimum Value in the Array is " + min(a));
    }

    public static int min(int a[]){
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return min;
    }

}
