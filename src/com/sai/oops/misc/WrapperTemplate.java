package com.sai.oops.misc;

import com.sai.objectclass.WithStatic;

public class WrapperTemplate {

    private int i;

    WrapperTemplate(){

    }

    WrapperTemplate(int i){
      this.i = i;
    }

    public void setValue(int i){
        this.i = i;
    }
    public int getValue(){
        return i;
    }

    @Override
    public String toString(){
        Integer integer = new Integer(i);
        System.out.println(integer);
        return Integer.toString(i);
    }

    public static void main(String[] args) {
        WrapperTemplate wrapperTemplate = new WrapperTemplate(2);
        System.out.println("Wrapper class value " + wrapperTemplate.getValue());
    }
}
