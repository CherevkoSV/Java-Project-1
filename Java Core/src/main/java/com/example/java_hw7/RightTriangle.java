package com.example.java_hw7;

public class RightTriangle extends Triangle{
    public RightTriangle(double side1, double side2) {
        super(side1, side2, Math.sqrt(side1 * side1 + side2 * side2));
    }
}
