package com.company.lab.lab3;

public class Table extends Furniture{

    @Override
    void discounted(int discount){
        price = price - discount;
    }

    public Table(String color,
               int height,
               int length,
               int width,
               int price) {
        this.color = color;
        this.height = height;
        this.length = length;
        this.width = width;
        this.price = price;
    }



}
