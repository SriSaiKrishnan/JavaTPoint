package com.sai.objectclass;

public class WithoutStatic {
    int count;

    WithoutStatic(){
        count++;
        System.out.println(count);
    }
}
class TestExample{
    public static void main(String[] args) {
        WithoutStatic withoutStatic1 = new WithoutStatic();
        WithoutStatic withoutStatic2 = new WithoutStatic();
        WithoutStatic withoutStatic3 = new WithoutStatic();
    }
}