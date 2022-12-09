package com.company.lab.lab7;
import java.util.ArrayList;
import java.util.Collections;

// Протестировать работу коллекции ArrayList.

public class TestArrayList {

    ArrayList<Integer> list = new ArrayList<>();

    public void main(){

        // Добавление элемента в ArrayList
        System.out.println("* Добавление элементов 5 и 7");
        list.add(5);
        list.add(7);

        // Вывод содержимого ArrayList
        System.out.println("\nДанные списка:");
        for (Integer i  : list)
            System.out.println("  " + i);

        // Удаление элемента из ArrayList
        System.out.println("\n* Удаление элемента под индексом 0");
        list.remove(0);

        // Вывод содержимого ArrayList
        System.out.println("\n* Данные списка:");
        for (Integer i  : list)
            System.out.println("  " + i);

        System.out.println("\n* Добавление элементов 1, 3 и 8");
        list.add(1); list.add(3); list.add(8);

        // Сортировка списка
        System.out.println("* Сортировка элементов списка");
        Collections.sort(list);

        System.out.println("\n* Данные списка:");
        for (Integer i  : list)
            System.out.println("  " + i);

        // Очиска списка
        System.out.println("\n* Очистка списка");
        list.clear();

    }



}
