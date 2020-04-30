package com.sai.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Java DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.
 */
public class Example9 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        int count = fileInputStream.available();
        byte[] ary = new byte[count];
        dataInputStream.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k+"-");
        }

    }
}
