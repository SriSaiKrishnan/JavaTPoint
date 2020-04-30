package com.sai.io;

import java.io.*;

/*
Java DataOutputStream class allows an application to write primitive
Java data types to the output stream in a machine-independent way.
 */
public class Example8 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeByte(65);
        dataOutputStream.writeDouble(90.00);
        dataOutputStream.writeInt(80);
        dataOutputStream.flush();
        dataOutputStream.close();
        System.out.println("Success");
    }

}
