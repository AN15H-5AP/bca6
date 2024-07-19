/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab5;

/**
 *
 * @author devil
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WhoisClient extends JFrame {
    private JTextField domainField;
    private JTextArea resultArea;

    public WhoisClient() {
        setTitle("Whois Client");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        domainField = new JTextField(40);
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        JButton queryButton = new JButton("Query");
        queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String domain = domainField.getText();
                queryWhois(domain);
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Domain:"));
        panel.add(domainField);
        panel.add(queryButton);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
    }

    private void queryWhois(String domain) {
        String server = "whois.internic.net";
        int port = 43;

        try (Socket socket = new Socket(server, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println(domain);

            String line;
            StringBuilder response = new StringBuilder();
            while ((line = in.readLine()) != null) {
                response.append(line).append("\n");
            }

            resultArea.setText(response.toString());
        } catch (Exception e) {
            resultArea.setText("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WhoisClient().setVisible(true);
            }
        });
    }
}
