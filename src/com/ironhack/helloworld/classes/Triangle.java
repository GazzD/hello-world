package com.ironhack.helloworld.classes;

public class Triangle extends Shape {

    public Triangle(double width, double height) {
        super(width, height);
    }

    public double calculateArea() {
        return width * height / 2;
    }
}
