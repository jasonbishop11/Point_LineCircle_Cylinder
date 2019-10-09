package com.company;

public class Circle {
    private double radius;

    public Circle(double r){
        radius = r;
    }

    public double area(){
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double circumference(){
        return 2 * this.radius * Math.PI;
    }
}
