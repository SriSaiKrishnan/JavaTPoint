package com.sai.arrayexample;

public class Example5 {
    public static void main(String[] args) {
        int a[] = {33,34,3,59};
        int b[] = new int[2];
        System.arraycopy(a,2,b,0,2);
        for(int c:b){
            System.out.println(c);
        }
    }
}
