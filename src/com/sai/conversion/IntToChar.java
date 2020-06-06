package com.sai.conversion;

public class IntToChar {
    public static void main(String[] args) {
        int i = 1;
        char c = (char) i;
        System.out.println(c);
        char d = (char) (i+ '0');
        System.out.println(d);
        int j = '1';
        char e = (char) j;
        System.out.println(e);
        int REDIX=10;//redix 10 is for decimal number, for hexa use redix 16
        int a=1;
        char f=Character.forDigit(a,REDIX);
        System.out.println(f);
    }
}
