package com.company;

public class Cylinder {
    private double radius;
    private Circle base;
    private double height;

    public Cylinder(double r, double h){
        radius = r;
        base = new Circle(r);
        height = h;
    }

    public double vol(){
        return this.base.area() * this.height;
    }

    public double sa(){
        return (2 * Math.PI * this.radius * this.height) + (2 * Math.PI * Math.pow(radius, 2));
    }
}
