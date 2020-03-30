package com.sai.polymorphism;

public class FinalVariableExample {
}
class Bike9{
    final int SPEED_LIMIT=90;//final variable
    void run(){
  //      SPEED_LIMIT=400; //Compile Time Error
    }
    public static void main(String args[]){
        Bike9 obj=new  Bike9();
        obj.run();
    }
}

class Bike{
    final void run(){System.out.println("running");}
}

class Honda extends Bike{
    // void run(){System.out.println("running safely with 100kmph");} //Compile Time Error

    public static void main(String args[]){
        Honda honda= new Honda();
        honda.run();
    }
}

//If you make any class as final, you cannot extend it.

final class Bike1{}

/* class Honda1 extends Bike1{
    void run(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Honda1 honda= new Honda1();
        honda.run();
    }
}  */

//final method is inherited but you cannot override it.

class Bike3{
    final void run(){System.out.println("running...");}
}
class Honda2 extends Bike3{
    public static void main(String args[]){
        new Honda2().run();
    }
}

   // Can we initialize blank final variable?
       // Yes, but only in constructor. For example:

class Bike10{
    final int SPEED_LIMIT;//blank final variable

    Bike10(){
        SPEED_LIMIT=70;
        System.out.println(SPEED_LIMIT);
    }

    public static void main(String args[]){
        new Bike10();
    }
}

//static blank final variable
       // A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

class D{
    static final int DATA;//static blank final variable
    static{ DATA=50;}
    public static void main(String args[]){
        System.out.println(D.DATA);
    }
}

//If you declare any parameter as final, you cannot change the value of it.

/*class Bike11{
    int cube(final int n1){
        n=n+2;//can't be changed as n is final
        n*n*n;  Compile Time Error
    }
    public static void main(String args[]){
        Bike11 b=new Bike11();
        b.cube(5);
    }
}*/