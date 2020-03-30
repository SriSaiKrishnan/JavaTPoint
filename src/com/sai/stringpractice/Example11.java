package com.sai.stringpractice;

import java.util.StringTokenizer;

/*
The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.

It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc. like StreamTokenizer class.
 */
public class Example11 {
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my name is khan"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
