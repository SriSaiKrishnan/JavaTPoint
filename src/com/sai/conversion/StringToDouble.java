package com.sai.conversion;

public class StringToDouble {
    public static void main(String[] args) {
        String s = "3.5";
        Double aDouble = Double.parseDouble(s);
        System.out.println(aDouble + 6);
        Double aDouble1 = Double.valueOf(s);
        System.out.println(aDouble1 + 7);
    }
}
