package com.sai.io;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/*
Java ByteArrayOutputStream class is used to write common data into multiple files.
In this stream, the data is written into a byte array which can be written to multiple streams later.
 */
public class Example6 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream1 = new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        FileOutputStream fileOutputStream2 = new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.2txt");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(65);
        byteArrayOutputStream.writeTo(fileOutputStream1);
        byteArrayOutputStream.writeTo(fileOutputStream2);
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        System.out.println("Success");
    }
}
