package com.company.lab.lab5;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;

public class GUI2 extends JFrame {


    public GUI2() {
        super("Практическая 4 | Таблица результатов матчей");
        JFrame frame = new JFrame();
        try {
            String IMG_PATH;
            BufferedImage img;
            ImageIcon icon;
            JLabel label;
            Container container = this.getContentPane();


            while (true) {
                for (int i = 1; i < 10; i++) {
                    container.setLayout (new FlowLayout(FlowLayout.CENTER));

                    IMG_PATH = String.format("C:/Users/Corner/IdeaProjects/JavaLess/src/com/company/lab/lab5/anim/%d.png", i);
                    System.out.println(IMG_PATH);
                    img = ImageIO.read(new File(IMG_PATH));
                    icon = new ImageIcon(img);
                    label = new JLabel(icon);
                    frame.getContentPane().add(label,BorderLayout.CENTER);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    setVisible(true);
                    TimeUnit.SECONDS.sleep(1);
                    // this.dispose();

                    // https://www.youtube.com/watch?v=wI-qNBrtT3k
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();}

        setSize(400, 400);


    }
}