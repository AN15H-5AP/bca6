/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceJava.Swing_lab;

/**
 *
 * @author devil
 */
import javax.swing.*;
import java.awt.event.*;

class KeyListenerExample extends JFrame implements KeyListener {
    JTextArea textArea;
    JLabel label;

    public KeyListenerExample() {
        setTitle("Key Listener Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 200);
        textArea.addKeyListener(this);
        add(textArea);

        label = new JLabel();
        label.setBounds(50, 270, 300, 20);
        add(label);

        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
