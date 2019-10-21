package com.company;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(Circle c, double h){
        base = c;
        height = h;
    }

    public double vol(){
        return this.base.area() * this.height;
    }

    public double sa(){
        return ((base.circumference() * this.height) + base.area());
    }
}
