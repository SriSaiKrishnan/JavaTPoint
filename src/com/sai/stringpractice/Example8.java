package com.sai.stringpractice;

/*
Performance Test StringBuffer Vs StringBuilder
 */

public class Example8 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer  stringBuffer = new StringBuffer("Java");
        for (int i=1;  i<=10000; i++){
            stringBuffer.append("Tpoint");
        }
        System.out.println("Time taken to append StringBuffer " +  (System.currentTimeMillis()-startTime)+ "  ms");
        startTime  = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Java");
        for (int i=1; i<=10000; i++){
            stringBuilder.append("Tpoint");
        }
        System.out.println("Time taken to append StringBuilder " + (System.currentTimeMillis()-startTime) + " ms");
    }
}
