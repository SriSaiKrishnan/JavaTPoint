package com.sai.objectclass;

public class AnonymousObject {
    void fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        // Calling objecr anonymously without reference variable
        new AnonymousObject().fact(5);
    }

}
