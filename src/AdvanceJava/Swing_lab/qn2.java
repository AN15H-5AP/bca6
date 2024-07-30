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

class FlagViewer extends JFrame implements ActionListener {
    private JButton germanyButton, japanButton;
    private JPanel flagPanel;

    public FlagViewer() {
        setTitle("Country Flags");
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        germanyButton = new JButton("Germany");
        japanButton = new JButton("Japan");

        buttonPanel.add(germanyButton);
        buttonPanel.add(japanButton);

        add(buttonPanel, BorderLayout.NORTH);

        flagPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };

        add(flagPanel, BorderLayout.CENTER);

        germanyButton.addActionListener(this);
        japanButton.addActionListener(this);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == germanyButton) {
            flagPanel = new GermanyFlag();
        } else if (e.getSource() == japanButton) {
            flagPanel = new JapanFlag();
        }
        add(flagPanel, BorderLayout.CENTER);
        flagPanel.repaint();
        revalidate();
    }

    class GermanyFlag extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();
            int stripeHeight = height / 3;

            g.setColor(Color.BLACK);
            g.fillRect(0, 0, width, stripeHeight);

            g.setColor(Color.RED);
            g.fillRect(0, stripeHeight, width, stripeHeight);

            g.setColor(Color.YELLOW);
            g.fillRect(0, 2 * stripeHeight, width, stripeHeight);
        }
    }

    class JapanFlag extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int width = getWidth();
            int height = getHeight();

            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);

            g.setColor(Color.RED);
            int diameter = Math.min(width, height) / 2;
            int x = (width - diameter) / 2;
            int y = (height - diameter) / 2;
            g.fillOval(x, y, diameter, diameter);
        }
    }

    public static void main(String[] args) {
        new FlagViewer();
    }
}
