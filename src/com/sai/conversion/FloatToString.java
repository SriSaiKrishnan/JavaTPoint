package com.sai.conversion;

public class FloatToString {
    public static void main(String[] args) {
        float f = 1.3f;
        String s = String.valueOf(f);
        System.out.println( s + 2);
        String s1 = Float.toString(f);
        System.out.println(s1 + 4);
    }
}
