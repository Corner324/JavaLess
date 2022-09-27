package com.company.pract.pract4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame{
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel(" Ваш адрес:");
    private JRadioButton radio1 = new JRadioButton("Select This");
    private JRadioButton radio2 = new JRadioButton("Select This2");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI(){
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2, 2, 2));
        container.add(label);
        container.add(input);

    ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String messege = "";
            messege += "Button was pressed\n";
            messege += "Text is " + input.getText() + "\n";
            messege += radio1.isSelected() ? "Radio #1" : "Radio #2" + "is selected! \n";
            messege += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null,messege, "output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
