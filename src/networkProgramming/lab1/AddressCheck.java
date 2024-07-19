/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab1;
import java.net.*;
/**
 *
 * @author devil
 */
public class AddressCheck {
    public static void main(String[] args) {
        String domain = "tu.edu.np";
        try {
            InetAddress[] addresses = InetAddress.getAllByName(domain);
            for (InetAddress addr : addresses) {
                System.out.println("Address: " + addr.getHostAddress() + ", Type: " + (addr instanceof Inet4Address ? "IPv4" : "IPv6"));
            }
        } catch (UnknownHostException e) {
            System.out.println("Error resolving " + domain + ": " + e.getMessage());
        }
    }
}
