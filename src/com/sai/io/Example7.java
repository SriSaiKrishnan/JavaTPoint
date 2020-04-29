package com.sai.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

/*
The ByteArrayInputStream is composed of two words:
ByteArray and InputStream. As the name suggests, it can be used to read byte array as input stream.

Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream.
In this stream, the data is read from a byte array.
 */
public class Example7 {
    public static void main(String[] args) {
        byte[] b = {35,36,37,38};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
        int i=0;
        while((i=byteArrayInputStream.read())!=-1){
            System.out.println("ASCII value of Character is: "+ i  + " Special Character is "+ (char)i);
        }
    }
}
