package com.example.java_hw6;

public class Triangle {
    private double firstLength;
    private double secondLength;
    private double thirdLength;

    public double calculatePerimeter() {
        return firstLength + secondLength + thirdLength;
    }

    public double calculateSquare() {
        double a = firstLength;
        double b = secondLength;
        double c = thirdLength;

        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getFirstLength() {
        return firstLength;
    }

    public double getSecondLength() {
        return secondLength;
    }

    public double getThirdLength() {
        return thirdLength;
    }

    public Triangle(double firstLength, double secondLength, double thirdLength) {
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.thirdLength = thirdLength;
    }
}
