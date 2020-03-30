package com.sai.oops.misc;

/*
The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.

The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.

The clone() method is defined in the Object class. Syntax of the clone() method is as follows

protected Object clone() throws CloneNotSupportedException

 */

class Student implements Cloneable{

    private int id;
    private String name;

    Student(int id, String name){
       this.id = id;
       this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString(){
       return "[" + "id = " + id + "name =" + name + "]";
    }

}

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(1,"abc");
        System.out.println(student);
        Student student1 = (Student) student.clone();
        System.out.println(student1);
    }
}
