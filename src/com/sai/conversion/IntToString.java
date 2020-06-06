package com.sai.conversion;

public class IntToString {
    public static void main(String[] args) {
        int i = 100;
        String s = String.valueOf(i);
        System.out.println(i + 100);
        System.out.println(s + 100);
        String s1 = Integer.toString(i);
        System.out.println(s1+i);
        String s2 = String.format("%d",i);
        System.out.println(s2 + 100);
    }
}
