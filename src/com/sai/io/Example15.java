package com.sai.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example15 {

    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
