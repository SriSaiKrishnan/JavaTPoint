package com.sai.conversion;

public class StringToBoolean {
    public static void main(String[] args) {
        String s = "true";
        String s1 = "True";
        String s2 = "OK";
        //Method 1
        System.out.println(Boolean.parseBoolean(s));
        System.out.println(Boolean.parseBoolean(s1));
        System.out.println(Boolean.parseBoolean(s2));
        //Method 2
        System.out.println(Boolean.valueOf(s));
        System.out.println(Boolean.valueOf(s1));
        System.out.println(Boolean.valueOf(s2));
    }
}
