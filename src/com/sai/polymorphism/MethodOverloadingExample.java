package com.sai.polymorphism;

class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static  int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(double a,double b){
        return a+b;
    }
    //static double add(int a,int b){return a+b;}  //Compile Time Error: method add(int,int) is already defined in class Adder
}

public class MethodOverloadingExample {

    public static void main(String[] args) {
        System.out.println(Adder.add(5,4));
        System.out.println(Adder.add(5,4,3));
    }
}

 class MethodOverloadingExample2{
    public static void main(String[] args) {
        System.out.println(Adder.add(5.6,4.3));
    }
}

//Overlaoding Main Method
class MethodOverloadingExample3{
    public static void main(String[] args){System.out.println("main with String[]");}
    public static void main(String args){System.out.println("main with String");}
    public static void main(){System.out.println("main without args");}
}

//Method Overloading with type promotion
class MethodOverloadingExample4{
    void sum(int a,long b){System.out.println(a+b);}
    void sum(int a,int b,int c){System.out.println(a+b+c);}

    public static void main(String args[]){
        MethodOverloadingExample4 obj=new MethodOverloadingExample4();
        obj.sum(20,20);//now second int literal will be promoted to long
        obj.sum(20,20,20);

    }
}
//If there are matching type arguments in the method, type promotion is not performed.
class MethodOverloadingExample5{
    void sum(int a,int b){System.out.println("int arg method invoked");}
    void sum(long a,long b){System.out.println("long arg method invoked");}

    public static void main(String args[]){
        MethodOverloadingExample5 obj=new MethodOverloadingExample5();
        obj.sum(20,20);//now int arg sum() method gets invoked
    }
}

//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
class MethodOverloadingExample6{
    void sum(int a,long b){System.out.println("a method invoked");}
    void sum(long a,int b){System.out.println("b method invoked");}

    public static void main(String args[]){
        MethodOverloadingExample6 obj=new MethodOverloadingExample6();
 //       obj.sum(20,20);//now ambiguity
    }
}