package com.sai.objectclass;

class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }

    void display(){
        System.out.println(rollno + ": " + name);
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.rollno);
        System.out.println(student.name);
    }
}

//Object Initialization using reference variable

class TestStudent2{
    public static void main(String[] args) {
        Student student = new Student();
        student.rollno=10;
        student.name="Tom";
        System.out.println(student.rollno + " " +student.name);
    }
}

//Object Initialization using method and More than one object

class TestStudent3{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.insertRecord(1, "ABC");
        student1.display();
        Student student2 = new Student();
        student2.insertRecord(2,"XYZ");
        student2.display();
    }
}

