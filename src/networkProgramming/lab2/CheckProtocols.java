/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab2;

/**
 *
 * @author devil
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckProtocols {
    public static void main(String[] args) {
        String[] protocols = {"http", "https", "ftp", "telnet"};
        String host = "oic.edu.np";
        
        for (String protocol : protocols) {
            try {
                URL url = new URL(protocol + "://" + host);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                System.out.println(protocol + " is supported");
            } catch (Exception e) {
                System.out.println(protocol + " is not supported");
            }
        }
    }
}
