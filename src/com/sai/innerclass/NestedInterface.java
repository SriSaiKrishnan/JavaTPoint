package com.sai.innerclass;

interface Showable{
    void show();
    interface Message{
        void message();
    }
}

public class NestedInterface implements Showable.Message {

    @Override
    public void message() {
        System.out.println("Hello Accessing the method inside Message Interface");
    }

    public static void main(String[] args) {
        NestedInterface nestedInterface = new NestedInterface();
        nestedInterface.message();
    }
}
