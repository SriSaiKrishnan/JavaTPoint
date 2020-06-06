package com.sai.conversion;

public class StringToObject {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = "Hello";
        Object o = s;
        System.out.println(o);

        Class aClass = Class.forName("java.lang.String");
        System.out.println(aClass.getName());
        System.out.println(aClass.getSuperclass().getName());
    }
}
