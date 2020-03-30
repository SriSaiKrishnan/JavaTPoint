package com.sai.controlstatement;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<10);

        //Break statement
        int j=1;
        do {
            System.out.println(j);
            if(j==5){
                break;
            }
            j++;
        }while (j<10);

        //Continue
            do  {
            if(i==5){
                continue;
            }
            System.out.println(i);
            i++;
        }  while (i<10);

        //Infinitive do While loop
        do {
            System.out.println(i);
            i++;
        }while (true);
    }
}
