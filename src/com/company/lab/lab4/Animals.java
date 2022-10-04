package com.company.lab.lab4;

public class Animals implements Nameable {
    Animals(String name){
        this.name=name;
    }
    String name;
    public String getName() {
        return this.name;
    }
}
