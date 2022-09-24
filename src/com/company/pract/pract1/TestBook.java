package com.company.pract.pract1;

public class TestBook {
    public static void main() {

        System.out.println("Class Book: ");
        Book book1 = new Book(23,"War and Peace");
        Book book2 = new Book(143,"Fairy tales");
        Book book3 = new Book(43,"Poetry");

        System.out.println(book1.getPage());
        System.out.println(book2);
        book3.setPage(198);
        System.out.println(book3);
        System.out.println();
    }
}
