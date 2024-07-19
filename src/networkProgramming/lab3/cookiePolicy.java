/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab3;

/**
 *
 * @author devil
 */

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public abstract class cookiePolicy implements CookiePolicy {

    public boolean shouldAccept(HttpCookie cookie, URI uri) {
        String domain = cookie.getDomain();
        return domain.endsWith(".edu.np");
    }

    public static void main(String[] args) {
        CookiePolicy policy;
        policy = new CookiePolicy() {
            @Override
            public boolean shouldAccept(URI uri, HttpCookie hc) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        CookieManager manager = new CookieManager(null, policy);
        CookieHandler.setDefault(manager);

        // Now, you can use the CookieManager to send and receive cookies
        // For example, you can use the following code to get the cookies from a URL
        try {
            URI uri = new URI("https://example.edu.np");
            CookieManager manager2 = (CookieManager) CookieHandler.getDefault();
            List<HttpCookie> cookies = manager2.getCookieStore().get(uri);
            for (HttpCookie cookie : cookies) {
                System.out.println("Cookie: " + cookie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}