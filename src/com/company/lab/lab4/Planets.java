package com.company.lab.lab4;

public class Planets implements Nameable {
    Planets(String name){
        this.name=name;
    }
    String name;
    public String getName() {
        return this.name;
    }
}
