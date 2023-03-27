package com.example.java_hw7;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public boolean isEquilateralTriangle() {
        return getSide1() == getSide2() && getSide2() == getSide3();
    }
    public boolean isRightTriangle() {
        return getSide1()*getSide1() + getSide2()*getSide2() == getSide3()*getSide3();
    }
    public boolean isIsoscelesTriangle() {
        return getSide2() == getSide3();
    }
}
