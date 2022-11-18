package com.company.lab.lab6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI3 extends JFrame
{
    int MAX = 20;
    int MIN = 0;
    static int attempts = 1;
    static int number = 0;
    private JButton button = new JButton("Угадай");
    private final JTextField input = new JTextField("",10);
    private final JLabel label = new JLabel("Попытка 1  ");

    public GUI3()
    {
        super("Игра-угадайка");

        button.setPreferredSize(new Dimension(200, 30));
        input.setPreferredSize(new Dimension(200, 30));
        label.setFont(new Font("Courier", Font.BOLD,14));
        input.setFont(new Font("Courier", Font.BOLD,12));

        number = (int)(Math.random()*((MAX-MIN)+1))+MIN;
        System.out.println(number);

        // Панель содержимого
        Container container = getContentPane();
        /*
         * Определение последовательного расположения
         * с выравниванием компонентов по центру
         */
        container.setLayout (new FlowLayout(FlowLayout.CENTER));
        // добавляем компоненты
        container.add(label);
        container.add(input);
        container.add(button);

        button.addActionListener(new ButtonEventListener1());

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (((dimension.getWidth() - this.getWidth()) / 2) - 280);
        int y = (int) (((dimension.getHeight() - this.getHeight()) / 2) - 130);
        this.setLocation(x, y);
        setSize(280,130);
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class ButtonEventListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (input.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null,"Впишите в поле выше число между 0 и 20", "Ошибка", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                if (attempts == 3) {
                    if (Integer.parseInt(input.getText()) != number) {
                        String messege = "Вы не угадали. Загадное число - " + number + "\nКоличество попыток закончилось. \n                     Игра проиграна. ";
                        JOptionPane.showMessageDialog(null, messege, "ПРОИГРЫШ", JOptionPane.PLAIN_MESSAGE);
                        input.setText("");
                        number = (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
                        System.out.println(number);
                        attempts = 0;
                    }
                }
                else if ((input.getText().equals("")) || (Integer.parseInt(input.getText()) == number) ) {
                    String messege2 = "Вы верно угадали число! ";
                    number = (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
                    System.out.println(number);
                    JOptionPane.showMessageDialog(null, messege2, "ПОБЕДА", JOptionPane.PLAIN_MESSAGE);
                    attempts = 1;
                } else {
                    String temp = null;
                    if((Integer.parseInt(input.getText()) > number)){ temp = "больше заданного"; }
                    if((Integer.parseInt(input.getText()) < number)){ temp = "меньше заданного"; }

                    String messege3 = "Ваше число " + temp;
                    JOptionPane.showMessageDialog(null, messege3, "Вы не угадали", JOptionPane.PLAIN_MESSAGE);
                    attempts++;
                    label.setText("Попытка " + attempts + "  ");

                }
            }
        }
    }


}
