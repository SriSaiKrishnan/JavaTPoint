package com.sai.io;

import java.io.*;

/*
Java FilterOutputStream class implements the OutputStream class.
It provides different sub classes such as BufferedOutputStream and DataOutputStream to provide additional functionality.
So it is less used individually.
 */
public class Example11 {
    public static void main(String[] args) throws IOException {
        File data = new File("D:\\testout.txt");
        FileOutputStream file = new FileOutputStream(data);
        FilterOutputStream filter = new FilterOutputStream(file);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        System.out.println("Success...");
    }
}
