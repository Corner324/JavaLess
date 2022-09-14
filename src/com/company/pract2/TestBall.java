package com.company.pract2;

public class TestBall {
    public static void main(String[] args) {

        Ball ball = new Ball(32,24);

        System.out.println(ball);
        ball.move(23,11);
        System.out.println(ball);

    }
}
