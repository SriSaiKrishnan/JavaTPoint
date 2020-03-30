package com.sai.oops.misc;

/*
The java command-line argument is an argument i.e. passed at the time of running the java program.

The arguments passed from the console can be received in the java program and it can be used as an input.
 */

public class CommandLineArgs {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[0]);
        }
    }
}
