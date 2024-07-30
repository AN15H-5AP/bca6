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
import java.awt.*;
import java.awt.event.*;

class FontChangerExample extends JFrame implements ActionListener {
    JLabel label;
    JTextArea textArea;
    JButton changeFontButton;
    JComboBox<String> fontComboBox;

    public FontChangerExample() {
        setTitle("Font Changer Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Sample Text");
        label.setFont(new Font("Serif", Font.PLAIN, 20));
        add(label);

        textArea = new JTextArea("Sample Text", 5, 20);
        textArea.setFont(new Font("Serif", Font.PLAIN, 20));
        add(textArea);

        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontComboBox = new JComboBox<>(fonts);
        add(fontComboBox);

        changeFontButton = new JButton("Change Font");
        changeFontButton.addActionListener(this);
        add(changeFontButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedFont = (String) fontComboBox.getSelectedItem();
        Font newFont = new Font(selectedFont, Font.PLAIN, 20);

        label.setFont(newFont);
        textArea.setFont(newFont);
    }

    public static void main(String[] args) {
        new FontChangerExample();
    }
}
