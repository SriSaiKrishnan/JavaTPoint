package com.sai.io;

import java.io.FileOutputStream;
import java.io.IOException;
/*
Java FileOutputStream is an output stream used for writing data to a file.
If you have to write primitive values into a file, use FileOutputStream class.
You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data,
it is preferred to use FileWriter than FileOutputStream.
 */
public class Example1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        //Use case  1
        for(int i=65;i<=90;i++) {
            fileOutputStream.write(i);
        }
        System.out.println("Success");

        //Use case 2
        String s = "Hello All Welcome to Java Programmming";
        byte[] b = s.getBytes();
        fileOutputStream.write(b);
        fileOutputStream.close();
    }
}
