/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab2;

/**
 *
 * @author devil
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class DownloadWebPage {
    public static void main(String[] args) throws Exception {
        String urlString = "https://www.oic.edu.np";
        URL url = new URL(urlString);
        
        try (BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
