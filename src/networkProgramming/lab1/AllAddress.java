/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab1;

/**
 *
 * @author devil
 */
import java.net.*;

public class AllAddress {
    public static void main(String[] args) {
        String domain = "dns.google.com";
        try {
            InetAddress[] addresses = InetAddress.getAllByName(domain);
            for (InetAddress addr : addresses) {
                System.out.println("Address: " + addr.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Error resolving " + domain + ": " + e.getMessage());
        }
    }
}
