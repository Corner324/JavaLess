package com.company.lab.lab5;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.concurrent.TimeUnit;

public class GUI2 extends JFrame {

    public GUI2(String[] args) {
        super("Лабораторная 5 | Картинка");
        JFrame frame = new JFrame();

        try {

            String IMG_PATH = args[0];
            Container container = this.getContentPane();
            container.setLayout (new FlowLayout(FlowLayout.CENTER));

            System.out.println("* Путь к файлу - " + IMG_PATH);

            BufferedImage img = ImageIO.read(new File(IMG_PATH));
            int height = img.getHeight();
            int width = img.getWidth();
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            container.add(label);

            frame.setLocationRelativeTo(null);
            setVisible(true);
            setSize(width,height);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        } catch (IOException e) {
            e.printStackTrace();}

    }
}