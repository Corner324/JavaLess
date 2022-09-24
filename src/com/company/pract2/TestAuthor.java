package com.company.pract2;


public class TestAuthor{
    public static void main() {
        System.out.println("Class Author: ");

        Author auth = new Author("Mark","mark@gmail.com",'M');

        System.out.println(auth.getEmail());
        System.out.println(auth);
        System.out.println();

    }
}

