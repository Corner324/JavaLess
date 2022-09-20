package com.company.pract3;

public class MovableCircle implements Movable {
    public MovableCircle(int radius) {
        this.radius = radius;
    }

    int radius;
    MovablePoint center;

    public void moveUp(){
        this.center.y=this.center.y + this.center.ySpeed;
    }
    public void moveDown(){
        this.center.y=this.center.y - this.center.ySpeed;
    }
    public void moveLeft(){
        this.center.x=this.center.x - this.center.xSpeed;
    }
    public void moveRight(){
        this.center.x=this.center.x + this.center.xSpeed;
    }


}
