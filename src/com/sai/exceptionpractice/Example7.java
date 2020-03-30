package com.sai.exceptionpractice;
/*
Java finally block is a block that is used to execute important code such as closing connection, stream etc.

Java finally block is always executed whether exception is handled or not.

Java finally block follows try or catch block.
 */
public class Example7 {
    public static void main(String[] args) {
        try{
            int data=25/0;
            System.out.println(data);
        }
        catch(NullPointerException e){System.out.println(e);}
        catch (ArithmeticException  e){
            System.out.println(e);
        }
        finally{System.out.println("finally block is always executed");}
        System.out.println("rest of the code...");
    }
}
