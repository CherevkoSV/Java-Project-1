package com.example.java_hw12_Collections2;

public class Quadratian extends Shape{
    double a, b;

    Quadratian(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getArea() {
        return a * b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "[Quadratian]: Area = " + getArea() + " Perimeter = " + getPerimeter();
    }
}
