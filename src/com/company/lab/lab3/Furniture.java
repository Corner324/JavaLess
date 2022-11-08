package com.company.lab.lab3;


/*
 Создать абстрактный класс, описывающий мебель. С помощью
наследования реализовать различные виды мебели. Также создать
класс FurnitureShop, моделирующий магазин мебели. Протестировать
работу классов
 */

abstract public class Furniture {

    String color;
    int height;
    int length;
    int width;
    int price;

    abstract void discounted(int discount);

    @Override
    public String toString(){
        return "Характеристки: \n" +
                " Высота - " + height +
                "\n Длина - " + length +
                "\n Ширина - " + width +
                "\n------------- " +
                "\nЦена: " + price + "\n";



    }
}
