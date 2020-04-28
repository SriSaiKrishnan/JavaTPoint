package com.sai.io;

import java.io.*;

/*
Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).
 */
public class Example5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream1 = new FileInputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testin1.txt");
        FileInputStream fileInputStream2 = new FileInputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testin2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1,fileInputStream2);
        int i=0;
        while((i=sequenceInputStream.read())!=-1){
            fileOutputStream.write(i);
        }
        System.out.println("Success");
    }

}
