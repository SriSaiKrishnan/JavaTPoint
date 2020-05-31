package com.sai.io;

import java.io.*;

public class Example36 implements Serializable {
    int id;
    String name;
    transient int age;//Now it will not be serialized
    public Example36(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }
}
class PersistExample{
    public static void main(String args[])throws Exception{
        Example36 s1 =new Example36(211,"ravi",22);//creating object
        //writing object into file
        FileOutputStream f=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();

        out.close();
        f.close();
        System.out.println("success");
    }
}
class DePersist{
    public static void main(String args[])throws Exception{
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        Example36 s=(Example36)in.readObject();
        System.out.println(s.id+" "+s.name+" "+s.age);
        in.close();
    }
}