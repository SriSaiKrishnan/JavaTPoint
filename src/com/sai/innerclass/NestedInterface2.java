package com.sai.innerclass;

class Test {
    interface Message{
        void message();
    }
}

public class NestedInterface2 implements Test.Message {
    @Override
    public void message() {
        System.out.println("Accessing the Method inside the interface");
    }

    public static void main(String[] args) {
        NestedInterface2 nestedInterface2 = new NestedInterface2();
        nestedInterface2.message();
    }
}
