package com.sai.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
You can also read character-stream data.
But, for reading streams of characters, it is recommended to use FileReader class.
 */
public class Example2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        //Use case 1
        int i = fileInputStream.read();
        System.out.println((char)i);
        System.out.println("Success");

        //Use case 2
        int j=0;
        while ((j=fileInputStream.read())!=-1){
            System.out.println((char)j);
        }
        fileInputStream.close();
    }
}
