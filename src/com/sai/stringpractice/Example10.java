package com.sai.stringpractice;

/*
f you want to represent any object as a string, toString() method comes into existence.

The toString() method returns the string representation of the object.

If you print any object, java compiler internally invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can be the state of an object etc. depends on your implementation.
 */

class Student1{
    private int rollNo;
    private String name;

    Student1(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

/*
To return thr value in the object the toString method should overridden
 */
class Student2{
    private int rollNo;
    private String name;

    Student2(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString(){
        return "[ rollNo = " +rollNo + ": name = " + name + " ]";
    }
}

public class Example10 {
    public static void main(String[] args) {
        Student1 student1 = new Student1(1,"abc");
        Student1 student2 = new Student1(2,"xyz");
        System.out.println(student1); // returns the hashcode since toString Method is not overridden
        System.out.println(student2); // returns the hashcode since toString Method is not overridden
        Student2 student3 = new Student2(3 ,"asd");
        Student2 student4 = new Student2(4,"bnm");
        System.out.println(student3); //Prints the value in the object
        System.out.println(student4); //Prints the value in the object
    }
}
