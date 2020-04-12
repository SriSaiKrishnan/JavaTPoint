package com.sai.Multithreading;
/*
Performing clean resource means closing log file, sending some alerts or something else. So if you want to execute some code before JVM shuts down, use shutdown hook.
 */
public class Example13 extends Thread {
    public void run(){
        System.out.println("Shut down task completed");
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new Example13()); // Calling the shutdownhook to perform activity before JVM exits
        System.out.println("Press ctrl+c to exit");
        try{Thread.sleep(3000);}catch (Exception e) {}
    }
}
