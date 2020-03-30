package com.sai.stringpractice;

import javax.xml.soap.SOAPElementFactory;

public class Example12 {

    private static void charAtExample(){
        //charAt Example
        String name="javatpoint";
        char ch=name.charAt(4);//returns the char value at the 4th index
        System.out.println(ch);
        System.out.println("Character at last index is : " + name.charAt(name.length()-1));
        //To count the occurrence of character
        String text ="Welcome to the Java Tutorial";
        int count = 0;
        for (int i=0; i<text.length();i++){
            if(text.charAt(i)=='o'){
                count++;
            }
        }
        System.out.println("Character O occurred " + count +" Times in the Text" );

    }

    private static void compareToExample(){
        //charAt Example
        String name="javatpoint";
        char ch=name.charAt(4);//returns the char value at the 4th index
        System.out.println(ch);
        System.out.println("Character at last index is : " + name.charAt(name.length()-1));
        //To count the occurrence of character
        String text ="Welcome to the Java Tutorial";
        int count = 0;
        for (int i=0; i<text.length();i++){
            if(text.charAt(i)=='o'){
                count++;
            }
        }
        System.out.println("Character O occurred " + count +" Times in the Text" );

    }

    private static void concatExample(){
        //concat Example
        String str1 = "Hello";
        str1.concat("String is Immutable");
        System.out.println(str1);
        str1 = str1.concat("So assign it explicitly");
        System.out.println(str1);
    }

    private static void containsExample(){
        String str = "To learn Java visit Javatpoint.com";
        if(str.contains("Javatpoint.com")) {
            System.out.println("This string contains javatpoint.com");
        }else
            System.out.println("Result not found");
    }

    private static void endsWithExample(){
        String str = "To Learn Java from JavaTpoint.com";
        if(str.endsWith(".com")) {
            System.out.println("Endswith the word .com");
        }else
            System.out.println("Result not found");
    }

    private static void equalMethodExample(){
        String str1 = "Java";
        String str2 = "java";
        if(str1.equals(str2)){
            System.out.println("Str1 and Str2 are Equal");
        }else
            System.out.println("Str1 and Str2 are not Equal");
    }

    private static void equalIgnoreCaseMethodExample(){
        String str1 = "Java";
        String str2 = "java";
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Str1 and Str2 are Equal");
        }else
            System.out.println("Str1 and Str2 are not Equal");
    }

    private static void formatExample(){
        String s1 = String.format("%d", 101);
        String s2 = String.format("%c" , 3);
        String s3 = String.format("x",60);
        String s4 = String.format("%s" , "Hello");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    private static void getBytesExample(){
        String s1 = "ABCDEF";
        byte[] b = s1.getBytes();
        for(byte bytes : b){
            System.out.println(bytes);
        }
    }

    private static void  getCharExample(){
        String s1 = "Hello welcome to Java Programming";
        char[] ch = new char[11];
        try {
            s1.getChars(6,11,ch,0);
            System.out.println(ch);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void indexOfExample(){
        String s1="this is index of example";
    //passing substring
        int index1=s1.indexOf("is");//returns the index of is substring
        int index2=s1.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8
        int index3=s1.indexOf('x',5);
        System.out.println(index3);
    }

    private static void isEmptyExample(){
        String s1 = "";
        String s2 = "Hello";
        if(s1.isEmpty()||s1.length()==0){
            System.out.println("String is empty");
        }else System.out.println(s1);
        if(s2.isEmpty()||s2.length()==0){
            System.out.println("String is empty");
        }else System.out.println(s2);
    }

    private static void joinExample(){
        String date = String.join("/","24", "10", "1993");
        String time = String.join(":","11", "30", "10");
        System.out.println("Birth date is " + date + " " + time);
    }

    private static void lastIndexExample(){
        String str = "This is last index example";
        System.out.println(str.lastIndexOf('x'));
    }

    private static void lengthExample(){
        String str = "This is Java Programming Language";
        System.out.println(str.length());
    }

    private static void replaceExample(){
        String s1 = "Welcome to Java Progarmming";
        s1.replace('a','e'); //Replacing the character
        System.out.println(s1);
        s1.replace("Java","Kava"); //Replacing the char sequence
    }

    private static void replaceAllExample(){
        String s1="My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString=s1.replaceAll("\\s","");
        System.out.println(replaceString);
    }

    private static void splitExample(){
        String s1="welcome to split world";
        System.out.println("returning words:");
        for(String w:s1.split("\\s",0)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\s",2)){
            System.out.println(w);
        }
    }

    private static void startSwithExample(){
        String str = "Javatpoint";
        System.out.println(str.startsWith("J")); // True
        System.out.println(str.startsWith("a")); // False
        System.out.println(str.startsWith("a",1)); // True
    }

    private static void substringExample(){
        String  str = "Hello All";
        System.out.println(str.substring(2,5));
    }

    private static void toCharArrayExample(){
        String s1 = "Hello Welcome to Java Programing";
        char []ch = s1.toCharArray();
        for(char c : ch ){
            System.out.println(c);
        }
    }

    private static void toLowerCaseExample(){
        String str = "HELLO WELCOME TO JAVA PROGRAMMING";
        System.out.println(str.toLowerCase());
    }

    private static void toUpperCaseExample(){
        String str = "hello welcome to java programming";
        System.out.println(str.toUpperCase());
    }

    private  static void trimExample(){
        String str = " Hello Welcome ";
        System.out.println(str.trim());
    }

    public static void main(String[] args) {

        charAtExample();
        compareToExample();
        concatExample();
        containsExample();
        endsWithExample();
        equalMethodExample();
        equalIgnoreCaseMethodExample();
        formatExample();
        getBytesExample();
        getCharExample();
        indexOfExample();
        isEmptyExample();
        joinExample();
        lastIndexExample();
        lengthExample();
        replaceExample();
        replaceAllExample();
        splitExample();
        startSwithExample();
        substringExample();
        toCharArrayExample();
        toLowerCaseExample();
        toUpperCaseExample();
    }

}
