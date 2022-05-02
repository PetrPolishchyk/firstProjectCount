package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input value:");
    private JRadioButton male = new JRadioButton("Male");
    private JRadioButton female = new JRadioButton("Female");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI(){
     super("Simple example");
     this.setBounds(100, 100, 250, 100);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     Container cont = this.getContentPane();
     cont.setLayout(new GridLayout(3,2,2,2));
     cont.add(label);
     cont.add(input);

     ButtonGroup group = new ButtonGroup();
     group.add(male);
     group.add(female);
     cont.add(male);
     male.setSelected(true);
     cont.add(female);
     cont.add(check);
     button.addActionListener(new ButtonEventListener());
     cont.add(button);
    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String message = "";
            message += "Button was pressed\n";
            message += "Text is " + input.getText() + "\n";
            message += (male.isSelected() ? "Male" : "Female") + "is selected\n";
            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
