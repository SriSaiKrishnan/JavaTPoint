package com.sai.reflection;

/*
The javap command disassembles a class file.
The javap command displays information about the fields,constructors and methods present in a class file.

Syntax to use javap tool
Let's see how to use javap tool or command.

javap fully_class_name
Example to use javap tool
javap java.lang.Object
 */

public class Simple {
    public static void main(String args[]) {
        System.out.println("hello java");
    }
}

/*
javap -c command
You can use the javap -c command to see disassembled code. The code that reflects the java bytecode.

javap -c Simple
 */