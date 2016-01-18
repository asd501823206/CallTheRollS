package com.dream_art.dianming;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtils {
    private URL url;
    //服务器的地址
    private static String PATH = "http://192.168.146.1:8080/";

    public HttpUtils(){
        try {
            url = new URL(PATH);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public String sendMessage(Person p) {
        HttpURLConnection huc = null;
        try {
            huc = (HttpURLConnection)url.openConnection();
            huc.setDoOutput(true);
            huc.setDoInput(true);
            huc.setConnectTimeout(5000);
            huc.setRequestMethod("POST");
            huc.setRequestProperty("Content-Type","application/x-www-form-urlencoded");







        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
