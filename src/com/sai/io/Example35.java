package com.sai.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Example35 implements Serializable {
    int id;
    String name;

    public Example35(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Persist{
    public static void main(String args[]){
        try{
            //Creating the object
            Example35 s1 =new Example35(211,"ravi");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
    }
}