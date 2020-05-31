package com.sai.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
Java PrintWriter class is the implementation of Writer class.
It is used to print the formatted representation of objects to the text-output stream.
 */
public class Example22 {

    public static void main(String[] args) throws FileNotFoundException {
        //Data to write on Console using PrintWriter
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.write("Hello all");
        printWriter.flush();
        printWriter.close();

        //Data to write in file using print writer
        PrintWriter printWriter1 = null;
        printWriter1 = new PrintWriter(new File("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt"));
        printWriter1.write("Hello All Welcome");
        printWriter1.flush();
        printWriter1.close();
    }

}
