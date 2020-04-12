package com.sai.Multithreading;
/*
Java Runtime class is used to interact with java runtime environment. Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc. There is only one instance of java.lang.Runtime class is available for one java application.
 */
public class Example15 {
    public static void main(String[] args) {
        try{
            //Runtime.getRuntime().exec("/Applications/TextEdit.app"); //Open Text in Mac OS
            //Runtime.getRuntime().exec("shutdown -h now"); //Shutdown the  Mac

            Runtime r=Runtime.getRuntime();
            System.out.println("Total Memory: "+r.totalMemory());
            System.out.println("Free Memory: "+r.freeMemory());

            for(int i=0;i<10000;i++){
                new Example15(); // Memory Test
            }
            System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());
            System.gc();
            System.out.println("After gc(), Free Memory: "+r.freeMemory());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

