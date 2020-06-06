package com.sai.conversion;

public class StringToFloat {
    public static void main(String[] args) {
        String s = "2";
        Float aFloat = Float.valueOf(s);
        System.out.println(aFloat + 7.8);
        Float aFloat1 = Float.parseFloat(s);
        System.out.println(aFloat1 + 3);
    }
}
