package com.sai.networking;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://projecteuler.net/archives");
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
