package com.sai.networking;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionDemo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.javatpoint.com/java-http-url-connection");
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            for (int i=1;i<=8;i++){
                System.out.println(httpURLConnection.getHeaderFieldKey(i)+" = "+httpURLConnection.getHeaderField(i));
            }
            httpURLConnection.disconnect();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
