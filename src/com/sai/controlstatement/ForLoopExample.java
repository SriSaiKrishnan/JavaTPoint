package com.sai.controlstatement;

public class ForLoopExample {

    public static void main(String[] args) {

        for (int i=1;i<10;i++){
            System.out.println(i);
        }

        //Nested For Loop

        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println(i + " " + j);
            }
        }

        //print * triangle

        for (int i=1;i<=5;i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for each loop

        int[] arr ={10,20,30,40,50};
        for (int a :arr){
            System.out.println(a);
        }

        //Labeled For Loop
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1; j<=3; j++){
                if (i==2 && j==2){
                    break aa;
                }
                System.out.println(i + "  "+ j);
            }

        }

        //Continue
        for (int i=1;i<10;i++){
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }

        //Infinite Loop
        for (;;){
            System.out.println("Infinite Loop");
        }
    }
}
