/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab1;


import java.net.*;

public class LocalMachineInfo {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Host Name: " + localHost.getHostName() + ", IP Address: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Error retrieving local machine info: " + e.getMessage());
        }
    }
}
