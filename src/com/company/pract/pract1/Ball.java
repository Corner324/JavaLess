package com.company.pract.pract1;

public class Ball {

    double x = 0.0;
    double y = 0.0;

    Ball(){}
    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }


    @Override
    public String toString(){
        return "Ball @ ("+this.x+","+this.y+").";
    }

}
