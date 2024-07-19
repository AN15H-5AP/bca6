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

public class NetworkAdapters {
    public static void main(String[] args) {
        try {
            NetworkInterface.networkInterfaces().forEach(networkInterface -> {
                System.out.println("Name: " + networkInterface.getName() + ", Display Name: " + networkInterface.getDisplayName());
            });
        } catch (SocketException e) {
            System.out.println("Error retrieving network interfaces: " + e.getMessage());
        }
    }
}
