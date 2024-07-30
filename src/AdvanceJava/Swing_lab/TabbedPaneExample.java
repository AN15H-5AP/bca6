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
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TabbedPaneExample extends JFrame {
    public TabbedPaneExample() {
        setTitle("JTabbedPane Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab 1: Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(new JButton("Button 1"));
        buttonPanel.add(new JButton("Button 2"));
        buttonPanel.add(new JButton("Button 3"));
        tabbedPane.addTab("Buttons", buttonPanel);

        // Tab 2: Checkboxes and Radio Buttons
        JPanel checkboxPanel = new JPanel();
        checkboxPanel.add(new JCheckBox("Checkbox 1"));
        checkboxPanel.add(new JCheckBox("Checkbox 2"));
        ButtonGroup group = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Radio 1"), rb2 = new JRadioButton("Radio 2");
        group.add(rb1); group.add(rb2);
        checkboxPanel.add(rb1); checkboxPanel.add(rb2);
        tabbedPane.addTab("Checkboxes", checkboxPanel);

        // Tab 3: Combo Box
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.add(new JComboBox<>(new String[]{"Item 1", "Item 2", "Item 3"}));
        tabbedPane.addTab("Combo Box", comboBoxPanel);

        // Tab 4: Table
        JPanel tablePanel = new JPanel(new BorderLayout());
        JTable table = new JTable(new DefaultTableModel(new Object[][]{
            {"Data 1", "Data 2", "Data 3"},
            {"Data 4", "Data 5", "Data 6"},
            {"Data 7", "Data 8", "Data 9"}
        }, new String[]{"Column 1", "Column 2", "Column 3"}));
        tablePanel.add(new JScrollPane(table), BorderLayout.CENTER);
        tabbedPane.addTab("Table", tablePanel);

        // Tab 5: Shapes
        JPanel shapePanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED); g.fillRect(50, 50, 100, 100);
                g.setColor(Color.BLUE); g.fillOval(200, 50, 100, 100);
                g.setColor(Color.GREEN); g.drawLine(50, 200, 150, 300);
            }
        };
        tabbedPane.addTab("Shapes", shapePanel);

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
