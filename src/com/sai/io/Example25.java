package com.sai.io;

/*
Java PushbackInputStream class overrides
InputStream and provides extra functionality to another input stream. It can unread a byte which is already read and push back one byte.
 */

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class Example25 {
    public static void main(String[] args) throws IOException {
        String srg = "1##2#34###12";
        byte ary[] = srg.getBytes();
        ByteArrayInputStream array = new ByteArrayInputStream(ary);
        PushbackInputStream push = new PushbackInputStream(array);
        int i;
        while( (i = push.read())!= -1) {
            if(i == '#') {
                int j;
                if( (j = push.read()) == '#'){
                    System.out.print("**");
                }else {
                    push.unread(j);
                    System.out.print((char)i);
                }
            }else {
                System.out.print((char)i);
            }
        }
    }
}
