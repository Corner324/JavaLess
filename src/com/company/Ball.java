package com.company;
import java.lang.String;

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
    void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString(){
        return "Ball @ ("+this.x+","+this.y+").";
    }


}
