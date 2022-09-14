package com.company;

public class Main extends Ball{

    public static void main(String[] args) {

	Ball ball = new Ball(20,30);
    System.out.println(ball);
    ball.move(30,15);
    System.out.println(ball);

    Book book = new Book(200,"War and peace");
    book.setPage(325);
    System.out.println(book.toString());

    TestDog.main(null);


    }
}
