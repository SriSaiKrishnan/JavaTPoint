package com.sai.conversion;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class BooleanToString {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        //Method 1
        System.out.println(Boolean.toString(b1));
        System.out.println(Boolean.toString(b2));
        //Method 2
        System.out.println(String.valueOf(b1));
        System.out.println(String.valueOf(b2));
    }
}
