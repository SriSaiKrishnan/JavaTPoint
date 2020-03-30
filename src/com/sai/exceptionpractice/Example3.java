package com.sai.exceptionpractice;
/*
Handling the unchecked exception
 */
public class Example3 {
    public static void main(String[] args) {
        int a[] = {1,5,62,6};
        try {
            for(int i=0;i<=a.length;i++){
                System.out.println(a[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){ // Handling unchecked Exception
            ex.printStackTrace();
            System.out.println("Array index out of bound");
        }
        System.out.println("Rest of the code");
    }
}
