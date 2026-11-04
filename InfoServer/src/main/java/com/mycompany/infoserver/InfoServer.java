package com.mycompany.infoserver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class InfoServer {
    final static String REQUEST = "https://kst.tugab.bg";
    
    public static void main(String[] args) {
       try{
        URL server = new URL(REQUEST);
        URLConnection conn = server.openConnection();
        String serverInfo =  conn.getHeaderField("Server");
        int number = server.getPort();
        String protoc = server.getProtocol();
        System.out.println(number);
        System.out.println(protoc);
        if(serverInfo!=null){
            System.out.println(serverInfo);
        }
        else{
            if(conn.getContentLength()== -1){
                System.out.println("Lipsva mrejova svurzanost, " + "protokolut ne se podurja i nqma takuv host!");
            }
            else{
                System.out.println("Ne e zadeno ime na web survura");
            }
        }
       }
       catch(MalformedURLException ex){
          System.out.println("Nevaliden sintaksis na zayavkata");
       }
       catch(IOException ex){
           System.out.println("Greshka pri komunikaciq sus ");
       }
    }
}
