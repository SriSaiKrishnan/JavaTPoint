package com.sai.controlstatement;

public class SwitchExample {
    enum Day {sun,mon,tue,wed,thur,fri,sat};
    public static void main(String[] args) {
        char c='A';
        switch (c){
            case 'a': System.out.println(c+" is a vowel");
            break;
            case 'e': System.out.println(c+" is a vowel");
            break;
            case 'i': System.out.println(c+" is a vowel");
            break;
            case 'o': System.out.println(c+" is a vowel");
            break;
            case 'u': System.out.println(c+" is a vowel");
            break;
            case 'A': System.out.println(c+" is a vowel");
            break;
            case 'E': System.out.println(c+" is a vowel");
            break;
            case 'I': System.out.println(c+" is a vowel");
            break;
            case 'O': System.out.println(c+" is a vowel");
            break;
            case 'U': System.out.println(c+" is a vowel");
            break;
            default: System.out.println(c+" is not a vowel");
        }

        //Switch Using enum

        Day[] dayNow = Day.values();
        for(Day now : dayNow)
        switch (now){
            case sun: System.out.println("Sunday");
            break;
            case mon: System.out.println("Monday");
            break;
            case tue: System.out.println("Tuesday");
            break;
            case wed: System.out.println("Wednesday");
            break;
            case thur: System.out.println("Thursday");
            break;
            case fri: System.out.println("Friday");
            break;
            case sat: System.out.println("Saturday");
            break;
        }

    }
}
