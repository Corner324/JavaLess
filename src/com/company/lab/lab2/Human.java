package com.company.lab.lab2;

public class Human {

    private String name;
    private int age;

    public class Head{
        static void look(){
            System.out.println("Смотрим");
        }
    }
    public class Leg{
        static void walk(){
            System.out.println("Идем");
        }
    }
    public class Hand{
        static void take(){
            System.out.println("Берем");
        }
    }
}
