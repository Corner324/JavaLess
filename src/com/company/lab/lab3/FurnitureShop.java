package com.company.lab.lab3;

public class FurnitureShop{

    Bed bad = new Bed("Red",2,30,15,320);
    Table table = new Table("Green",5,23,5,748);
    Wardrobe wardrobe = new Wardrobe("White",40,3,4,185);

    void sell(){
        System.out.println("1. КРОВАТЬ \n" + bad);
        System.out.println("2. СТОЛ \n" + table);
        System.out.println("3. ШКАФ \n" + wardrobe);


    }

}
