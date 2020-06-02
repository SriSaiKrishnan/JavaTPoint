package com.sai.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {
    public static void main(String[] args) throws IOException {
        try{
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream =  urlConnection.getInputStream();
            int i;
            while((i=inputStream.read())!=1){
                System.out.println((char)i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
