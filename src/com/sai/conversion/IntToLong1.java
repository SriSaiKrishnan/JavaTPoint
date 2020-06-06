package com.sai.conversion;

public class IntToLong1 {
    public static void main(String[] args) {
        int i = 100;
        long aLong = i; // 1st way
        Long aLong1 =  new Long(aLong); // 2nd way
        Long aLong2 = Long.valueOf(i); // 3rd Way
    }
}
