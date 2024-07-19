/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab4;

/**
 *
 * @author devil
 */

import java.net.URL;
import java.net.HttpURLConnection;

public class ResponseHeaders {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://oic.edu.np");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            System.out.println("Response Headers:");
            for (String header : connection.getHeaderFields().keySet()) {
                System.out.println(header + ": " + connection.getHeaderField(header));
            }
        } else {
            System.out.println("Failed to retrieve response headers. Response code: " + responseCode);
        }
    }
}


