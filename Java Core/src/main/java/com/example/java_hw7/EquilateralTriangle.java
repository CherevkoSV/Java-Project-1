package com.example.java_hw7;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * getSide1() * getSide1();
    }
}
