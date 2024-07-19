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
import java.io.OutputStream;
import java.net.Socket;

public class WriteToNIST {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("time.nist.gov", 13);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("Hello, NIST!".getBytes());
            outputStream.flush();
            System.out.println("Written to server");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}