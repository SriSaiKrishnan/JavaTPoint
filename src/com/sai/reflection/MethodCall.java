package com.sai.reflection;

/*
You can call the private method from outside the class by changing the runtime behaviour of the class.

By the help of java.lang.Class class and java.lang.reflect.Method class, we can call private method from any other class.
 */

import java.lang.reflect.Method;

class A {
    private void message() {
        System.out.println("hello java");
    }
}
public class MethodCall {
    public static void main(String[] args)throws Exception{

        Class c = Class.forName("A");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("message", null);
        m.setAccessible(true);
        m.invoke(o, null);
    }
}
