package com.sai.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Regex Pattern");
        Pattern pattern = Pattern.compile(scanner.nextLine());
        System.out.println("Enter the text");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        boolean found = false;
        while (matcher.find()){
            System.out.println("I found the text" + matcher.group() + "Starting Index" + matcher.start() + "Ending Index" +
                    matcher.end());
            found = true;
            if(!found){
                System.out.println("Pattern not found");
            }
        }
    }
}
