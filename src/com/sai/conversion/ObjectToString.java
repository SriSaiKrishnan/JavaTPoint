package com.sai.conversion;

class Emp{

}

public class ObjectToString {
    public static void main(String[] args) {
        Emp emp = new Emp();
        String s = emp.toString();
        String s1 = String.valueOf(emp);
        System.out.println(s);
        System.out.println(s1);
    }
}
