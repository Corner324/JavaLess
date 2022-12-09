package com.company.lab.lab8;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Реализовать запись в файл введённой с клавиатуры информации

public class FileTest {

    Scanner in = new Scanner(System.in);

    public void main()  {
        try (
                FileWriter writer = new FileWriter("C:\\Users\\Corner\\IdeaProjects\\JavaLess\\src\\com\\company\\lab\\lab8\\text.txt", true);
        ){

            // Получение строки
            System.out.print("Введите текст, который надо записать в файл:\n  ");
            String text = in.nextLine() + '\n';

            // Запись строки в файл
            writer.write(text);


        } catch (IOException e) {
            System.out.println("Ошибка открытия файла!");
        }
    }
}
