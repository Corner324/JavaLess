package com.company.lab.lab6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI3 extends JFrame
{
    static int attempts = 0;
    private JButton button = new JButton("Угадай");
    private final JTextField input = new JTextField("Какой-то текст",10);


    public GUI3()
    {
        super("Лабораторная 6 | Игра-угадайка");

        button.setPreferredSize(new Dimension(200, 30));
        input.setPreferredSize(new Dimension(200, 30));

        // Панель содержимого
        Container container = getContentPane();
        /*
         * Определение последовательного расположения
         * с выравниванием компонентов по центру
         */
        container.setLayout (new FlowLayout(FlowLayout.CENTER));
        // добавляем компоненты
        container.add(input);
        container.add(button);


        button.addActionListener(new ButtonEventListener1());


         setSize(280,130);
         setResizable(false);


    }


    class ButtonEventListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (attempts > 3) {
                String messege = "Количество попыток закончилось \n Вы проиграли. ";
                JOptionPane.showMessageDialog(null,messege, "output", JOptionPane.PLAIN_MESSAGE);
                attempts = 0;
            }
            /*
            label1.setText(" Result: " + scoreMilan + " X " + scoreMadrid);
            label2.setText(" Last Scorer: AC Milan" );
            if (scoreMilan > scoreMadrid){
                label3.setText(" Winner: AC Milan " );
            }

             */
        }
    }


}
