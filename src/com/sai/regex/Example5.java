package com.sai.regex;

/*
    Password Validation
 */

import java.util.regex.Pattern;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\w{10}","NGdbsgld5e")); //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","agdJD3")); //true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
    }
}
