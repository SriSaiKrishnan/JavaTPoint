package com.sai.controlstatement;

public class WhileLoopExample {

    public static void main(String[] args) {
        int i=1;

        while (i<10){
            System.out.println(i);
            i++;
        }
        //Break Statement
        int j=1;
        while (j<10) {
            System.out.println(j);
            if(j==5){
                break;
            }
            j++;
        }

        //Continue
        while (i<10) {
            if(i==5){
                continue;
            }
            System.out.println(i);
            i++;
        }

        // Infinite While Loop
        while(true){
            System.out.println("Infinite Loop");
        }
    }
}
