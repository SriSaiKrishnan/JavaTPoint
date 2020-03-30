package com.sai.exceptionpractice;
/*
The Java throw keyword is used to explicitly throw an exception.

We can throw either checked or uncheked exception in java by throw keyword. The throw keyword is mainly used to throw custom exception. We will see custom exceptions later.
 */
public class Example8 {
    static void validate(int age)throws ArithmeticException {
        {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome to vote");
        }
    }

    public static void main(String args[]){
        try{
            validate(13);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}
