package com.sai.io;

import java.io.FileReader;
import java.io.Reader;

public class Example16 {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
