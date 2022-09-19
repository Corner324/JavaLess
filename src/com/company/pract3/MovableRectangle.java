package com.company.pract3;

public class MovableRectangle implements Movable{

    MovablePoint topLeft;
    MovablePoint bottomRight;
    int x1; int x2;
    int y1; int y2;
    int xSpeed; int ySpeed;

    public void moveUp() {
    }

    public void moveDown() {
    }

    public void moveLeft() {
    }

    public void moveRight() {
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

}
