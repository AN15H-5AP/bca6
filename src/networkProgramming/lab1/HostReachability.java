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

public class HostReachability {
    public static void main(String[] args) {
        String host = "oic.edu.np";
        try {
            InetAddress address = InetAddress.getByName(host);
            boolean reachable = address.isReachable(2000); // timeout in milliseconds
            System.out.println(host + " is " + (reachable ? "not reachable" : "reachable"));
        } catch (Exception e) {
            System.out.println("Error checking host reachability: " + e.getMessage());
        }
    }
}
