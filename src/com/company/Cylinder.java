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
        return (2 * Math.PI * base.radius * this.height) + (2 * Math.PI * Math.pow(base.radius, 2));
    }
}
