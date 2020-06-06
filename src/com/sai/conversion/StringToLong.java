package com.sai.conversion;

public class StringToLong {
    public static void main(String[] args) {
        String s = "100";
        Long l  = Long.parseLong(s);
        System.out.println(l + 200);
        Long aLong  = Long.valueOf(s);
        System.out.println(l + 100);
    }
}
