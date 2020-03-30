package com.sai.stringpractice;

/*
String and StringBuffer Hashcode Test
 */

public class Example7 {
    public static void main(String[] args) {
        String str ="Java";
        System.out.println(str.hashCode());
        str = str.concat("Tpoint");
        System.out.println(str.hashCode());
        StringBuffer stringBuffer = new StringBuffer("Java");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append("Tpoint");
        System.out.println(stringBuffer.hashCode());
    }
}
