package com.sai.Multithreading;

import com.sai.oops.misc.Example;
import sun.jvm.hotspot.runtime.Threads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example7 implements Runnable {

    private static String filename;

    public void run(){
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] words=null;
            String s;
            int wc=0;
//            String threadName = Thread.currentThread().getName();
//            System.out.println(threadName);
//            int lineNo = Integer.parseInt(threadName.split("-")[1]);
           // System.out.println(lineNo);
            int lineNo = 0;
            while((s=bufferedReader.readLine())!=null)    //Reading Content from the file
            {

                    words=s.split(" ");   //Split the word using space
                    wc=wc+words.length;   //increase the word count for each word
                    lineNo++;
                    System.out.println(wc);

            }
        }catch (FileNotFoundException e){
            System.out.println("No File Present in the  specified Location");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countNumberOfLine(String filename) {
        int linecount = 0;
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader br = new BufferedReader(fileReader);
            String s;
            while ((s = br.readLine())!=null) {
                linecount++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No File Present in the  specified Location");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linecount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Copy and paste the file path");
        filename = scanner.next();
        int count = countNumberOfLine(filename);
        Thread threads[] = new Thread[2];
        //System.out.println(count);
        //System.out.println(threads.length);
        Example7 example7 = new Example7();
        Thread thread = new Thread(example7);
        for (int i=0;i<threads.length;i++){
            threads[i].start();
        }
        //thread.start();
//        for (int i=0;i<count;i++){
//            int threadCount =1;
//            threads[i] = new Thread(example7);
//            threads[i].start();
//           try {
//               threads[i].join();
//           } catch (InterruptedException e) {
//               e.printStackTrace();
//           }
//        }
    }
}
