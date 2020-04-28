package com.sai.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Java BufferedOutputStream class is used for buffering an output stream. It internally uses buffer to store data.
It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.
 */
public class Example3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String s = "Welcome to Java";
        byte []b = s.getBytes();
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Success");
    }
}
