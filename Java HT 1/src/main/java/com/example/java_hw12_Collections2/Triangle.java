package com.example.java_hw12_Collections2;

public class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "[Triangle]: Area = " + getArea() + " Perimeter = " + getPerimeter();
    }
}
