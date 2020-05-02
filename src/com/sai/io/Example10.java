package com.sai.io;

import java.io.*;

/*
Java FilterInputStream class implements the InputStream. It contains different sub classes as BufferedInputStream,
DataInputStream for providing additional functionality. So it is less used individually.
 */
public class Example10 {
    public static void main(String[] args) throws IOException {
        File data = new File("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
        FileInputStream file = new FileInputStream(data);
        FilterInputStream filter = new BufferedInputStream(file);
        int k =0;
        while((k=filter.read())!=-1){
            System.out.print((char)k);
        }
        file.close();
        filter.close();
    }
}
