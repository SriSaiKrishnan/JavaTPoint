package com.sai.objectclass;

public class Employee {
    int id;
    String name;
    int salary;

    void insertRecord(int i, String n, int sal){
        id=i;
        name=n;
        salary=sal;
    }

    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insertRecord(1,"abc" ,1000);
        e2.insertRecord(2,"XYZ" ,2000);
        e3.insertRecord(3,"EFG", 3000);

        e1.display();
        e2.display();
        e3.display();
    }
}