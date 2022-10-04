package com.company.lab.lab4;

public class TestNameable {

    public static void main(){

        Nameable car = new Cars("Racing car");
        Nameable planet = new Planets("Mars");
        Nameable animal = new Animals("Tiger");

        System.out.println(car.getName());
        System.out.println(planet.getName());
        System.out.println(animal.getName());


    }

}
