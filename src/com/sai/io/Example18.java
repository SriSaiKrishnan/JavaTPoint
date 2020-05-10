package com.sai.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example18 {

    public static void main(String args[])throws Exception {
        FileReader fr = new FileReader("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.2txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
