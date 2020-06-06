package com.sai.conversion;

public class CharToInt {
    public static void main(String[] args) {
        char a = 'd';
        char b = 'D';
        int i = a;
        int j = b;
        System.out.println(i);
        System.out.println(j);
        char c = '1';
        int k = Character.getNumericValue(c);
        System.out.println(k);
    }
}
