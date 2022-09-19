package com.company.pract3;

public class MovablePoint implements Movable {
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    int x;
    int y;
    int xSpeed;
    int ySpeed;



    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}


    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
