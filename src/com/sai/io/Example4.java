package com.sai.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Java BufferedInputStream class is used to read information from stream.
It internally uses buffer mechanism to make the performance fast.
 */
public class Example4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i=0;
        while((i=bufferedInputStream.read())!=-1){
            System.out.println((char)i);
        }
    }
}
