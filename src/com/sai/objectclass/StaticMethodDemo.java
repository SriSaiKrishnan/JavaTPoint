package com.sai.objectclass;

public class StaticMethodDemo {

    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    StaticMethodDemo(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}

}
 class TestStaticMethod{
    public static void main(String args[]){
        StaticMethodDemo.change();//calling change method
        //creating objects
        StaticMethodDemo s1 = new StaticMethodDemo(111,"Karan");
        StaticMethodDemo s2 = new StaticMethodDemo(222,"Aryan");
        StaticMethodDemo s3 = new StaticMethodDemo(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}