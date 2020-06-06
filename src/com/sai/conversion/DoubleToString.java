package com.sai.conversion;

public class DoubleToString {
    public static void main(String[] args) {
        Double aDouble = 4.8367;
        String s = String.valueOf(aDouble);
        System.out.println(s + 34);
        String s1 = Double.toString(aDouble);
        System.out.println(s1 + 54);
    }
}
