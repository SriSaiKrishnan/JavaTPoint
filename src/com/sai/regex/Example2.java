package com.sai.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("az");
        boolean match = matcher.matches();
        System.out.println(match);
        System.out.println(Pattern.matches(".s","as")); //true (2nd char is s)
        System.out.println(Pattern.matches(".z","ac")); //false  (2nd char is c)
        System.out.println(Pattern.matches(".x","add")); // More than 2 character
        System.out.println(Pattern.matches("..2","mas")); //true (3rd char is s)
    }
}
