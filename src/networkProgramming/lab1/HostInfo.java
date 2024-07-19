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

public class HostInfo {
    public static void main(String[] args) {
        String ip = "8.8.8.8"; // Example IP
        try {
            InetAddress address = InetAddress.getByName(ip);
            String canonicalName = address.getCanonicalHostName();
            String hostName = address.getHostName();
            System.out.println("Canonical Name: " + canonicalName + ", Host Name: " + hostName);
        } catch (UnknownHostException e) {
            System.out.println("Error resolving " + ip + ": " + e.getMessage());
        }
    }
}
