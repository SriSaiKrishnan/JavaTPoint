package com.sai.innerclass;
/*
A class i.e. created inside a method is called local inner class in java. If you want to invoke the methods of local inner class, you must instantiate this class inside the method
 */
public class LocalInnerClass {
    private int data = 30;
    void display(){
        class Local{
            void msg() {
                System.out.println("Data: " + data);
            }
        }
        Local local = new Local();
        local.msg();
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();
    }
}
