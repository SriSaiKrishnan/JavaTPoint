package com.sai.javabasic;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int a=10;
        int b=10;

        System.out.println(a++ + ++a);
        System.out.println(++a + a++);
        System.out.println(++a + ++a);
        System.out.println(a++ + a++);
        System.out.println(a++ + ++b);

        int c=10;
        int d=-10;
        boolean e=true;
        boolean f=false;
        System.out.println(~c);//-11 (minus of total positive value which starts from 0)
        System.out.println(~d);//9 (positive of total minus, positive starts from 0)
        System.out.println(!e);//false (opposite of boolean value)
        System.out.println(!f);//true
    }
}
