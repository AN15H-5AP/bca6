/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab3;

/**
 *
 * @author devil
 */

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.CookieHandler;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class CookieStoreExample {

    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        CookieStore cookieStore = cookieManager.getCookieStore();

        try {
            // Store a cookie
            HttpCookie cookie = new HttpCookie("username", "john_doe");
            cookie.setDomain("oic.edu.np");
            cookie.setPath("/");
            cookieStore.add(new URI("https://oic.edu.np"), cookie);
            System.out.println("Cookie added: " + cookie);

            // Retrieve cookies
            List<HttpCookie> cookies = cookieStore.get(new URI("https://oic.edu.np"));
            System.out.println("Cookies for https://oic.edu.np:");
            for (HttpCookie retrievedCookie : cookies) {
                System.out.println(retrievedCookie);
            }

            // Delete a cookie
            cookieStore.remove(new URI("https://oic.edu.np"), cookie);
            System.out.println("Cookie deleted: " + cookie);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
