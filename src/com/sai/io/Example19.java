package com.sai.io;

import java.io.CharArrayReader;

/*
The CharArrayReader is composed of two words: CharArray and Reader.
The CharArrayReader class is used to read character array as a reader (stream). It inherits Reader class.
 */
public class Example19 {

    public static void main(String[] ag) throws Exception {
        char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
        CharArrayReader reader = new CharArrayReader(ary);
        int k = 0;
        // Read until the end of a file
        while ((k = reader.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }

}
