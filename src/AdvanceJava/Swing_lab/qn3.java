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

class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    public MouseListenerExample() {
        setTitle("Mouse Listener Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel();
        label.setBounds(50, 50, 300, 20);
        add(label);

        addMouseListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the frame");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
