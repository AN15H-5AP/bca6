/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab5;

/**
 *
 * @author devil
 */
import java.io.IOException;
import java.net.Socket;

public class PortScanner {
    public static void main(String[] args) {
        String host = "127.0.0.1";

        for (int port = 1; port <= 8000; port++) {
            try (Socket socket = new Socket(host, port)) {
                System.out.println("Port " + port + " is open");
            } catch (IOException e) {
                // Port is closed, do nothing
            }
        }
    }
}
