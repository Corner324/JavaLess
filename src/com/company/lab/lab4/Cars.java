package com.company.lab.lab4;

public class Cars implements Nameable {
    Cars(String name){
        this.name=name;
    }
    String name;
    public String getName() {
        return this.name;
    }
}
