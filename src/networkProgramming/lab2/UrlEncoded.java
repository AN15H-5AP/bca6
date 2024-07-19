/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab2;

/**
 *
 * @author devil
 */
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class UrlEncoded {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String paramName = "username";
        String paramValue = "John Doe";
        String encodedParam = URLEncoder.encode(paramName, "UTF-8") + "=" + URLEncoder.encode(paramValue, "UTF-8");
        System.out.println("Encoded parameter: " + encodedParam);

        String query = "username=John+Doe&password=secret";
        System.out.println("Encoded query: " + query);
    }
}