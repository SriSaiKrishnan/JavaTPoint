package com.sai.oops.misc;

/*
The java string valueOf() method converts different types of values into string.
 */

public class Example13 {
    public static void main(String[] args) {
        boolean b1 = true;
        byte b2 = 65;
        short s1 = 12;
        int i = 13;
        long l = 14l;
        float f = 13.9f;
        double d = 6.86d;
        char  []ch = {'j','a','v','a'};
        Example example = new Example();
        String str1 = String.valueOf(b1);
        String str2 = String.valueOf(b2);
        String str3 = String.valueOf(s1);
        String str4 = String.valueOf(i);
        String str5 = String.valueOf(l);
        String str6 = String.valueOf(f);
        String str7 = String.valueOf(d);
        String str8 = String.valueOf(ch);
        String str9 = String.valueOf(example);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
    }
}
