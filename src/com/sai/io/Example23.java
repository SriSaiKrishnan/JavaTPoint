package com.sai.io;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
OutputStreamWriter is a class which is used to convert character stream to byte stream,
the characters are encoded into byte using a specified charset.
write() method calls the encoding converter which converts the character into bytes.
 */
public class Example23 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("/Users/sv/IntelliJ-Workspace/JavaTPoint/src/com/sai/io/testout.txt");
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);

            outputStreamWriter.write("Hello World");

            outputStreamWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
