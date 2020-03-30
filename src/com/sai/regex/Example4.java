package com.sai.regex;

/*
.	Any character (may or may not match terminator)
\d	Any digits, short of [0-9]
\D	Any non-digit, short for [^0-9]
\s	Any whitespace character, short for [\t\n\x0B\f\r]
\S	Any non-whitespace character, short for [^\s]
\w	Any word character, short for [a-zA-Z_0-9]
\W	Any non-word character, short for [^\w]
\b	A word boundary
\B	A non word boundary
 */

import java.util.regex.Pattern;

public class Example4 {

    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\w{3}","2sv")); //true
        System.out.println(Pattern.matches("\\d","avb")); //false avb are not digit
        System.out.println(Pattern.matches("\\d","23")); // false more than one digit
        System.out.println(Pattern.matches("\\d","2")); //true
        System.out.println(Pattern.matches("\\D","avb")); //false should contain only one character
        System.out.println(Pattern.matches("\\D","m")); //true
        System.out.println(Pattern.matches("\\D","123")); //false 123 is a digit
    }
}
