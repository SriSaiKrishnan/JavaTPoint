package com.sai.conversion;

public class StringToInt {
    public static void main(String[] args) {
        String s = "200";
        int i = Integer.parseInt(s);
        System.out.println(i + 100);

        Integer integer = Integer.valueOf("200");
        System.out.println( integer + 100);

        String s2 = "Hello";
        Integer integer1 = Integer.parseInt(s2); // Number Format Exception
        System.out.println(s2 + 100);
    }
}
