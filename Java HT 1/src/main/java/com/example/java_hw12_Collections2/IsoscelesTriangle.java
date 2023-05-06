package com.example.java_hw12_Collections2;

public class IsoscelesTriangle extends Triangle{
    IsoscelesTriangle(double a, double c) {
        super(a, a, c);
    }

    @Override
    public String toString() {
        return "[IsoscelesTriangle]: Area = " + getArea() + " Perimeter = " + getPerimeter();
    }
}
