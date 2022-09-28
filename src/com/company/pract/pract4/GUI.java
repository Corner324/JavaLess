package com.company.pract.pract4;
import com.company.pract.SimpleGUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame
{
    static int scoreMilan = 0, scoreMadrid = 0;
    JPanel[] pnl = new JPanel[9];
    private JLabel label1= new JLabel(" Result: ");
    private JLabel label2 = new JLabel(" Last Scorer: N/A ");
    private JLabel label3 = new JLabel(" Winner: DRAW ");
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");


    public GUI()
    {
        super("Практическая 4 | Таблица результатов матчей");
        setLayout(new GridLayout(3,3));


        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        label1.setFont(new Font("Courier", Font.BOLD,27));
        label2.setFont(new Font("Courier", Font.ITALIC,16));
        label3.setFont(new Font("Courier", Font.ITALIC,16));

        pnl[1].add(label1);
        pnl[4].add(label2);
        pnl[4].add(label3);

        pnl[6].add(button1);
        pnl[8].add(button2);

        button1.addActionListener(new ButtonEventListener1());
        button2.addActionListener(new ButtonEventListener2());
        setSize(600,300);
        setResizable(false);


    }

    class ButtonEventListener1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            scoreMilan++;
            label1.setText(" Result: " + scoreMilan + " X " + scoreMadrid);
            label2.setText(" Last Scorer: AC Milan" );
            if (scoreMilan > scoreMadrid){
                label3.setText(" Winner: AC Milan " );
            }
        }
    }

    class ButtonEventListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            scoreMadrid++;
            label1.setText(" Result: " + scoreMilan + " X " + scoreMadrid);
            label2.setText(" Last Scorer: Real Madrid" );
            if (scoreMilan < scoreMadrid){
                label3.setText(" Winner: Real Madrid " );
            }
        }
    }
}