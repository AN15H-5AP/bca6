/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab6;

/**
 *
 * @author devil
 */
import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;
        try (Socket socket = new Socket(host, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String message = "Hello, Server!";
            out.println(message);
            String echoedMessage = in.readLine();
            System.out.println("Echoed from server: " + echoedMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

