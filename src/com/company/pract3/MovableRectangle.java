package com.company.pract3;

public class MovableRectangle implements Movable{
    MovablePoint topLeft;
    MovablePoint bottomRight;
    int x1; int x2;
    int y1; int y2;
    int xSpeed; int ySpeed;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        checkSpeed(xSpeed,ySpeed);
    }

    private void checkSpeed(int x, int y){
        if (x != y)
            System.out.println("Скорость не совпадает!");
    }


    public void moveUp() {
        this.topLeft.y=this.topLeft.y + this.ySpeed;
        this.bottomRight.y=this.bottomRight.y + this.ySpeed;
    }

    public void moveDown() {
        this.topLeft.y=this.topLeft.y - this.ySpeed;
        this.bottomRight.y=this.bottomRight.y - this.ySpeed;
    }

    public void moveLeft() {
        this.topLeft.x=this.topLeft.x - this.xSpeed;
        this.bottomRight.x=this.bottomRight.x - this.xSpeed;
    }

    public void moveRight() {
        this.topLeft.x=this.topLeft.x + this.xSpeed;
        this.bottomRight.x=this.bottomRight.x + this.xSpeed;
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
