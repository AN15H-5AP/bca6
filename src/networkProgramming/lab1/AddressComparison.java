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

public class AddressComparison {
    public static void main(String[] args) {
        String domain = "oic.edu.np";
        String ip = "104.21.76.34";

        try {
            InetAddress[] addresses = InetAddress.getAllByName(domain);
            for (InetAddress address : addresses) {
                if (address.getHostAddress().equals(ip)) {
                    System.out.println(domain + " and " + ip + " are the same.");
                    return;
                }
            }
            System.out.println(domain + " and " + ip + " are not the same.");
        } catch (UnknownHostException e) {
            System.out.println("Error resolving " + domain + ": " + e.getMessage());
        }
    }
}

