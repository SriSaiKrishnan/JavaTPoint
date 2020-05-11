package com.sai.io;

/*
The CharArrayWriter class can be used to write common data to multiple files. This class inherits Writer class.
Its buffer automatically grows when data is written in this stream. Calling the close() method on this object has no effect.
 */

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class Example20 {

    public static void main(String args[])throws Exception{
        CharArrayWriter out=new CharArrayWriter();
        out.write("Welcome to javaTpoint");
        FileWriter f1=new FileWriter("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.2txt");
        FileWriter f2=new FileWriter("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        FileWriter f3=new FileWriter("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.2txt");
        FileWriter f4=new FileWriter("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success...");
    }

}
