/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab2;

/**
 *
 * @author devil
 */

import java.net.URL;

public class SplitUrl {
    public static void main(String[] args) throws Exception {
        String urlString = "https://www.google.com/search?q=image&tbm=isch&ved=2ahUKEwj827nasvb3AhV-";
        URL url = new URL(urlString);

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Port: " + url.getPort());
    }
}
