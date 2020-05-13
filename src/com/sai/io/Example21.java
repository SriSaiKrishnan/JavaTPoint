package com.sai.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
The PrintStream class provides methods to write data to another stream. The PrintStream class automatically flushes the data so there is no need to call flush() method.
Moreover, its methods don't throw IOException.
 */
public class Example21 {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        PrintStream pout=new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success?");
    }
}
