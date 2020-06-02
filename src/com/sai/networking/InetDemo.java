package com.sai.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
