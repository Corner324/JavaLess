package com.company;

public class Book {

    int page;
    String name;

    public Book(int page, String name) {
        this.page = page;
        this.name = name;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }


    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                ", name='" + name + '\'' +
                '}';
    }
}
