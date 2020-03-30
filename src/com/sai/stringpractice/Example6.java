package com.sai.stringpractice;

/*
Performance Test String Vs StringBuffer
 */

public class Example6 {

    static String concatWithString(){
        String s1 ="Java";
        for(int i=1;i<=10000;i++){
            s1 = s1 + "Tpoint";
        }
        return s1;
    }

    static String concatWithStringBuffer(){
        StringBuffer s2   = new StringBuffer("Java");
        for(int i=1; i<=10000; i++){
            s2 = s2.append("Tpoint");
        }
        return s2.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken to concat using String class "+ (System.currentTimeMillis()-startTime)+" ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken to concat using StringBuffer class " + (System.currentTimeMillis()-startTime)+" ms");
    }
}
