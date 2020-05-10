package com.sai.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Example17 {

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.2txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to javaTpoint.");
        buffer.close();
        System.out.println("Success");
    }

}
