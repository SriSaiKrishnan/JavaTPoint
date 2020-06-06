package com.sai.conversion;


public class LongToString {
    public static void main(String[] args) {
        long l = 8765678765l;
        String s  = String.valueOf(l);
        System.out.println(s + 100);
        String s1 = Long.toString(l);
        System.out.println(s1 + 200);
    }
}
