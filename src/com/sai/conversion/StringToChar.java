package com.sai.conversion;

public class StringToChar {
    public static void main(String[] args) {
        String s = "Hello";
        for( int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            System.out.print(c);
        }
        System.out.println();
        char a[] = s.toCharArray();
        for (char c : a){
            System.out.print(c);
        }
    }
}
