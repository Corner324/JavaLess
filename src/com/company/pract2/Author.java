package com.company.pract2;

public class Author {

    String name = "Mark";
    String email;
    char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;
    }

    char getGender(){
        return this.gender;
    }

    void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Name is " + name + " email is " + email + " and gender is " + gender;
    }
}
