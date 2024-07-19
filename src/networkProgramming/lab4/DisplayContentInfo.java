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
import java.util.Date;

public class DisplayContentInfo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://oic.edu.np");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            System.out.println("Content Information:");
            System.out.println("Content Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("Date of Access: " + new Date(connection.getDate()));
            System.out.println("Last Modified Date: " + new Date(connection.getLastModified()));
            System.out.println("Expiry Date: " + new Date(connection.getExpiration()));
        } else {
            System.out.println("Failed to retrieve content information. Response code: " + responseCode);
        }
    }
}