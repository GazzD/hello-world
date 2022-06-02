package com.ironhack.helloworld.classes;

public class Circle extends Shape {

    private final double PI = Math.PI;
    private double radius;

    public Circle(double width) {
        super(width, width);
        radius = width / 2;
    }

    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }
}
