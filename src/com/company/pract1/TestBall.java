package com.company.pract1;

public class TestBall {
    public static void main() {

        System.out.println("Class Ball: ");
        Ball ball1 = new Ball(11, 23);
        Ball ball2 = new Ball(14, 27);
        Ball ball3 = new Ball(76, 91);

        System.out.println(ball1.getX());
        ball3.setX(17);
        System.out.println(ball3);
        System.out.println();

    }
}
